package java_learning;

import java.util.Scanner;

public class CheckEvenorOdd {

	public static void main(String[] args) {
		
		
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("enter number");
       int num=sc.nextInt();
       
       
       if(num%2==0) {
    	   System.out.println("even");
       }
    	   else
    	   {
    		   System.out.println("odd");
    	   }
       }
	}


