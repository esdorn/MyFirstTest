
/**
 * Write a description of class Pair here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Pair
{
    private int x;
    private int y;
    /**
     * Constructor for objects of class Pair
     */
    public Pair(int x, int y)
    {
        // initialise instance variables
        this.x = x;
        this.y = y;
    }
    
    public int getX()
    {
        return x;
    }
    
    public int getY()
    {
        return y;
    }
    
    public boolean equals(Pair pair)
    {
        return this.x==pair.x&&this.y==pair.y;
    }
}
