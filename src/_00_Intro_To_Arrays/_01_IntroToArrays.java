package _00_Intro_To_Arrays;

import java.util.Random;

public class _01_IntroToArrays {
    public static void main(String[] args) {
        // 1. declare and Initialize an array 5 Strings
    	String[] strs = {"hi", "there", "what", "is", "up"};

        // 2. print the third element in the array
    	System.out.println(strs[2]);

        // 3. set the third element to a different value
    	strs[2] = "dog";
    	
        // 4. print the third element again
    	System.out.println(strs[2]);

        // 5. use a for loop to set all the elements in the array to a string
        //    of your choice
    	for (int i = 0; i < 5; i++) {
    		strs[i] = "food";
    	}

        // 6. use a for loop to print all the values in the array
        //    BE SURE TO USE THE ARRAY'S length VARIABLE
    	for (int i = 0; i < strs.length; i++) {
    		System.out.println(strs[i]);
    	}
    	
        // 7. make an array of 50 integers
    	int[] bigArray = new int[50];
    	for (int i = 0; i < 50; i++) {
    		bigArray[i] = i;
    	}

        // 8. use a for loop to make every value of the integer array a random
        //    number
    	Random rand = new Random();
    	for (int i = 0; i < 50; i++) {
    		bigArray[i] = rand.nextInt(101);
    	}
    	
        // 9. without printing the entire array, print only the smallest number
        //    on the array
    	int smallestNum = bigArray[0];
    	for (int i = 0; i < bigArray.length; i++) {
    		if (smallestNum > bigArray[i]) {
    			smallestNum = bigArray[i];
    		}
    	}
    	System.out.println("" + smallestNum);

        // 10 print the entire array to see if step 8 was correct
    	for (int I: bigArray) {
    		System.out.println(I);
    	}
    	
        // 11. print the largest number in the array.
    	int largestNum = 0;
    	for (int i = 0; i < bigArray.length; i++) {
    		if (bigArray[i] > largestNum) {
    			largestNum = bigArray[i];
    		}
    	}
    	System.out.println("" + largestNum);
    	
        // 12. print only the last element in the array
    	System.out.println("" + bigArray[bigArray.length-1]);
    }
}
