package lab.assignment.beforerefactoring;

public class CoffeeMaker {

    public void prepareMochaCoffee(){
        boilWater();
        brewEspresso();
        addIngredientsForMocha();
        finalTouchForMocha();
        System.out.println(">>Serving coffee");
    }

    public void prepareCapuccinoCoffee(){
        boilWater();
        brewEspresso();
        addIngredientsForCapuccino();
        finalTouchForCapuccino();
        System.out.println(">>Serving coffee");
    }

    public void prepareAmericanoCoffee() {
        boilWater();
        brewEspresso();
        addIngredientsForAmericano();
        finalTouchForAmericano();
        System.out.println(">>Serving coffee");
    }

    private void boilWater() {
        System.out.println("Boiling water");
    }

    private void brewEspresso() {
        System.out.println("Brewing espresso");
    }

    private void addIngredientsForMocha(){
        System.out.println("Adding cocoa powder");
        System.out.println("Adding hot milk");
    }

    private void addIngredientsForCapuccino(){
        System.out.println("Add hot milk");
        System.out.println("Add cinnamon");
    }

    private void addIngredientsForAmericano() {
        System.out.println("Add more hot water");
    }

    private void finalTouchForMocha(){
        System.out.println("Adding sugar");
    }

    private void finalTouchForCapuccino(){
        System.out.println("Top with milk foam");
    }

    private void finalTouchForAmericano() { System.out.println("Add sugar and cream"); }
}
