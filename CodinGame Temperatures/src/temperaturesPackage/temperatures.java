package temperaturesPackage;

import java.util.Scanner;

public class temperatures {

	@SuppressWarnings("resource")
	public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(); // the number of temperatures to analyse
        int[] t = new int[n];
        boolean[] isNeg = new boolean[n];
        int myLowest = 5526;
        boolean myBool = false;
        for (int i = 0; i < n; i++) {
            t[i] = in.nextInt(); // a temperature expressed as an integer ranging from -273 to 5526
            if(t[i]<0) {
                isNeg[i] = true;
                t[i] *= -1;
            }
            if(t[i]<myLowest) {
                myLowest = t[i];
                myBool = isNeg[i];
            }
            if((t[i] == myLowest)&&(!isNeg[i])) myBool = false;
        }

        // Write an action using System.out.println()
        // To debug: System.err.println("Debug messages...");
        if(myBool) myLowest *= -1;
        if(n == 0) myLowest = 0;
        System.out.println(myLowest);
    }

}
