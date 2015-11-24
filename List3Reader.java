/*
 * CS633 Boston University
 * Insult Generator
 * 2015 - Copyright and All Rights Reserved
 * _______________________________________________________________________________
 * 11/13/2015	-	Initial Creation	-	Thor Taylor
 * 
 * 
 * 
 * _______________________________________________________________________________
 */


package InsultGenerator;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;


public class List3Reader {

	public static String main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String myfile3 = "data3.txt";
		BufferedReader abc3 = new BufferedReader(new FileReader(myfile3));
		ArrayList<String> List3 = new ArrayList<String>();
		String s3;
		while((s3=abc3.readLine())!=null) {
		    List3.add(s3);
		    //System.out.println(s3);
		}
		//System.out.println("List 3 has been processed.");
		abc3.close();
		int size = List3.size();
		return(List3.get(getRandom(size)));

	}
	
public static int getRandom(int max){	
		
		int maximum = max;
		int randomNum;
		 
		Random rn = new Random();
		randomNum = rn.nextInt(maximum);
		//System.out.println(randomNum);
		return randomNum;
	}

}
