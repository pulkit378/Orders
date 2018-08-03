package cust.Orders;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "ORDER")
public class Order {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ORDER_ID")
	private int orderId ;
	
	@Column(name = "DELIVERY_DATE")
	private Date delDate;
	
	@Column(name = "PAYMENT_DATE")
	private Date paymentDate;
	
	
	@Column(name = "CUSTOM_MESSAGE")
	private String customMessage;
	
	@ManyToOne
	@JoinColumn(name = "custId")
	private Customer customer;
	
	@OneToMany(mappedBy = "order")
	private List<OrderItem> items = new ArrayList<OrderItem>();

	public Order() {
		
	}
	
	
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public Date getDelDate() {
		return delDate;
	}
	public void setDelDate(Date delDate) {
		this.delDate = delDate;
	}
	public Date getPaymentDate() {
		return paymentDate;
	}
	public void setPaymentDate(Date paymentDate) {
		this.paymentDate = paymentDate;
	}
	public String getCustomMessage() {
		return customMessage;
	}
	public void setCustomMessage(String customMessage) {
		this.customMessage = customMessage;
	}
		
	public List<OrderItem> getItems() {
		return items;
	}

	public void setItems(List<OrderItem> items) {
		this.items = items;
	}
	
	public Customer getCustomer() {
		return customer;
	}
	
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

}
