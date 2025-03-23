import java.util.ArrayList;
import java.util.Scanner;

/// Read Me first 
/*  Car Rental System - Jassim's Car Rental - Problem Description:
 Jassim's Car Rental is a new friendly rental car business with a mix of rental cars from economy cars 
 to sports cars available for the community in Scarborough. They were in great need of a rental system 
 for the customers to self-checkout. This program simulates a car rental system where users can view available.
 Cars, select a car they like to rent, enter the rental duration, calculate the total rental cost and generate the receipt.
 The goal is to provide a user-friendly rental experience while applying Java OOP concepts.

*/

public class CarRentalTester { // Main tester class 
    // the program allow users to rent cars from a  list of available cars
    // users can select a car , specify rental days and view the total rental cost
    public static void main(String[] args) {

        // method allows you to display available cars, allow user to select a car
        // calculate the total rental price accordign to the duration user chose
        // finally print a reciept to pay 

        System.out.println("*****Welcome to Jassim's Car Rental*****\n"); // welcoming message to users
        Car c1 = new Car("BMW", "x5", 250); // creating car object for the rental system to be added to Array list
        // System.out.println(c1);

        ElectricCar e1 = new ElectricCar("Tesla", "Model S", 110, 500); // creating another car object for the rental system to be added to Array list
        // System.out.println(e1);

        SportsCar s1 = new SportsCar("Ferrari", "Enzo", 550, true); // creating another car object for the rental system to be added to Array list
        // System.out.println(s1);

        Car c2 = new Car("Toyota", "Corolla", 57); //creating another car object for the rental system to be added to Array list

        ArrayList <Car> Cars = new ArrayList<>(); // creating a array list to store the above created car objects

        // storing all available cars in an Arraylist
        Cars.add(e1); 
        Cars.add(c1);
        Cars.add(c2);
        Cars.add(s1);

        // Asking user if they like to rent a car
        Scanner scan = new Scanner(System.in);
        System.out.println("Would you like to rent a car today [Yes/No]: ");
        String torent = scan.next();
        if (torent.equals("Yes") || torent.equals("yes")){
        
        // Displaying available cars for selection
        System.out.println("Select a car you like to rent: \n\n1. Tesla Model 5 (Electric)\n2. BMW X5 \n3. Toyota Corolla\n4. Ferrari Enzo (Sports) \n");
        int cartorent = scan.nextInt();
        if (cartorent <= Cars.size()){ // creating an if statement to exit the wrong selection 
        System.out.println("Enter the number of days you like to rent: ");  // Asking user about the duration in days like to rent
        int days = scan.nextInt();
        Car chosecar = Cars.get(cartorent-1); // Getting rental days and calculating the total price
        System.out.println("Price for preferred car for " + days +  " days is $ " +chosecar.TotalRentalprice(days));
        // Asking user if they would liek to genreate a reciept
        System.out.println("Would you like to proceed and generate the reciept to pay [Yes/No]: ");
        String reciept = scan.next(); // creating a reciept that shows total and details of the chosen car
        if (reciept.equals("Yes")|| reciept.equals("yes")){System.out.println("\n\n\n*** Jays Rental Pre Reciept***\n\n"+ chosecar.getbrand() + 
        "\n"+ chosecar.getmodel()+ "\n"+chosecar.getrentalprice() + "\n"+ "Total Price to be paid at checkout "+"for "+ days+ " days"+ " $ "+ chosecar.TotalRentalprice(days)+"\n\n"+"Thank you for Renting your Ride at Jassim's Rentals - Drive Safe \n \n");}
        
    }else{System.out.println("Have a great Day ahead! \nThank you for visiting Jassim's Car Rental ");}}
    // exit statement for wrong selection of the car
    else {System.out.println("Have a great Day ahead! \nThank you for visiting Jassim's Car Rental ");}
    // exit statement for wrong selection of the decision
}
}
