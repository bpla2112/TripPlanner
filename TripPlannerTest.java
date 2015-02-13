/**
 *
 * @author bernardopla
 */
public class TripPlannerTest {
    
    public static void main(String[] args) 
    {
        TripPlanner tripA = new TripPlanner();
        
        System.out.println(" Length of the trip: " + tripA.gettripLength() + " miles");
        System.out.println(" Number of Passengers: " + tripA.getnumPassengers() + " passengers");
        System.out.println(" Capacity of tank: " + tripA.getgasTank() + " gallons");
        System.out.println(" Fuel Efficiency: " + tripA.getcarMPG() + " miles per gallon");
        System.out.println(" Price per gallon of gas: $" + tripA.getgasPrice());
        
        System.out.println("\n Total tanks for trip:" + tripA.getTanks() + " tanks");
        System.out.println(" Total cost of trip: $" + tripA.getCost());
        System.out.println(" Cost per person: $" + tripA.getCostperPerson());
        
        tripA.setnewcarMPG(30);
        
        System.out.println("\n New Fuel Efficiency:" + tripA.getcarMPG() + " miles per gallon");
        
        System.out.println("\n Total tanks for trip:" + tripA.getTanks() + " tanks");
        System.out.println(" Total cost of trip: $" + tripA.getCost());
        System.out.println(" Cost per person: $" + tripA.getCostperPerson());
    }
    
}
