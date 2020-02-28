package lab.assignment.afterrefactoring;

public class MochaMaker extends CoffeeMakerTemplate {
    @Override
    protected void addIngredients() {
        System.out.println("Add hot milk");
        System.out.println("Add cinnamon");
    }

    @Override
    protected void finalTouch() {
        System.out.println("Top with milk foam");
    }
}
