//Name: Chelsea Lennox
//Date: February 27 2023
//Purpose: Implement Fibonacci function in recursive and iterative
//---------------------------------------------------------------

import javafx.stage.Stage;
import java.util.Random;
import java.util.*;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {


		int i, n = 50;
		int f1,f2; //fi variable stores recursive, f2 variable stores iterative
		
		System.out.print("n\tIterative\tRecursive\n");
		System.out.print("-----------------------------------------\n");
		
		long start_time,end_time;
		int difference,difference2;
		
		//Looping from 30 - 50
		for(i = 30;i <= n; i++) 
			
		{
		//Start Time	
		start_time = System.nanoTime(); 
		f1 = fibonacciIterative(i); //call function for f1 recursive method
		//End Time
		end_time = System.nanoTime(); 
		difference = (int)((end_time - start_time) / 1e6); 
		//Initial Time
		f2 = fibonacciRecursive(i); //call function for f2 iterative method
		end_time = System.nanoTime(); 
		difference2 = (int)((end_time - start_time) / 1e6); 
		
		//Output
		System.out.print(i+"\t\t"+difference+"\t\t\t"+difference2 +"\t\n"); 
		}//end of for loop
		
	}//End of main
	
	
	//Fibonacci Recursive Method 
	public static int fibonacciRecursive(int n) { 


		if(n <= 1)
		{
			
		return 1;
		}
		
		else {
			
		return fibonacciRecursive(n-1) + fibonacciRecursive(n-2);
		
		 }
		}//End of Fibonacci Recursive Method

	//Fibonacci Iterative Method 
	public static int fibonacciIterative(int n) { 
		if(n <= 1)
		{
		return 1;
		}
		int r = 0,p = 1,pp = 1,i;
		
		for(i = 2;i <= n; i++)
		{
		r = p + pp;
		pp = p;
		p = r;
		}
		return r;
		}

		
		}//End of Fibonacci Iterative Method


