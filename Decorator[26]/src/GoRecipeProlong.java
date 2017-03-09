/**
 * Created by viktoriya on 09.03.17.
 */
public class GoRecipeProlong extends RecipeProlong {

    public GoRecipeProlong(Recipe prolongReciepe) {
        super(prolongReciepe);
    }

    @Override
    public void give() {
        prolongRecipe.give();
        setProlongRecipe(prolongRecipe);
    }

    private void setProlongRecipe(Recipe prolongRecipe){
        System.out.println("The recipe is extended");
    }
}
