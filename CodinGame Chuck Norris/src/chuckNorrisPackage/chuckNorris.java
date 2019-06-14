package chuckNorrisPackage;

import java.util.Scanner;

public class chuckNorris {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String myInput = scn.nextLine();
		scn.close();
		
		// Create binary string for input
		String myBinary = "", myTemp = "";
		for(int i=0; i<myInput.length(); i++) {
			myTemp = Integer.toBinaryString(myInput.charAt(i));
			while(myTemp.length() < 7) {
				myTemp = "0" + myTemp;
			}
            myBinary += myTemp;
		}
		
		// Convert binary string to Chuck Norris code
		String myAnswer = "";
		char myCurrent = 'x';
		for(int x=0; x<myBinary.length(); x++) {
            if(myCurrent == myBinary.charAt(x)) {
            	myAnswer += '0';
            	myCurrent = myBinary.charAt(x);
            }
            else {
            	myCurrent = myBinary.charAt(x);
            	if(myCurrent == '0') myAnswer += " 00 0";
            	else myAnswer += " 0 0";
            }
		}
		myAnswer = myAnswer.substring(1, myAnswer.length());
		System.out.println(myAnswer);
	}

}
