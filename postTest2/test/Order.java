package com.test;

public class Order implements Details{
String order_id;
int order_quantity;
String order_item;

Order()
{
	order_id = "O02";
	order_item= "Book";
	order_quantity = 2;
}

Order(String order_id,  String order_item, int order_quantity)
{
	this.order_id=order_id;
	this.order_item=order_item;
	this.order_quantity=order_quantity;
}
public void confirm()
{
	System.out.println("Oder has been confirmed");
}
public  void close()
{
	System.out.println("Order details closed");
}
@Override
public void details() {
	// TODO Auto-generated method stub
	System.out.println("Details printed");
}

}
