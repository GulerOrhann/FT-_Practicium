package com.example.demo.Entity;

import javax.persistence.*;
import javax.xml.stream.events.Comment;

import java.util.*;

@Entity
@Table(name="product")
public class Product {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name="product_name")
	private String product_name;
	
	@Column(name="product_price")
	private String product_price;
	
	
	@Column(name="product_edate")
	private String product_edate;
	
	@OneToMany(mappedBy = "product", cascade = CascadeType.ALL, orphanRemoval = true)
	private Set<ProductComment> product_comment = new HashSet<>();

	public long getId() {
		return id;
	}

	public String getProduct_name() {
		return product_name;
	}

	public String getProduct_price() {
		return product_price;
	}

	public String getProduct_edate() {
		return product_edate;
	}

	public Set<ProductComment> getProduct_comment() {
		return product_comment;
	}

	public void setId(long id) {
		this.id = id;
	}

	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}

	public void setProduct_price(String product_price) {
		this.product_price = product_price;
	}

	public void setProduct_edate(String product_edate) {
		this.product_edate = product_edate;
	}

	public void setProduct_comment(Set<ProductComment> product_comment) {
		this.product_comment = product_comment;
	}


	

}
