package com.xworkz.ArrayExamples;

public class SearchElement {
	 public static int search(int arr[], int key)
	    {
	        for (int i = 0; i <arr.length; i++)
	        {
	            if (arr[i] == key)
	                return i;
	        }
	        return -1;
	    }
	     
	    public static void main(String args[])
	    {
	        int arr[] = { 12, 23, 44, 101, 11, 50 };
	        
	        System.out.println("The given array is : ");
	        System.out.println("---------------------- ");
	        for (int i = 0; i < arr.length; i++) {
				System.out.print(" "+arr[i]);
			}
	        System.out.println("\n---------------------- ");
	        
	        int key =101;
	 
	        int result = search(arr, key);
	        if (result == -1)
	            System.out.print("The Element "+ key+ " is not present in array");
	        else
	            System.out.print("Element "+ key+ " is present in given array ");
	    }

}
