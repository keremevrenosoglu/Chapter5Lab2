
/**
 * Write a description of class Probability here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Probability implements ProbabilityCalc, Comparable<Proability>
{
    

    /**
     * Constructor for objects of class Probability
     */
    public Probability()
    {
       
    }

    public int compareTo(Probability p2) {
        if (this.prob == p2.prob){
       return 0; 
    }
    else if(this.prob > p2.prob) {
        return 1;
    }
    else {
        return -1;
    }
}
}