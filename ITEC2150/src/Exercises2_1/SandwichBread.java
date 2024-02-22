package Exercises2_1;

public class SandwichBread extends Bread{

	private String recipe;
	
	public SandwichBread() {
		super("3 and 1/3 cups flour","1 cup water","1 and 1/2 teaspoons salt","2 tablespoons sugar","no baking powder", "2 and 1/4 teaspoons yeast",
				"Sandwich Bread", "Not Baked",null);
	}
	
	public SandwichBread(String flour, String water, String salt, String sugar, String bakingPowder, String yeast, String breadName, String state, String recipe) {
		super("3 and 1/3 cups flour","1 cup water","1 and 1/2 teaspoons salt","2 tablespoons sugar","no baking powder", "2 and 1/4 teaspoons yeast",
				"Sandwich Bread", "Not Baked",null);
	}
	public SandwichBread(String recipe) {

		this.recipe = recipe;
	}

	public String getRecipe() {
		return recipe;
	}

	public void setRecipe(String recipe) {
		this.recipe = recipe;
	}

	public String toString() {
		return "\nRecipe" + "\n" + this.recipe + "\n";
	}
}
