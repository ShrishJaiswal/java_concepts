package DayThreeInheritance;

public class Car extends Vehicle{

     int numberOfSeats;

    Car(String brand, String model, int year, double rentalPrice, int numberOfSeats){
        super(brand, model, year, rentalPrice);
        this.numberOfSeats = numberOfSeats;
    }

     public int getNumberOfSeats(){
        return this.numberOfSeats;
     }
    
}
