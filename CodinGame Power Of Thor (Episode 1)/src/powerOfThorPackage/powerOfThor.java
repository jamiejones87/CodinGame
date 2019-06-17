package powerOfThorPackage;

import java.util.Scanner;

public class powerOfThor {

	@SuppressWarnings({ "resource", "unused" })
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        int lightX = in.nextInt(); // the X position of the light of power
        int lightY = in.nextInt(); // the Y position of the light of power
        int initialTX = in.nextInt(); // Thor's starting X position
        int initialTY = in.nextInt(); // Thor's starting Y position

        // game loop
        int offsetX = lightX - initialTX;
        int offsetY = lightY - initialTY;
        while (true) {
            int remainingTurns = in.nextInt(); // The remaining amount of turns Thor can move. Do not remove this line.

            String myString = "";
            if(offsetY>0) { myString += "S"; offsetY--; }
            else if(offsetY<0) { myString += "N"; offsetY++; }
            if(offsetX>0) { myString += "E"; offsetX--; }
            else if(offsetX<0) { myString += "W"; offsetX++; }
            System.out.println(myString);
        }

	}

}
