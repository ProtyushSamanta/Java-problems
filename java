Problem 1: Create an array with the values (1, 2, 3, 4, 5, 6, 7) and shuffle it.

import java.security.SecureRandom;
public class ShffleArrayElements {
	public static void main(String[] args) {
		int numbersArray[] = { 1, 2, 3, 4, 5, 7 };
	
		shuffleTheArray(numbersArray);
		for (int i = 0; i < numbersArray.length; i++) {
			System.out.print(numbersArray[i] + " ");
		}
		System.out.println();

	}

	public static void shuffleTheArray(int[] numbersArray) {
		for (int i = numbersArray.length - 1; i > 0; i--) {
			int randomIndex = new SecureRandom().nextInt(numbersArray.length - 1);
			int element = numbersArray[randomIndex];
			numbersArray[randomIndex] = numbersArray[i];
			numbersArray[i] = element;

		}

	}

}




Problem 2: Enter a Roman Number as input and convert it to an integer.

import java.util.*;   
import java.io.*;   
import java.lang.Math;  
public class RomanToInteger1  
{   
  int value(char r)   
  {   
    if (r == 'I')   
      return 1;   
    if (r == 'V')   
      return 5;   
    if (r == 'X')   
      return 10;   
    if (r == 'L')   
      return 50;   
    if (r == 'C')   
      return 100;   
    if (r == 'D')   
      return 500;   
    if (r == 'M')   
      return 1000;   
    return -1;   
  }    
  int convertRomanToInt(String s)   
  {    
    int total = 0;    
    for (int i=0; i<s.length(); i++)   
    {   
      int s1 = value(s.charAt(i));     
      if (i+1 <s.length())   
      {   
        int s2 = value(s.charAt(i+1));    
        if (s1 >= s2)   
        {    
          total = total + s1;   
        }   
        else  
        {    
          total = total - s1;   
        }   
      }   
      else  
      {   
        total = total + s1;   
      }   
    }   
    return total;   
  }    
  public static void main(String args[])   
  {   
    RomanToInteger1 ob = new RomanToInteger1();
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter a Roman number: ");
    String romanStr = scanner.nextLine();
    System.out.println("The corresponding Integer value is: "+ob.convertRomanToInt(romanStr));   
  }   
} 







Problem 3: Check if the input is pangram or not.

import java.util.Scanner;

public class Programming9 {
	public static void main(String args[]){

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your String:");
		String str=sc.nextLine();

		str=str.replaceAll("","").toLowerCase();

		String s="";
		for(char i='a';i<='z';i++){
			if(str.indexOf(i)!=-1){

				s=s+i;
			}
		}
		if(s.length()==26){
			System.out.println("Pangram");
		}
		else{
			System.out.println(" Not Pangram");
		}
	}
} 