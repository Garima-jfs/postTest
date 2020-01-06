package com.test;

public class Customer implements Details{
String customer_id;
String customer_name;
Order order = new Order();

Customer()
{
	customer_id = "C01";
	customer_name="Garima";
	order.order_id = "O01";
order.order_item= " Hp mouse";
order.order_quantity=1;
	
}

Customer(String customer_id, String customer_name)
{
	this.customer_id=customer_id;
	this.customer_name=customer_name;
	order.order_id = "O01";
	order.order_item= " Hp mouse";
	order.order_quantity=1;
}

Customer(String customer_id, String customer_name, String order_id, String order_item, int order_quantity)
{
	this.customer_id=customer_id;
	this.customer_name=customer_name;
	this.order.order_id = order_id;
	this.order.order_item=order_item;
	this.order.order_quantity=order_quantity;
}
@Override
public void details() {
	// TODO Auto-generated method stub
	System.out.println("This is a customer");
}

@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Customer name: "+customer_name+"\ncustomer id"+customer_id+"\norder_id"+order.order_id+"\n Order Item"+order.order_item+"\n Order Quantity"+order.order_quantity+"\n";
	}
}
