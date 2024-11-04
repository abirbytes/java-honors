public class PrintTest                                          	//OUTPUT
{
   	public static void main(String []args)
   	{
          	System.out.println("hello");                      	// Prints "hello"
          	System.out.println(" ");                          	// Prints a blank line

          	System.out.println("4");                          	// Prints "4"
          	System.out.println(4);                            	// Prints 4

          	System.out.println("12 + 3");                    	// Prints "12 + 3"
          	System.out.println(12 + 3);                       	// Prints 15

          	int num1, num2;
          	num1 = 3;
          	num2 = 4;
          	
          	String firstLine;
          	firstLine  = "first";
          	String secondLine = "second";
 
          	System.out.println(num1);                         	// Prints 3
          	System.out.println("num1");                       	// Prints "num1"
          	
          	System.out.println(num1 + num2);                 	// Prints 7 (3 + 4)
          	System.out.println(firstLine + secondLine);      	// Prints "firstsecond"
          	
          	System.out.println(firstLine + " " + secondLine);   // Prints "first second"
          	System.out.println(secondLine + " place");       	// Prints "second place"
 
          	System.out.println("234" + 9);                   	// Prints "2349" (String + integer)
          	System.out.println(firstLine + "54");            	// Prints "first54"
 
          	double decimal = 5.2, whole = 3;
          	System.out.println(decimal);                      	// Prints 5.2
          	System.out.println(whole);                        	// Prints 3
 
          	char letter = 'a';                                	   	   	
          	System.out.println("the letter is " + letter);   	// Prints "the letter is a"
 
          	boolean win = false;                              	
          	System.out.println(win);                          	// Prints false
   	}
}

