package edu.library.entities;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Entity;
import jakarta.persistence.Column;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="books")
public class Book {
	@Column
	@Id
	@Generated(strategy=GenerationType.SEQUENCE)
	
	@column
	private String title;
	@column
	private String author;
	@column
	private double price;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Book(String title, String author, double price, Long id) {
		super();
		this.title = title;
		this.author = author;
		this.price = price;
		this.id = id;
	}
	private Long id;
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
}
