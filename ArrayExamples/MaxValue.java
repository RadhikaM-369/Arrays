package com.xworkz.ArrayExamples;

public class MaxValue {
	int arr[]= {10,200,30,50,100};
	
	public int high() {
		int max=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		return max;
	}

	public static void main(String[] args) {
	int m=0;
		MaxValue high=new MaxValue();
		m=high.high();
		System.out.println("Max Value in array is : "+m);

	}

}
