package theDescentPackage;

import java.util.Scanner;

public class theDescent {

	@SuppressWarnings("resource")
	public static void main(String args[]) {
        Scanner in = new Scanner(System.in);

        // game loop
        while (true) {
            
            int maxHeight = 0, myPos = 0; 
            for (int i = 0; i < 8; i++) {
                int mountainH = in.nextInt();
                if(mountainH > maxHeight) {
                    maxHeight = mountainH;
                    myPos = i;
                }
            }
            System.out.println(myPos);
            
        }
    }

}
