package InheritanceDemo;

public class Mammal extends Animal{
	
	private boolean hasFur;
	private boolean giveBirth;

	public Mammal() {
		super(false,2,"Omnivore");
	}
	
	public Mammal(boolean hasFur, boolean giveBirth) {
		super(false,2,"Carnivore");
		this.hasFur = hasFur;
		this.giveBirth = giveBirth;
	}
	
	public void makeNoise() {
		super.makeNoise();
		System.out.println("Meow.");
	}
	
	public void eat() {
		super.eat();
		System.out.println("Yum.");
	}
}
