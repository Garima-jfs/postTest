package com.test1;

import java.util.ArrayList;

import java.util.List;
import java.util.Scanner;


public class Customer_Order1 {
   static List customer_list= new ArrayList();
   static Customer1 customer1, customer2, customer3,customer4, customer5;
   
   
   
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner input = new Scanner(System.in);
//		int number ;
//       System.out.println("Welcome! Choose from the menu.. Press 0 to exit");
//       number = input.nextInt();
//       do
//       {
//    	   System.out.println("Enter 1 to enter customer details ");
//    	   System.out.println("Enter 2 to enter Special order details ");
//    	   System.out.println("Enter 3 to enter Normal Order details ");
//    	   switch(number)
//    	   {
//    	   case 1 : 
//    	   }
//       }while(number!=0);
		
		customer1 = new Customer1("C02","Riya");
		customer2 = new Customer1("C03","Puja");
		customer3 = new Customer1("C05","Rohit");
		customer4 = new Customer1();
		customer5 = new Customer1("C06","Rahul");
		
			addDetails();
	display();
		
	}
	
	public static void addDetails()
	{
		try
		{
			customer_list.add(customer1);
			customer_list.add(customer2);
			customer_list.add(customer3);
			customer_list.add(customer4);
		}
		catch( CustomerOrderException1 customerorderexception)
		{
			System.out.println("Unable to add");
		}
	}
	public static void display()
	{
		System.out.println(customer_list);
	}

}
