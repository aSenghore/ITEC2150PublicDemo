package Game;

import java.util.ArrayList;
import java.util.Scanner;
public class GameUI {
    public static void main(String[] args) {

        GameUI gu = new GameUI();
		ISavable k1 = new King("Radagon of the Golden Order",2,"one at a time in any direction","White");
		ISavable q1 = new Queen("Rennala of the Full Moon",2,"any direction as far as possible","Black");

        saveObject(k1);
        saveObject(q1);

        //basic loading
        if (gu.compare(k1,q1) == -1)
            System.out.println("Queen wins");
        else if(gu.compare(k1,q1) == 1){
            System.out.println("King wins");
        }
        else System.out.println("Drew");

    }

    public int compare(ISavable isa, ISavable isb){
        if (isa instanceof IComparableCharacter && isb instanceof IComparableCharacter) {
            int pointsA = ((IComparableCharacter)isa).getPoints();
            int pointsB = ((IComparableCharacter)isb).getPoints();
            return Integer.compare(pointsA, pointsB);
        }
        throw new RuntimeException("Objects do not support comparison");
    }



    public static void saveObject(ISavable isobj){
       //use a for loop to iterate data by index value
        for(int i = 0; i < isobj.write().size(); i++) {
            System.out.println(isobj.write().get(i));
        }
    }

    public static  ArrayList<String>  readValues(){
        ArrayList<String> values = new ArrayList<String>();
        Scanner scanner = new Scanner(System.in);
        //1 or 0  .. 1 is for entering some string value 0 for exit
        System.out.println("Choose 1 to enter a string or 0 to quit");

        //another sub instruction to choose option
        int choice = scanner.nextInt();

        while(choice != 0) {
            System.out.println("Choose 1 to enter a string or 0 to quit");
            choice = scanner.nextInt();
            scanner.nextLine(); // consume newline left-over
            if(choice == 1) {
                System.out.println("Enter a string:");
                String stringInput = scanner.nextLine();
                values.add(stringInput);
            }
        }

        return values;
    }

    /**
     * loading method is going to call readValues()
     * then, call/invoke read(List<String> listOfSavedValues);
     * @param isobj
     */
    public static void loading(ISavable isobj){
      ArrayList<String> chris =   readValues();
      isobj.read(chris);
    }
}
