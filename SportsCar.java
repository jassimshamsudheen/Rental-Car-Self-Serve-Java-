public class SportsCar extends Car { // represents sports cars in rental cars 
    // thsi is also a subclass extrende from Cars with an added attritbute of has turbo
    private boolean hasTurbo; // Indicate whether the car has turbo
    // Constructor for sports car
    public SportsCar (String brand, String model, double rentalPrice, boolean hasTurbo ){
        super(brand, model, rentalPrice); // calling the car constructor 
        this.hasTurbo = hasTurbo; // initializing the turbo feature
    }

    public String gethasTurbo(){ // check if car has turbo
        if (hasTurbo){ // if true returin yes
            return "Turbo: Yes " ;}
        else
        {return "Turbo: No" ;} //if false return No
    }

    @Override // overrides string method to string() from Car to include turbo feature into the string method
    public String toString() {
        return getbrand() + getmodel() + getrentalprice()+  gethasTurbo() ; // return string representation of sports cars
        
    }
    
}
