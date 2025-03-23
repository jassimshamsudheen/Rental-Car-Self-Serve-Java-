// This is a base class for all types of cars , represents general cars in rental system
// it contains attributes like brand , model and rental price  per day
public class Car implements Rentalavailable { 
    private String brand;  // the brand of the car eg: toyota , mercedes
    private String model; // the model of the car eg : corolla, g class
    private double rentalPrice; // the price per day for this car

    public Car (String brand, String model, double rentalPrice){ // the constructor initializes the
        // car object with the brand model adn rental price
        this.brand = brand; // brand of the car
        this.model = model; // model of the car
        this.rentalPrice = rentalPrice; // price per day of the car
    }

    // getters 
    public String getbrand (){  // gets the brand of the car , 
        return "Brand: "+ brand+ " " ; // return brand as a string 
    }
    public String getmodel (){  // gets the model of the car
        return "Model: " + model + " " ; // return model as string 
    }
    public String getrentalprice (){ // gets the price of the car per day 
        return "Rental price/day: $ " +  rentalPrice + " " ; // return the price as string 
    }

    public double getrentalpriceonly(){ // gets the price of the car per day 
        return rentalPrice; // return the price as double 
    }

    
    public String toString(){ // returns a formatted string containing the car's model brand and price per day
        return (getbrand() +  getmodel() +getrentalprice() );

    }

    @Override // Override method to implement the interface the rental available to return the total price for the duration
    public double TotalRentalprice(int days){
        return (getrentalpriceonly()) * days;
    }
}