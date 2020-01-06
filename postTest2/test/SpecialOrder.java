package com.test;

public class SpecialOrder extends Order {

	SpecialOrder()
	{
		order_id = "O02";
		order_item= "Book";
		order_quantity = 2;
	}
	SpecialOrder(String order_id,  String order_item, int order_quantity)
	{
		this.order_id=order_id;
		this.order_item=order_item;
		this.order_quantity=order_quantity;
	}
	@Override
	public void confirm() {
		// TODO Auto-generated method stub
		System.out.println("The special order has been confirmed");
	}

	@Override
	public void close() {
		// TODO Auto-generated method stub
		System.out.println("Special order has been closed");
	}

}
