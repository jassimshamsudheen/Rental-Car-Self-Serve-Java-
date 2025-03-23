public class ElectricCar extends Car { // Represent an electric car in the rental system
    // this is a subclass extended from Cars and added a battery capacatiy as attribute
    private int batteryCapacity;  // Indicate whether the car is electric with battery

    public ElectricCar (String brand, String model, double rentalPrice, int batteryCapacity ){
        super(brand, model, rentalPrice);// calling the car constructor 
        this.batteryCapacity = batteryCapacity; // Initializing the battery feature 
    }

    public String getbatteryCapacity(){ // getter with a return message including the power of the battery 
        return "Battery Capacity: "+ batteryCapacity + " " + "kWh";
    }

    @Override //overrides string method to string() from Car to include turbo feature into the string method
    public String toString() {
        return getbrand() + getmodel() + getrentalprice()+  getbatteryCapacity() ; // return string representation of electric cars
        
    }
    
}
