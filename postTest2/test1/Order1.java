package com.test1;

public abstract class Order1 implements Details1{
String order_id;
int order_quantity;
String order_item;




public abstract void confirm();

public  abstract void close();
@Override
public void details() {
	// TODO Auto-generated method stub
	System.out.println("Details printed");
}
@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Order Id "+order_id +"\n Order Item"+order_item+"\n Order Quantity "+order_quantity;
	}

}
