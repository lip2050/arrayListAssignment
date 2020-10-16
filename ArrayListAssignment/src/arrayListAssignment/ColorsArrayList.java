package arrayListAssignment;

import java.util.ArrayList;
import java.util.Scanner;

public class ColorsArrayList {
	
	public static void main (String []args) {
		ArrayList <String> colors = new ArrayList<String>();
		 
		 colors.add("Blue");
		 colors.add("Orange");
		 colors.add("Green");
		
		for(String list : colors)
		{
			System.out.println(list);
		}
		
		System.out.println();
		System.out.println(colors.get(1));
		
		Scanner scan = new Scanner (System.in);
		
		
		while(true) {
			colors.add(scan.nextLine());
			String Exit = scan.next();
			
			
		
			if (Exit.equalsIgnoreCase("q")) {
				System.out.println("You get exited");
				System.out.println(colors.toString());
				
				
			}
		}
		
		
	}
	
}	

