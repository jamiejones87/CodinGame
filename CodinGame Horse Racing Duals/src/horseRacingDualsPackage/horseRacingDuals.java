package horseRacingDualsPackage;

import java.util.Arrays;
import java.util.Scanner;

public class horseRacingDuals {
	public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        
        int[] horseArray = new int[N];
        for (int i = 0; i < N; i++) {
            horseArray[i] = in.nextInt();
           //System.out.println(horseArray[i]);
        }
        Arrays.sort(horseArray);
        
        int[] closeArray = new int[N-1];
        for(int i=0; i< N-1; i++) {
            //System.out.println(horseArray[i]);
            closeArray[i] = horseArray[i+1] - horseArray[i];
            //System.out.println(closeArray[i]);
            
        }
        Arrays.sort(closeArray);

        in.close();
        System.out.println(closeArray[0]);
    }
}
