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

import java.io.IOException;
import java.io.FileWriter;
import java.io.PrintWriter;

public class Test {

	private static String insult = null;


	public static String main(String[] args) {
		// TODO Auto-generated method stub

	
		try {
			insult = (List1Reader.main(args)  + " "  + List2Reader.main(args)  + " " +List3Reader.main(args));
			System.out.println(insult);
			writeToFile(insult);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return insult;
	
	}


public static void writeToFile(String textLine) throws IOException{
	String insult = textLine;
	FileWriter write = new FileWriter("history.txt",true);
	PrintWriter print_line = new PrintWriter(write);
	print_line.printf("%n" + insult);
	print_line.close();
}

		
}

