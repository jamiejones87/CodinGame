package shadowsOfTheKnightPackage;

import java.util.Scanner;

public class shadowsOfTheKnight {

	@SuppressWarnings({ "resource", "unused" })
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        int W = in.nextInt(); // width of the building.
        int H = in.nextInt(); // height of the building.
        int N = in.nextInt(); // maximum number of turns before game over.
        int X0 = in.nextInt();
        int Y0 = in.nextInt();
        
        int minX = 0, minY = 0, maxX = W, maxY = H;

        // game loop
        while (true) {
            String bombDir = in.next(); // the direction of the bombs from batman's current location (U, UR, R, DR, D, DL, L or UL)
            char char1 = bombDir.charAt(0);
            char char2 = 'x';
            if(bombDir.length() == 2) char2 = bombDir.charAt(1);
            
            if(char1 == 'U') {
            	maxY = Y0;
            	Y0 = (int) Math.floor((Y0-minY)/2) + minY;
            }
            if(char1 == 'D') {
            	minY = Y0;
            	Y0 += (int) Math.ceil((maxY-Y0)/2);
            }
            if((char1 == 'L')||(char2 == 'L')) {
            	maxX = X0;
            	X0 = (int) Math.floor((X0-minX)/2) + minX;
            }
            if((char1 == 'R')||(char2 == 'R')) {
            	minX = X0;
            	X0 += (int) Math.ceil((maxX-X0)/2);
            }
            
            System.out.println(X0 + " " + Y0);
        }

	}

}
