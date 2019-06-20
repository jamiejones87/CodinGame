package mimeTypePackage;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class mimeType {
	public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt(); // Number of elements which make up the association table.
        int Q = in.nextInt(); // Number Q of file names to be analyzed.
        
        //HashMap<String,String> myMap = new HashMap<>();
        Map<String,String> myMap = new TreeMap<>(String.CASE_INSENSITIVE_ORDER);
        for (int i = 0; i < N; i++) {
            String EXT = in.next(); // file extension
            String MT = in.next(); // MIME type.
            myMap.put(EXT,MT);
        }
        in.nextLine();
        for (int i = 0; i < Q; i++) {
            String FNAME = in.nextLine(); // One file name per line.
            String myFiletype = getFiletype(FNAME);
            if(myFiletype.length()!=0) {
                String myFile = myMap.get(myFiletype);
                if(myFile == null) System.out.println("UNKNOWN");
			    else System.out.println(myFile);
	    	}
		    else {
		        System.out.println("UNKNOWN");
		    }
        }
        in.close();
    }
    
    public static String getFiletype(String myString) {
		int myLength = myString.length();
		
		// Gets the last position of a dot
		int dotPos = -1;
		for(int i=0; i<myLength; i++) {
			if(myString.charAt(i) == '.') dotPos = i;
		}
		
		// Substring from the dot
		String myAnswer = "";
		if(dotPos != -1) myAnswer = myString.substring(dotPos+1,myLength);

		return myAnswer;
	}
}
