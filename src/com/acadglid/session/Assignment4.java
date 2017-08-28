/*
 * Write a program that finds all anagram sets from a list of words. Anagrams are those words in
	which there are same characters jumbled. For example -> GOD - DOG ARE ANAGRAMS. Both
	words have same characters but in jumbled order.
	Input: listen, pot, part, opt, trap, silent, top, this, hello, hits, what, shit ------- Output: { listen,
	silent} { part, trap } { pot, opt, top }{ this, hits, shit }
 */

package com.acadglid.session;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Assignment4 {
	
	
	// Sorting each string in array to accending order 
	
	static String convertToString (char [] item) {
		
		String temp ="";
		
		for(int i = 0 ; i<item.length;i++)
		temp=temp+item[i];
		
		return temp;
	}
	
	//Linear Search 
	
	static void search(String key, String[] tempArray ,String[]arrayOfWords) {
		
		int flag =0;
		
		for(int i=0;i<tempArray.length;i++) {
			
			if(tempArray[i]==key) {
				System.out.println(arrayOfWords[i]);
				
			}
			
		}
		
		
	}
	
	public static void main(String[] arg) {
		
		
		
		//1. Enter the number of words from user
		
		System.out.println("Enter the number of words you want to input ");
		Scanner sc = new Scanner(System.in);
		int noOfwords = sc.nextInt();
		
		//2. Create array of string to hold these words 
		System.out.println("Enter the words: ");
		String[] arrayOfWords = new String[noOfwords];
		int [] index = new int[noOfwords];    //Will be used to count occurence 
		String[] tempArray = new String[noOfwords];
		for(int i=0; i<arrayOfWords.length;i++) {
			
			arrayOfWords[i]=sc.next();
		}
		
		//3. Sort each element of of array in acceding order 
		
		for(int i=0; i<arrayOfWords.length;i++){
			
			
			char[] arr =arrayOfWords[i].toCharArray();
			Arrays.sort(arr);
			String temp =convertToString(arr);
			tempArray[i] =temp;
		}
		
		//4. Compare  tempArray with each item in array
		
		for(int i=0;i<tempArray.length;i++) {
			String key = tempArray[i];
			
		search(key,tempArray,arrayOfWords);
			
			
		
		}
	
		
		
	}



}
