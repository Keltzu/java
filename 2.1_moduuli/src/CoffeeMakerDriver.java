public class CoffeeMakerDriver {
    public static void main(String[] args) {
        CoffeeMaker coffeeMaker = new CoffeeMaker();

        coffeeMaker.powerOn();
        System.out.println(coffeeMaker.getStatus());

        coffeeMaker.setCoffeeType("espresso");
        coffeeMaker.setCoffeeAmount(50);
        System.out.println(coffeeMaker.getStatus());

        coffeeMaker.powerOff();
        System.out.println(coffeeMaker.getStatus());
    }
}
