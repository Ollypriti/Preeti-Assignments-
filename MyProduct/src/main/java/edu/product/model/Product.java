package edu.product.model;

public class Product {
	private String pname;
	private String bname;
	private String pquan;
	private String pdesc;
	private int price;
	private int id;
	
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getBname() {
		return bname;
	}
	public void setBname(String bname) {
		this.bname = bname;
	}
	public String getPquan() {
		return pquan;
	}
	public void setPquan(String pquan) {
		this.pquan = pquan;
	}
	public String getPdesc() {
		return pdesc;
	}
	public void setPdesc(String pdesc) {
		this.pdesc = pdesc;
	}
	
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public Product(int id,String pname, String bname, String  pquan, String pdesc, int price)
	{
		super();
		this.setId(id);
		this.pname=pname;
		this.bname=bname;
		this.pquan=pquan;
		this.pdesc=pdesc;
		this.price=price;
	}
	public Product() {
		super();
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
}

