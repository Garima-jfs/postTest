package com.test1;

public class Customer1 implements Details1{
String customer_id;
String customer_name;
//Order1 order1 = new Order1();

Customer1()
{
	customer_id = "C01";
	customer_name="Garima";
//	order1.order_id = "O01";
//order1.order_item= " Hp mouse";
//order1.order_quantity=1;
//	
}

Customer1(String customer_id, String customer_name)
{
	this.customer_id=customer_id;
	this.customer_name=customer_name;
}

Customer1(String customer_id, String customer_name, String order_id, String order_item, int order_quantity)
{
	this.customer_id=customer_id;
	this.customer_name=customer_name;
//	this.order1.order_id = order_id;
//	this.order1.order_item=order_item;
//	this.order1.order_quantity=order_quantity;
}
@Override
public void details() {
	// TODO Auto-generated method stub
	System.out.println("This is a customer");
}

@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Customer name: "+customer_name+"\ncustomer id"+customer_id+"\n";
	}
}
