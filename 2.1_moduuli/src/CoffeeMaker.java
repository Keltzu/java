import java.util.Scanner;

class CoffeeMaker {
    private boolean isOn;
    private String coffeeType;
    private int coffeeAmount;
    private static final int MIN_AMOUNT = 10;
    private static final int MAX_AMOUNT = 80;

    // Konstruktori
    public CoffeeMaker() {
        this.isOn = false;
        this.coffeeType = "normal";
        this.coffeeAmount = MIN_AMOUNT;
    }

    public void powerOn() {
        isOn = true;
    }

    public void powerOff() {
        isOn = false;
    }

    public void setCoffeeType(String type) {
        if (isOn && (type.equals("normal") || type.equals("espresso"))) {
            this.coffeeType = type;
        }
    }

    public void setCoffeeAmount(int amount) {
        if (isOn && amount >= MIN_AMOUNT && amount <= MAX_AMOUNT) {
            this.coffeeAmount = amount;
        }
    }

    public String getStatus() {
        return (isOn ? "Coffee maker is on\nCoffee type is " + coffeeType + "\nCoffee amount is " + coffeeAmount + " ml" : "Coffee maker is off");
    }
}

