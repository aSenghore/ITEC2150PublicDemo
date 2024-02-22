package Exercises2_1;

public class CinnamonBread extends Bread{
	
	private String recipe;
	
	//ingredients are replaced with the appropriate ingredient
	//example: recipe asks for ground cinnamon, no water
	//water = "ground cinnamon"
	//last variable (yeast) shows all extra ingredients
	
	public CinnamonBread() {
		super("2 cups flour","1/2 teaspoon ground cinnamon","1 and 1/2 teaspoons salt","3/4 tablespoons sugar","1 teaspoon baking soda", "1 large egg\n"
				+ "1/3 cup vegetable oil\n1/3 cup sour cream,\n1 and 1/2 teaspoon vanilla extract\n2/3 cup milk\n1/2 cup sugar(cinnamon swirl)"
				+ "\n1 tablespoon cinnamon(cinnamon swirl)","Cinnamon Bread", "Not Baked",null);
	}
	
	public CinnamonBread(String flour, String water, String salt, String sugar, String bakingPowder, String yeast, String breadName, String state, String recipe) {
		super("2 cups flour","1/2 teaspoon ground cinnamon","1 and 1/2 teaspoons salt","3/4 tablespoons sugar","1 teaspoon baking soda", "1 large egg\n"
				+ "1/3 cup vegetable oil\n1/3 cup sour cream,\n1 and 1/2 teaspoon vanilla extract\n2/3 cup milk\n1/2 cup sugar(cinnamon swirl)"
				+ "\n1 tablespoon cinnamon(cinnamon swirl)","Cinnamon Bread", "Not Baked",null);
	}
	public CinnamonBread(String recipe) {

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
