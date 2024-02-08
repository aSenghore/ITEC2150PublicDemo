package InheritanceDemo;

public class Reptile extends Animal{

	private boolean hasFur;
	private boolean giveBirth;
	
	public Reptile() {
		super(true, 4, "Carnivore");
	}
	
	public Reptile(boolean hasFur, boolean giveBirth) {
		super(false,4,"Herbivore");
		this.hasFur = hasFur;
		this.giveBirth = giveBirth;
	}
	
	public void makeNoise() {
		super.makeNoise();
		System.out.println("Sssssss.");
	}
	
	public void eat() {
		super.eat();
		System.out.println("Gulp.");
	}
}
