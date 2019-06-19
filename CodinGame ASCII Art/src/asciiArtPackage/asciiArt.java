package asciiArtPackage;

import java.util.Scanner;

public class asciiArt {
	public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int L = in.nextInt();  // the width of a letter represented in ASCII art. All letters are the same width.
        int H = in.nextInt();  // the height of a letter represented in ASCII art. All letters are the same height.
        if (in.hasNextLine()) {
            in.nextLine();
        }
        String T = in.nextLine();
        
        for (int i = 0; i < H; i++) {
            String ROW = in.nextLine();
            String myAnswer = "";
            
            for(int n=0; n<T.length(); n++)
            {
                char myChar = T.charAt(n);
                int myPos = 26;
                if((myChar>=65) && (myChar<=90)) {
                    myPos = (int) myChar-65;
                }
                else if((myChar>=97) && (myChar<=122)) {
                    myPos = (int) myChar-97;
                }    
                
                int myStart = L * myPos;
                int myEnd = myStart + L;
                myAnswer += ROW.substring(myStart, myEnd);
            }
            
            System.out.println(myAnswer);
        }
        
        in.close();
    }

}
