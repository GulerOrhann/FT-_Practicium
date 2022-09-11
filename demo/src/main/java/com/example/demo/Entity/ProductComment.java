package com.example.demo.Entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name="product_comment")
public class ProductComment {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name="comment",length=500)
	private String comment;
	
	@Column(name="comment_date")
	private String comment_date;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "userId", nullable = false)
	private User user;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "productId", nullable = false)
	private Product product;

	public long getId() {
		return id;
	}

	public String getComment() {
		return comment;
	}

	public String getComment_date() {
		return comment_date;
	}

	public User getUser() {
		return user;
	}

	public Product getProduct() {
		return product;
	}

	public void setId(long id) {
		this.id = id;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public void setComment_date(String comment_date) {
		this.comment_date = comment_date;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	
	
	

}
