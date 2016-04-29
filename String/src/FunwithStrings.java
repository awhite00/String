import java.util.Scanner;
public class FunwithStrings
	{

		public static void main(String[] args)
			{
				printstring1();
				printstring2();
				printstring3();
				

			}
		public static void printstring1()
		{
			  
			Scanner userInput=new Scanner(System.in);
			    System.out.println("What is your name?");
			    String name=userInput.nextLine();
			    System.out.println("Cool, "+ name + " Nice to meet you!");
		}
		public static void printstring2()
		{
			Scanner userInput=new Scanner(System.in);
		    System.out.println("Please type a complete sentence with at least five words, but do not add punctuation!");
		    String sentence=userInput.nextLine();
		    System.out.println("The number of characters is " + sentence.length());
		   sentence=sentence.replace(" ","");
		    System.out.println(sentence);
		    System.out.println("The number of letters is " + sentence.length());
		    
		    int vowelCounter=0;
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
		    			
		    		
		    				vowelCounter++;
		    			
		    		}
		    	}
		    System.out.println("The number of vowles is " +vowelCounter);
		    int consonants = sentence.length()-vowelCounter;
		    System.out.println("The number of consonants is "+ consonants);
		}
		public static void printstring3()
		{
			String sentence="Mullen High School";
			 
				for(int i=0; i<sentence.length(); i++)
			    	{
			    		System.out.println(sentence.substring(0,i+1));
			    	
			    	}
			   
		}

	}
