class Car {
    private double gasolineTankCapacity;
    private double speed;
    private boolean cruiseControlOn;
    private double targetSpeed;
    private static final double MIN_CRUISE_SPEED = 30.0;
    private static final double MAX_CRUISE_SPEED = 200.0;

    // Konstruktori
    public Car(double gasolineTankCapacity, double speed) {
        this.gasolineTankCapacity = gasolineTankCapacity;
        this.speed = speed;
        this.cruiseControlOn = false;
        this.targetSpeed = speed;
    }

    public void setTargetSpeed(double targetSpeed) {
        if (targetSpeed >= MIN_CRUISE_SPEED && targetSpeed <= MAX_CRUISE_SPEED) {
            this.targetSpeed = targetSpeed;
        }
    }

    public boolean turnOnCruiseControl() {
        if (targetSpeed >= MIN_CRUISE_SPEED && targetSpeed <= MAX_CRUISE_SPEED) {
            cruiseControlOn = true;
            adjustSpeed();
            return true;
        }
        cruiseControlOn = false;
        return false;
    }

    public void turnOffCruiseControl() {
        cruiseControlOn = false;
    }

    private void adjustSpeed() {
        if (cruiseControlOn) {
            speed = targetSpeed;
        }
    }

    public void displayCarInfo() {
        System.out.println("Gasoline Tank Capacity: " + gasolineTankCapacity + " liters");
        System.out.println("Current Speed: " + speed + " km/h");
        System.out.println("Cruise Control: " + (cruiseControlOn ? "On (Target: " + targetSpeed + " km/h)" : "Off"));
    }
}

