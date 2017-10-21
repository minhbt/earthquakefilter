
/**
 * Write a description of MagnitudeFilter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MagnitudeFilter implements Filter {

    private double _minMag;
    private double _maxMag;
    
    public MagnitudeFilter(double minMag, double maxMag){
        _minMag= minMag;
        _maxMag= maxMag;
    }
    
    public boolean satisfies(QuakeEntry qe){
        double mag= qe.getMagnitude();
        return (mag>=_minMag && mag<=_maxMag);
    }
}
