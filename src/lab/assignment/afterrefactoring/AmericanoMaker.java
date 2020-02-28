package lab.assignment.afterrefactoring;

public class AmericanoMaker extends CoffeeMakerTemplate {
    @Override
    protected void addIngredients() {
        System.out.println("Adding more hot water");
    }

    @Override
    protected void finalTouch() {
        System.out.println("Add sugar and cream");
    }
}
