package com.xworkz.ArrayExamples;

public class MinValue {
int arr[]= {1000,11,500,84,31,9,100};

public int min() {
	int min=arr[0];
	for(int i=0;i<arr.length;i++) {
		if(arr[i]<min) {
			min=arr[i];
		}
	}
	return min;
	
}
	public static void main(String[] args) {
		
		int low;
		MinValue minValue=new MinValue();
		low=minValue.min();
		
		System.out.println("Min Value in array is: "+low);
	}

}
