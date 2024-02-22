package Exercises2_1;

public class BananaBread extends Bread{

	private String recipe;
	
	//ingredients are replaced with the appropriate ingredient
	//example: recipe asks for ground cinnamon, no water
	//water = "ground cinnamon"
	//last variable (yeast) shows all extra ingredients
	
	public BananaBread() {
		super("2 cups flour","1/2 teaspoon ground cinnamon","1 and 1/4 teaspoons salt","3/4 tablespoons brown sugar","1 teaspoon baking soda", "2 large eggs\n"
				+ "1/3 cup yogurt\n2 cups mashed bananas\n1 teaspoon vanilla extract\n3/4 cup chopped pecans or walnuts",
				"Banana Bread", "Baked",null);
	}
	
	public BananaBread(String flour, String water, String salt, String sugar, String bakingPowder, String yeast, String breadName, String state, String recipe) {
		super("2 cups flour","1/2 teaspoon ground cinnamon","1 and 1/4 teaspoons salt","3/4 tablespoons brown sugar","1 teaspoon baking soda", "2 large eggs\n"
				+ "1/3 cup yogurt\n2 cups mashed bananas\n1 teaspoon vanilla extract\n3/4 cup chopped pecans or walnuts",
				"Banana Bread", "Baked",null);
	}
	public BananaBread(String recipe) {

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
