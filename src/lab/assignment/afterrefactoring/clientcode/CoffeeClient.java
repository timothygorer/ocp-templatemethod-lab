package lab.assignment.afterrefactoring.clientcode;

import lab.assignment.afterrefactoring.AmericanoMaker;
import lab.assignment.afterrefactoring.CoffeeMakerTemplate;
import lab.assignment.afterrefactoring.CappucinoMaker;
import lab.assignment.afterrefactoring.MochaMaker;

public class CoffeeClient {

    public static void main(String[] args) {
        CoffeeMakerTemplate starbuzz = new CappucinoMaker();

        // using template method
        starbuzz.prepareCoffee();

        System.out.println("********************");

        starbuzz = new MochaMaker();

        // using template method
        starbuzz.prepareCoffee();

        System.out.println("********************");

        starbuzz = new AmericanoMaker();

        // using template method
        starbuzz.prepareCoffee();
    }
}
