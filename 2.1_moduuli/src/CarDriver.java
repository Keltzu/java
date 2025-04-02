public class CarDriver {
    public static void main(String[] args) {
        Car car = new Car(60.0, 80.0);

        System.out.println("Initial Car State:");
        car.displayCarInfo();

        car.setTargetSpeed(100.0);
        if (car.turnOnCruiseControl()) {
            System.out.println("Cruise control activated.");
        } else {
            System.out.println("Cruise control could not be activated.");
        }
        car.displayCarInfo();

        car.turnOffCruiseControl();
        System.out.println("Cruise control deactivated.");
        car.displayCarInfo();
    }
}
