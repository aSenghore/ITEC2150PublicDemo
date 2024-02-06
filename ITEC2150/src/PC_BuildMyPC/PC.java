package PC_BuildMyPC;

public class PC {
	private Monitor monitor;
	private Case pcCase;
	private Motherboard motherboard;
	
	public PC(Monitor monitor, Case pcCase, Motherboard motherboard) {
		this.monitor = monitor;
		this.pcCase = pcCase;
		this.motherboard = motherboard;
	}

	public Monitor getMonitor() {
		return monitor;
	}

	public void setMonitor(Monitor monitor) {
		this.monitor = monitor;
	}

	public Case getPcCase() {
		return pcCase;
	}

	public void setPcCase(Case pcCase) {
		this.pcCase = pcCase;
	}

	public Motherboard getMotherboard() {
		return motherboard;
	}

	public void setMotherboard(Motherboard motherboard) {
		this.motherboard = motherboard;
	}
	
	public void pressPowerButton() {
		System.out.println("PC Class - Pressing power button...");
		System.out.println("-------------------------------------------");
	}
	
	public String toString() {
		return "My PC configurations" + "\n-------------------------------------------" + "\n" + this.monitor + this.pcCase + "\n" + this.motherboard;
				
	}
	
	
	
}
