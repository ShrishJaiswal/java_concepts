package DayThreeInheritance;

public class VehicleMain {

    public static void main(String[] args){
        Car carObj = new Car("Honda","City", 2022, 120.0, 4);
        MotorCycle motorCycleObj = new MotorCycle("Kawasaki", "Ninja", 2020, 300.0, 700);

        carObj.vehicleDetails();
        System.out.println("Number of seats are "+carObj.getNumberOfSeats());

        motorCycleObj.vehicleDetails();
        System.out.println("Engine Capacity is "+motorCycleObj.getEngineCapacity());

    }

}
