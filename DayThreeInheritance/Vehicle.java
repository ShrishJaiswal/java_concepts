package DayThreeInheritance;
public class Vehicle {

    String brand;
    String model;
    int year;
    double rentalPrice;

    public Vehicle(){}

    Vehicle(String brand, String model, int year, double rentalPrice){
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.rentalPrice = rentalPrice;
    }

    public void vehicleDetails(){
        System.out.println("Brand is "+brand+" model is "+model+" year manufactued is "+year+" rentalPrice is "+rentalPrice);
    }

    public String toString() {
        return brand+" "+model+" "+year+" "+rentalPrice;
    }

}
