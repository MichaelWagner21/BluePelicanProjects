public class GasMileage {
    public static void main(String[] args){
        //Create a new object called myBmw. Pass the constructor an 
        //argument of 24 miles per gallon 
        Automobile myBmw = new Automobile(24); 
        //Use the myBmw object to call the fillup method. Pass it an argument 
        //of 20 gallons. 
        myBmw.fillUp(20); 
        //Use the myBmw object to call the takeTrip method. Pass it an 
        //argument of 100 miles. Driving 100 miles of course uses fuel and we 
        //would now find less fuel in the tank.
        myBmw.takeTrip(100); 
        //Use the myBmw object to call the reportFuel method. It returns a 
        //double value of the amount of gas left in the tank and this is assigned 
        // to the variable fuel_left
        double fuel_left = myBmw.reportFuel( ); 
        //Print the fuel_left variable 
        System.out.println(fuel_left); //prints gallons left, 15.833333333333332
    }
}

class Automobile {
    private int gasMileage;
    private double gallons;
    public Automobile(int inputMileage){
        gasMileage = inputMileage;
        gallons = 0;
    }
    public void takeTrip(int inputMiles){
        gallons-=(double)inputMiles/gasMileage;
    }
    public void fillUp(int inputGallons){
        gallons+=(double)inputGallons;
    }
    public double reportFuel(){
        return this.gallons;
    }
}