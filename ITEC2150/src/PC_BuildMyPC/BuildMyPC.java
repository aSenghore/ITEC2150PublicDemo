package PC_BuildMyPC;

public class BuildMyPC {
	public static void main(String[] args) {
		Dimension dimension = new Dimension(18.35,9.06,17.83);
		Resolution resolution = new Resolution(1080.0,1920.0);
		Monitor monitor = new Monitor("Acer", "LED Curved FHD FreeSync Premium Monitor - Black",resolution,31.5,165);
		Case pcCase = new Case("4000D AIRFLOW ATX MidTowerCase - Black","CORSAIR","Steel, Glass, Plastic",dimension);
		Motherboard motherboard = new Motherboard("ROG MAXIMUS Z790 HEROSKU:6523718","ATX","Socket LGA 1700","Windows 10, Windows 11 Home"
				,6,4,"128 GB");
		PC pc1 = new PC(monitor, pcCase, motherboard);
		pc1.pressPowerButton();
		System.out.println(pc1);
	}
}
