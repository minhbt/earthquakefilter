
/**
 * Write a description of DepthFilter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DepthFilter implements Filter {
    private double _mindepth;
    private double _maxdepth;
    
    public DepthFilter(double mindepth, double maxdepth){
        _mindepth= mindepth;
        _maxdepth= maxdepth;
    }
    
    public boolean satisfies(QuakeEntry qe){
        double depth= qe.getDepth();
        return (depth>=_mindepth && depth<=_maxdepth);
    }
}
