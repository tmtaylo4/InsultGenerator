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


public class List2Reader {

	public static String main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String myfile2 = "data2.txt";
		BufferedReader abc2 = new BufferedReader(new FileReader(myfile2));
		ArrayList<String> List2 = new ArrayList<String>();
		String s2;
		while((s2=abc2.readLine())!=null) {
		    List2.add(s2);
		    //System.out.println(s2);
		}
		//System.out.println("List 2 has been processed.");
		abc2.close();
		return List2.get(getRandom(List2.size()));
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
