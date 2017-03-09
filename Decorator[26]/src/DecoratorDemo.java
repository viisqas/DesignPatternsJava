/**
 * Created by viktoriya on 09.03.17.
 */
public class DecoratorDemo {
    public static void main(String[] args) {

        Recipe recipe = new FirstRecipe();

        Recipe firstRecipe = new GoRecipeProlong(new FirstRecipe());

        Recipe extendedRecipe = new GoRecipeProlong(new FirstRecipe());
        System.out.println("Recipe");
        recipe.give();

        System.out.println("\nRecipe was extended");
        extendedRecipe.give();

        System.out.println("\nSecond recipe was extended");
        firstRecipe.give();
    }
}