package PC_BuildMyPC;
/*
 * ASUS - ROG MAXIMUS Z790 HERO (Socket LGA 1700) USB 3.2 Intel Motherboard
 * Model:ROG MAXIMUS Z790 HEROSKU:6523718
 * Form Factor: ATX
 * Processor Socket: Socket LGA 1700
 * Operating System Compatibility: Windows 10, Windows 11 Home
 * Number Of PCI Slots: 6
 * Number Of Memory Slots: 4
 * Maximum Memory Supported: 128 GB
 */
public class Motherboard {
	
	private String model;
	private String form;
	private String processor;
	private String os;
	private int PCI;
	private int memSlots;
	private String memSize;

	public Motherboard(String model, String form, String processor, String os, int pCI, int memSlots, String memSize) {
		super();
		this.model = model;
		this.form = form;
		this.processor = processor;
		this.os = os;
		PCI = pCI;
		this.memSlots = memSlots;
		this.memSize = memSize;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getForm() {
		return form;
	}

	public void setForm(String form) {
		this.form = form;
	}

	public String getProcessor() {
		return processor;
	}

	public void setProcessor(String processor) {
		this.processor = processor;
	}

	public String getOs() {
		return os;
	}

	public void setOs(String os) {
		this.os = os;
	}

	public int getPCI() {
		return PCI;
	}

	public void setPCI(int pCI) {
		PCI = pCI;
	}

	public int getMemSlots() {
		return memSlots;
	}

	public void setMemSlots(int memSlots) {
		this.memSlots = memSlots;
	}

	public String getMemSize() {
		return memSize;
	}

	public void setMemSize(String memSize) {
		this.memSize = memSize;
	}

	@Override
	public String toString() {
		return "Motherboard" + "\nModel: " + this.model + "\nForm:" + this.form + "\nProcessor: " + this.processor + "\nOS: " + this.os
				+ "\nPCI:" + this.PCI + "\nMemory Slots: " + this.memSlots + "\nMemory Size" + this.memSize;
	}
	
	
	
}
