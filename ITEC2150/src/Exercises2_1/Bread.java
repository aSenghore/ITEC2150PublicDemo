package Exercises2_1;

public class Bread {

	private String flour;
	private String water;
	private String salt;
	private String sugar;
	private String bakingPowder;
	private String yeast;
	private String breadName;
	private String state;
	private String recipe;
	
	public Bread() {
		this.flour = "3 and 1/3 cups flour";
		this.water = "1 cup water";
		this.salt = "1 and 1/2 teaspoons salt";
		this.sugar = "2 tablespoons sugar";
		this.bakingPowder = "no baking powder";
		this.yeast = "2 and 1/4 teaspoons yeast";
		this.breadName = "Bread";
		this.state = "Not Baked";
		this.recipe = "Empty Recipe";
	}
	
	public Bread(String flour, String water, String salt, String sugar, String bakingPowder, String yeast, String breadName, String state, String recipe) {
		this.flour = flour;
		this.water = water;
		this.salt = salt;
		this.sugar = sugar;
		this.bakingPowder = bakingPowder;
		this.yeast = yeast;
		this.breadName = breadName;
		this.state = state;
		this.recipe = recipe;
	}

	public String getFlour() {
		return flour;
	}

	public void setFlour(String flour) {
		this.flour = flour;
	}

	public String getWater() {
		return water;
	}

	public void setWater(String water) {
		this.water = water;
	}

	public String getSalt() {
		return salt;
	}

	public void setSalt(String salt) {
		this.salt = salt;
	}

	public String getSugar() {
		return sugar;
	}

	public void setSugar(String sugar) {
		this.sugar = sugar;
	}

	public String getBakingPowder() {
		return bakingPowder;
	}

	public void setBakingPowder(String bakingPowder) {
		this.bakingPowder = bakingPowder;
	}

	public String getYeast() {
		return yeast;
	}

	public void setYeast(String yeast) {
		this.yeast = yeast;
	}

	public String getBreadName() {
		return breadName;
	}

	public void setBreadName(String breadName) {
		this.breadName = breadName;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getRecipe() {
		return recipe;
	}

	public void setRecipe(String recipe) {
		this.recipe = recipe;
	}
	
	public String bakeBread(){
		if (this.state == "Baked"){
			return "Already baked.";
		}
		else {
			this.state = "Baked";
			return "Baking bread..." + this.breadName + " baked!\n";
		}
	}
	
	public String getIngredients() {
		return "Ingredients for " + getBreadName() + "\n" + getFlour() + "\n" 
	+ getWater() + "\n" + getSalt() + "\n" + getSugar() + "\n" + getYeast() + "\n" + getBakingPowder();
	}
	
	

	
	
}
