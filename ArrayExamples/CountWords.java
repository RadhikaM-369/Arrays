package com.xworkz.ArrayExamples;

public class CountWords {

	public static void main(String[] args) {
		String s="xworkz,is,located,in,bangalore,rajajinagar,its,a,software,training,institution";
		
		int count=1;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)==',') {
				count++;
			}
		}
		System.out.println("Number of words in string : "+count);

	}

}
