package com.test;

import java.util.ArrayList;

import java.util.List;





public class Customer_Order {
   static List customer_list= new ArrayList();
   static Customer customer1, customer2, customer3,customer4, customer5;
   
   
   
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
		
		customer1 = new Customer("C02","Riya", "O02","Laptop",5);
		customer2 = new Customer("C03","Puja", "O03","SmartPhone",3);
		customer3 = new Customer("C05","RohitA");
		customer4 = new Customer();
		customer5 = new Customer("C06","Rahul","O07","Desktop",10);
		
			addDetails();
	display();
	String id_to_be_deleted1 = "C03";
	findCustomer(id_to_be_deleted1);
	display();
	String id_to_be_deleted = "C03";
		deleteDetails(id_to_be_deleted);
		updateDetails(customer4, customer5);
		display();
		
		String id = "O02";
		findDetails(id);
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
		catch( CustomerOrderException customerorderexception)
		{
			System.out.println("Unable to add");
		}
	}
	public static void display()
	{
		System.out.println(customer_list);
	}
	
	
	
	public static void deleteDetails(String id_to_be_deleted)
	{
for(int i = 0; i<customer_list.size();i++)
			
		{
			Customer customer = (Customer)customer_list.get(i);
			if(customer.customer_id.equals(id_to_be_deleted))

			{
				System.out.println("\n Deleted item = "+  customer);
				int index = customer_list.indexOf(customer);
				customer_list.remove(index);
			}
			
		}
	}
	
	
	public static void updateDetails(Customer customer4, Customer customer5)
	{
		if(customer4==null)
			System.out.println("Error");
		else
		{
			int index = customer_list.indexOf(customer4);
			customer_list.remove(index);
			customer_list.add(customer5);
		}
	}
	
	public static void findCustomer(String id_to_be_deleted)
	{
for(int i = 0; i<customer_list.size();i++)
			
		{
			Customer customer = (Customer)customer_list.get(i);
			if(customer.customer_id.equals(id_to_be_deleted))

			{
				System.out.println(customer.customer_name+"\n\n ");
			}
			}
	}
	
	// View details via order_id;
	 public static void findDetails(String order_id1)
	 {
		 for(int i = 0; i<customer_list.size();i++)
				
			{
				Customer customer = (Customer)customer_list.get(i);
				if(customer.order.order_id.equals(order_id1))
						{
					System.out.println("\n Order ID : "+customer.order.order_id+"\n Order Name: "+customer.order.order_item+"\n Quantity ordered : "+customer.order.order_quantity);
						}
	 }

}
}
