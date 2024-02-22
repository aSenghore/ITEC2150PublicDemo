package Exercises2_1;

public class CornBread extends Bread{

	private String recipe;
	
	//ingredients are replaced with the appropriate ingredient
	//example: recipe asks for ground cinnamon, no water
	//water = "ground cinnamon"
	//last variable (yeast) shows all extra ingredients
	
	public CornBread() {
		super("1 cup flour","1/2 teaspoon baking soda","1/8 teaspoon salt","1/3 cup sugar","1 teaspoon baking powder", "1 large egg\n"
				+ "2 tablespoons honey\n1 cup fine cornmeal\n1/2 cup butter\n1 cup buttermilk","Cornbread", "Baked",null);
	}
	
	public CornBread(String flour, String water, String salt, String sugar, String bakingPowder, String yeast, String breadName, String state, String recipe) {
		super("1 cup flour","1/2 teaspoon baking soda","1/8 teaspoon salt","1/3 cup sugar","1 teaspoon baking powder", "1 large egg\n"
				+ "2 tablespoons honey\n1 cup fine cornmeal\n1/2 cup butter\n1 cup buttermilk","Cornbread", "Baked",null);
	}
	public CornBread(String recipe) {

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
