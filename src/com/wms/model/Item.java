package com.wms.model;

public class Item {

	private int itemId;
	private String itemName;
	private String itemDes;
	private String remark;
	private int paymentMethod;
	private float price;
	private String uom;
	
	public Item() { }

	public Item(int itemId, String itemName, String itemDes, String remark, int paymentMethod, float price,
			String uom) {
		super();
		this.itemId = itemId;
		this.itemName = itemName;
		this.itemDes = itemDes;
		this.remark = remark;
		this.paymentMethod = paymentMethod;
		this.price = price;
		this.uom = uom;
	}

	public int getItemId() {
		return itemId;
	}

	public void setItemId(int itemId) {
		this.itemId = itemId;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public String getItemDes() {
		return itemDes;
	}

	public void setItemDes(String itemDes) {
		this.itemDes = itemDes;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public int getPaymentMethod() {
		return paymentMethod;
	}

	public void setPaymentMethod(int paymentMethod) {
		this.paymentMethod = paymentMethod;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public String getUom() {
		return uom;
	}

	public void setUom(String uom) {
		this.uom = uom;
	}
	
	
}