package Exercises2_1;

public class PumpkinBread extends Bread{

	private String recipe;
	
	//ingredients are replaced with the appropriate ingredient
	//example: recipe asks for ground cinnamon, no water
	//water = "ground cinnamon"
	//last variable (yeast) shows all extra ingredients
	
	public PumpkinBread() {
		super("1 and 3/4 cups flour","1 teaspoon baking soda","3/4 teaspoon salt","1/2 cup sugar, 3/4 cup brown sugar","1 teaspoon baking powder", "2 large eggs\n"
				+ "2 teaspoons ground cinnamon\n1/4 teaspoon ground nutmeg\n1/3 teaspoon ground cloves\n1/4 teaspoon ground ginger"
				+ "\n1 and 1\2 cups pumpkin puree\n1/2 cup vegetable oil\n1/4 cup orange juice\n2/3 cup chocolate chips","Pumpkin Bread", "Not Baked",null);
	}
	
	public PumpkinBread(String flour, String water, String salt, String sugar, String bakingPowder, String yeast, String breadName, String state, String recipe) {
		super("1 and 3/4 cups flour","1 teaspoon baking soda","3/4 teaspoon salt","1/2 cup sugar, 3/4 cup brown sugar","1 teaspoon baking powder", "2 large eggs\n"
				+ "2 teaspoons ground cinnamon\n1/4 teaspoon ground nutmeg\n1/3 teaspoon ground cloves\n1/4 teaspoon ground ginger"
				+ "\n1 and 1\2 cups pumpkin puree\n1/2 cup vegetable oil\n1/4 cup orange juice\n2/3 cup chocolate chips","Pumpkin Bread", "Not Baked",null);
	}
	public PumpkinBread(String recipe) {

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
