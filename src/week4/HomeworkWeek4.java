package week4;

public class HomeworkWeek4 {
	public static void main(String[] args) {

		
		
 willCookRice (-1);

		// TODO Auto-generated method stub


// *1 1. Create an array of int called ages that contains the following values: 3, 9, 23, 64, 2, 8, 28, 93.
        int [] ages= {3, 9, 23, 64, 2, 8, 28, 93};

      // a. Programmatically subtract the value of the first element 
	  // in the array from the value in the last element of the array 
      // (i.e. do not use ages[7] in your code). Print the result to the console.  
		int firstElement = ages [0];
		int lastElement = ages [ages.length - 1]; 
		int difference = lastElement - firstElement;
		System.out.println ("The difference between the first and the last element in the ages array is: "+ difference);


	// Programmatically subtract the value of the first element in the array 
	//from the value in the last element of the array. Print the result to the console.
	int difference1 = ages [ages.length -1] - ages [0];
	System.out.println ("The difference between the first and last element of the array is: " + difference1);

	// Create a new array with 9 elements, one more than the ages array.
	// Repeat the step above to ensure it works for arrays of different lengths.

 int[] newAges = new int[9];	       
 difference1 = newAges[0] - newAges[newAges.length - 1];
 System.out.println("The difference between the first and last element of the new array is: " + difference1);

	// Use a loop to iterate through array and calculate average age. Print the result to the console.
		        int sum = 0;
		        for (int age : ages) {
		            sum += age;
		        }
		        float averageAge = sum / ages.length;
		        System.out.println("The average age is: " + averageAge);


	// Prompt #2

     String [] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};

     int  totalLetters = 0;
     String names0 = "";
	
     for (int i = 0; i <  names.length; i ++)
     {
    	 totalLetters = totalLetters + names[i].length();
         names0 = names0 + names [i] + " ";
     }

     //2a
     double averageLetters = (double)totalLetters / (double)names.length;
     
     System.out.println ("The Average number of letters per name is:" + averageLetters);
System.out.println (names0);
     //2B


      // Test of methods:
System.out.println ("Methods Tested:");

     // Question No. 7 
System.out.println ("prompt 7: " + repeatTheWordNTimes ("Yey", 4));

     // Question No. 8 
System.out.println ("prompt 8: " + getFullName ("Juanita", "Banana"));
    
     //Question No. 9
System.out.println ("prompt 9: " + isSumGreaterThan100 (ages));

     //Question No. 10
 double [] ages1 = {3, 9, 23, 64, 2, 8, 28, 93};
 //System.out.printlf("%.2f", findAverage (ages));
 System.out.println("prompt 10: " + average (ages1));
 
    //Question No. 11
 
    
// 3) How do you access the last element of an array in java?
// To get the last element, you can access it using the index array.length - 1.
// BY Subtracting 1 from the length of an array gives the index of the last element of an array using which the last element 
 //can be accessed. That been said, array [array.lenght - 1]
//
//
// 4) How do you access the first element of any array?
// To get the first element OF AN ARRAY you can access it using index 0. Meaning: array[0];


//5)Create a new array of int called nameLengths. Write a loop to iterate over 
// the previously created names array and add the length of each name to the nameLengths array.
int [] nameLengths = new int [names.length];
for (int i = 0; i < nameLengths.length; i ++)
{
	 nameLengths [i] = names [i].length();
}

// 6) Write a loop to iterate over the nameLengths array & calculate the sum of all the elements in the array.
// Print the result to console.

    int sumOfNameLengths = 0;
    for (int individualLength : nameLengths)
    {
    sumOfNameLengths += individualLength;
    }
    System.out.println ("Sum of all elements:" + sumOfNameLengths);
	
	
    System.out.println(repeatTheWordNTimes("Merlin", 4));

    
	
	
	}

// 7) Write a method that takes a String, word, and an int, n, as arguments and returns the word concatntd
// to itself n number of times. (i.e. if I pass in “Hello” and 3, I expect the method to return “HelloHelloHello”).
	public static String repeatTheWordNTimes (String word, int n)
	{
		String result = "";
		for (int i = 0; i < n; i ++)
		{
			result += word; 
		}
		return result; 	
		
	} 
  
// 8) Write a method that takes two Strings, firstName and lastName, and returns a full name 
//(the full name should be the first and the last name as a String separated by a space). 
	public static String getFullName (String firstName, String lastName) {
	return firstName + " " + lastName;
	}
	String fullName = getFullName("John", "Doe");
 
	
// 9)Write a method that takes an array of int & returns true if the sum of all the ints in array is 
//greater than 100.
	public static boolean isSumGreaterThan100 (int[] array) {
	int sum = 0;
	for(int currentListNum : array){System.out.print(currentListNum + " ");};
	for (int num : array) { 
		System.out.println ("current number : " + num);
	sum = sum + num;
	System.out.println ("current sum : " + sum);
	}
	return sum > 100;
	}

 // 10)Write a method that takes an array of double & returns the average of all the elements in array.
	public static double average (double[] array) {
	double sum = 0;
	for (double number : array) {
	sum += number;
	}
	return sum / array.length;
	}
	
// 11) Write a method that takes two arrays of double and returns true if the average of the elements in 
// the first array is greater than the average of the elements in the second array.
	public static boolean ifFirstArrayGreater (double []a, double []b) 
	{
		double AverageA= average (a);
	    double AverageB= average (b);
		if (AverageA > AverageB)
		return true;
		return false;
		}
	
// 12) Write a method called willBuyDrink that takes a boolean isHotOutside, & a double moneyInPocket, &
// returns true if it is hot outside and if moneyInPocket is greater than 10.50.

   public static boolean willBuyDrink (boolean isHotOutside, double moneyInPocket) {
	return (isHotOutside || moneyInPocket > 10.50);
	
	
}
   
   
   
   
// 13) Create a method of your own that solves a problem. In comments, write what the method does and why you created it.
   
//Write a method that for every ounce of of rice will tell you how many ml of water it will need for 250 ml 
// of water per ounce.

public static void willCookRice (int ounceOfRice) {  
	int waterNeeded = ounceOfRice * 250;
	System.out.println ("you need " + waterNeeded+ " ml needed!");
}

//
public static void printNTenTimes (int n) {

}


//In the method buildArray you will take the int value stored in the given variable num and declare an Array 
	//of that size called numArray.
	//Write a for loop that starts with a loop variable or index of zero (0) and 
	//checks to see if the loop variable is less than num.
	//To fill the Array, you will insert the value of that loop variable to one of 
	//the slots in numArray indexed by the loop variable
	//return the variable numArray after the for loop finishes
	//public static boolean buildArray (int[] array) {
	//	int sum= 0;
	//	for (int numArray : array) {System.out.print(numArray + " ");};
	//	for (int numArray : array) {
	//		System.out.println ("current number : "+ sum);
	//}
	//return sum > 100; 
	//}


{
int[] arr = new int[5];
for ( int i = 1; i <= 5; i++){
    arr[i - 1] = i;
}
System.out.println(arr[2]);
}
}



//Note to self: Static has to do with memory and how you share it. Static is shared. Everybody gets the same resource. 
