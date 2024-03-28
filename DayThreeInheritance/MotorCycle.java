package DayThreeInheritance;

public class MotorCycle extends Vehicle{

    int engineCapacity;

    MotorCycle(String brand, String model, int year, double rentalPrice, int engineCapacity){
        super(brand, model, year, rentalPrice);
        this.engineCapacity = engineCapacity;
    }


    public int getEngineCapacity(){
        return this.engineCapacity;
    }

}
