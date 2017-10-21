
/**
 * Write a description of PhraseFilter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PhraseFilter implements Filter {
    private String _where;
    private String  _phrase;
    
    public PhraseFilter(String where, String phrase){
        _where= where;
        _phrase= phrase;
    }
    
    public boolean satisfies(QuakeEntry qe){
        String title= qe.getInfo();
        _where= _where.toLowerCase();
            if(title.indexOf(_where)<0){
                switch(_where){
                    case "start":
                        if(title.substring(0,_phrase.length()).equals(_phrase)){
                           return true;
                        }
                        break;
                    case "end":
                        if(title.length()>_phrase.length()){
                            if(title.substring(title.length()-_phrase.length(),title.length()).equals(_phrase)){
                              return true;
                            }
                        }
                        break;
                    case "any":
                        if (title.contains(_phrase)){
                            return true;
                        }
                        break;
                  }
       
            }
     return false;
    }
}