package uk.ac.mmu.cnt.one;

	import java.io.BufferedReader;
	import java.io.IOException;
	import java.io.InputStreamReader;
	
public class Area {

	public static void main(String[] args) throws IOException{
		
		//declare some variables
		
		double height;
		double width;
		double area;
		
		
		String heightStr;
		String widthStr;
		
		
		//set up a reader form the console window
		BufferedReader console =
				new BufferedReader (new InputStreamReader(System.in));
		
		//read in values interactively from the command line
		System.out.println("Please enter a value for the height: ");
		heightStr = console.readLine();
	    height = Double.parseDouble(heightStr);
		
		System.out.println("Please enter a value for the width: ");
		widthStr = console.readLine();
		width = Double.parseDouble(widthStr);
		
		
		//for debugging we want to display our values to make sure everything is ok
		System.out.println("We have: ");
		System.out.println("Height value = " + height);
		System.out.println("Width value = " + width);
		
		
		//Calculate our resistor value
		area = height * width;
		
		//Display  the value
		System.out.println("The area of the wall is " + area + " Metres");
				

	}

}
