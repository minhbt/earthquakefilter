
/**
 * Write a description of DistanceFilter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DistanceFilter implements Filter {
    private Location _loc;
    private float _distance;
    
    public DistanceFilter(Location loc, float distance){
        _loc= loc;
        _distance= distance;
    }
    
    public boolean satisfies(QuakeEntry qe){
        Location loc= qe.getLocation();
        float temdistance= loc.distanceTo(_loc);
        return (loc.distanceTo(_loc)<=_distance);
    }
    
}