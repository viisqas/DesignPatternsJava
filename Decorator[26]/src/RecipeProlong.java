/**
 * Created by viktoriya on 09.03.17.
 */
public abstract class RecipeProlong implements Recipe {
    protected Recipe prolongRecipe;

    public RecipeProlong(Recipe prolongRecipe){
        this.prolongRecipe = prolongRecipe;
    }

    public void give(){
        prolongRecipe.give();
    }
}
