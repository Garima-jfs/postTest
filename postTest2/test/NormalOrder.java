package com.test;

public class NormalOrder extends Order {

	NormalOrder()
	{
		order_id = "O02";
		order_item= "Book";
		order_quantity = 2;
	}
	NormalOrder(String order_id,  String order_item, int order_quantity)
	{
		this.order_id=order_id;
		this.order_item=order_item;
		this.order_quantity=order_quantity;
	}
	@Override
	public void confirm() {
		// TODO Auto-generated method stub
		System.out.println("The normal order has been confirmed");
	}

	@Override
	public void close() {
		// TODO Auto-generated method stub
		System.out.println("Normal order has been closed");
	}
}
