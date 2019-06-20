package defibrillatorsPackage;

import java.util.Scanner;

public class defibrillators {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        String LON = in.next();
        String LAT = in.next();
        double myLonA = Double.parseDouble(LON.replace(",","."));
		double myLatA = Double.parseDouble(LAT.replace(",","."));
        int N = in.nextInt();
        if (in.hasNextLine()) {
            in.nextLine();
        }
        
        double myClosest = 6371*6371;
        String myAnswer = "";        
        for (int x = 0; x < N; x++) {
            String myInput = in.nextLine();
            
            int[] mySeparator = new int[6];
	    	mySeparator[5] = myInput.length(); 
	    	int myPos = 0;
	    	for(int i=0; i<mySeparator[5]; i++) {
	    		if(myInput.charAt(i) == ';') {
	    			mySeparator[myPos] = i;
	    			myPos++;
	    		}
	    	}
		    String myLocation = myInput.substring(mySeparator[0]+1,mySeparator[1]);
		    String myLongitude = myInput.substring(mySeparator[3]+1,mySeparator[4]);
		    String myLatitude = myInput.substring(mySeparator[4]+1,mySeparator[5]);
		    double myLonB = Double.parseDouble(myLongitude.replace(",","."));
		    double myLatB = Double.parseDouble(myLatitude.replace(",","."));
            
            double myX = (myLonB-myLonA)*Math.cos((myLatA+myLatB)/2);
		    double myY = (myLatB-myLatA);
		    double myD = Math.sqrt((myX*myX)+(myY*myY)) * 6371;
		    
		    if(myD<myClosest) {
		        myClosest = myD;
		        myAnswer = myLocation;
		    }
        }
        
        in.close();
        System.out.println(myAnswer);
    }

}
