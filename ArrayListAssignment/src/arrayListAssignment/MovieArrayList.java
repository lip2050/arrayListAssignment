package arrayListAssignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class MovieArrayList {
	
	public static void main (String []args) {
		
		Scanner scan = new Scanner (System.in);
		ArrayList <String> movie = new ArrayList<String>();
		
		System.out.println("Enter your Favorite movies here please");
		
		while(true) {
			movie.add(scan.nextLine());
			String Exit = scan.next();
			
			
		
			if (Exit.equalsIgnoreCase("q")) {
				System.out.println("You get exited");
				System.out.println("This is the list of your favorite movies");
				Collections.sort(movie);
				System.out.println(movie.toString());
				break;	
			}
		}
		
		
	}

}
