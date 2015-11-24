
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
import java.util.ArrayList;
import java.util.Random;

public class List1Reader {

		// TODO Auto-generated method stub
	
			public static String main(String[] args) throws Exception {
				// TODO Auto-generated method stub
				String myfile = "data1.txt";
				BufferedReader abc = new BufferedReader(new FileReader(myfile));
				ArrayList<String> List1 = new ArrayList<String>();
				String s1;
				while((s1=abc.readLine())!=null) {
				    List1.add(s1);
				    //System.out.println(s1);
				}
				abc.close();	
				return List1.get(getRandom(List1.size()));
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

		
				
			

		


