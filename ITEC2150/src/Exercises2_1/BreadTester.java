package Exercises2_1;
//all recipes are obtained from sallysbakingaddiction.com, and simplified by me.
public class BreadTester {
	public static void main(String[] args) {
		SandwichBread sandwich = new SandwichBread();
		sandwich.setRecipe("1 - Mix warm water, milk, yeast, and sugar together. Cover and let sit for 5 minutes."
				+ "\n2 - Add butter, salt, and 1 cup flour to mix. Mix for 30 seconds. Add remaining flour and beat for 2 minutes."
				+ "\n3 - Beat dough for an additional 5-8 minutes (Knead dough)."
				+ "\n4 - Lightly grease bowl. Place dough in bowl to coat with oil. Let sit for 1-2 hours (Rise)."
				+ "\n5 - Grease 9x5 inch loaf pan."
				+ "\n6 - Punch down dough to release air. Flour the surface and roll out into 8 inch log and place in pan."
				+ "\n7 - Cover load with foil. Allow to rise for about 1 hour."
				+ "\n8 - Adjust oven rack to low postition, and preheat oven to 350F."
				+ "\n9 - Bake the bread for 30-34 minutes."
				+ "\n10 - Remove from oven and allow to cool for a few minutes."
				+ "\n11 - Enjoy!");
		System.out.println(sandwich.getIngredients());
		System.out.println(sandwich);
		System.out.println(sandwich.bakeBread());
		System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------");
		
		BananaBread banana = new BananaBread();
		banana.setRecipe("1 -  Adjust oven rack to lower third position and preheat to 350 F. Grease a 9x5 inch loaf pan to set aside."
				+ "\n2 - Mix flour, baking sode, salt, and cinnamon together in a bowl."
				+ "\n3 - Beat butter and brown sugar together with mixer for 2 minutes. Slowly add eggs one at a time, then add yogurt, bananas, and vanilla."
				+ "\n4 - Slowly beat dry ingredients into the mix until there are no flour pockets. Add in nuts."
				+ "\n5 - Pour batter into baking pan. Bake for 60-65 minutes, and cover bread with foil halfway."
				+ "\n6 - Remove bread from oven and allow to cool for 1 hour."
				+ "\n7 - Enjoy!");
		System.out.println(banana.getIngredients());
		System.out.println(banana);
		System.out.println(banana.bakeBread());
		System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------");

		CinnamonBread cinnamon = new CinnamonBread();
		cinnamon.setRecipe("1 -  Preheat oven to 350 F. Grease a 9x5 inch loaf pan to set aside."
				+ "\n2 - (Cinnamon Swirl) Mix sugar and cinnamon together."
				+ "\n3 - Whisk flour, baking soda, and salt together in large bowl. Whisk egg and sugar in another bowl. Whisk oil, sour ceam, milk, and vanilla together. Pour wer ingredients into dry ingredients."
				+ "\n4 - Pour half batter into loaf pan. Sprinkle cinnamon swirl evenely on top (keep 2 teaspoons for topping). Spread remaining batter on top. Sprinkle remaining cinnamon."
				+ "\n5 - Bake for 50-65 minutes, and cover bread with foil halfway. Remove and cool for 1 hour."
				+ "\n6 - Drizzle with icing if desired."
				+ "\n7 - Enjoy!");
		System.out.println(cinnamon.getIngredients());
		System.out.println(cinnamon);
		System.out.println(cinnamon.bakeBread());
		System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------");

		CornBread corn = new CornBread();
		corn.setRecipe("1 -  Preheat oven to 400 F. Grease a 9 inch loaf pan to set aside."
				+ "\n2 - Whisk cornmeal, flour, baking powder and soda, and salt together. Mix butter, brown sugar, and honey into another bowl. Mix in egg, then buttermilk. Pour in all together and mix."
				+ "\n3 - Pour batter into pan. Bake for 20 minutes. Allow to cool before serving."
				+ "\n4 - Enjoy!");
		System.out.println(corn.getIngredients());
		System.out.println(corn);
		System.out.println(corn.bakeBread());
		System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------");

		PumpkinBread pumpkin = new PumpkinBread();
		pumpkin.setRecipe("1 -  Adjust rack to lower third position. Preheat oven to 350 F. Grease a 9x5 inch loaf pan to set aside."
				+ "\n2 - Whisk flour, baking soda, cinnamon, nutmeg, cloves, ginger, and salt. Mix eggs and sugar together. Mix pumpkin, oil, and juice together. Pour all together and mix. Add chocolate chips."
				+ "\n3 - Pour batter into pan. Bake for 60-65 minutes. Allow to cool before serving."
				+ "\n4 - Enjoy!");
		System.out.println(pumpkin.getIngredients());
		System.out.println(pumpkin);
		System.out.println(pumpkin.bakeBread());
		System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------");

	}
}
