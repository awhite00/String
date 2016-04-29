import java.util.Scanner;
public class Challenges
	{

		public static void main(String[] args)
			{
			//printstring1();
			//printstring2();
			printstring3();
			}
		public static void printstring1()
		{
			Scanner userInput=new Scanner(System.in);
		    System.out.println("Shout something at me!");
		    String shout=userInput.nextLine();
		    System.out.println(shout.substring(0, 1).toUpperCase()+shout.substring(1).toLowerCase());
		}
		
		public static void printstring2()
			{
				Scanner userInput=new Scanner(System.in);
			    System.out.println("Type something please!");
			    String vertical=userInput.nextLine();
			    for(int i=0; i<vertical.length(); i++)
			    	{
			    		System.out.println(vertical.substring(i,i+1));
			    	}
			   
			}
		public static void printstring3()
		{
			Scanner userInput=new Scanner(System.in);
		    System.out.println("Type a sentence.");
		    String sentence=userInput.nextLine();
		    int counter=0;
		    for (int i=0; i<sentence.length(); i++ )
		    	{
		    		switch (sentence.substring(i,i+1))
		    		{
		    			case "a":
		    			case "e":
		    			case "i":
		    			case "o":
		    			case "u":
		    			case "A":
		    			case "E":
		    			case "I":
		    			case "O":
		    			case "U":
		    			
		    		
		    				counter++;
		    			
		    		}
		    	}
		    System.out.println("The number of vowles is " +counter);
		}
	}
