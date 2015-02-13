/**
 * @author Bernardo Pla_3885008
 */
/**
 * Creates an Automobile Trip Planner to calculate the cost of fuel
 */
public class TripPlanner 
{
    // instance variables
    private int tripLength = 1537; // length of the trip in miles
    private int numPassengers = 4; // number of passengers in vehicle (includes driver)
    private double gasPrice = 3.69; // price of gas per gallon
    private double gasTank = 16.5; // size of gas tank in vehicle
    private double carMPG = 23; // fuel efficiency of vehicle
     
    
    /**
     * obtain the length in miles of the trip
     */

    public int gettripLength() 
    {
        return tripLength;
    }
    public int getnumPassengers()
    {
        return numPassengers;
    }
    public double getgasPrice()
    {
        return gasPrice;
    }
    public double getgasTank()
    {
        return gasTank;
    }
    public double getcarMPG()
    {
        return carMPG;
    }    
        
    /**
     * The following will calculate the number of tanks for the trip along with 
     * the total cost of gas and the trip cost per passenger
     */
    public double getTanks()
    {
        return tripLength / (carMPG * gasTank);
    }
    public double getCost()
    {
        return (tripLength / carMPG) * gasPrice;
    }
    public double getCostperPerson()
    {
        return getCost()/ numPassengers;
    }
    
    // set new fuel efficiency at 30 mpg
    public void setnewcarMPG(double newcarMPG)
    {
        this.carMPG = newcarMPG;
    }
    

    
}
