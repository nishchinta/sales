package com.project.order.dto;

import com.project.order.entity.OrderEntity;

public class OrderDTO {
	private Integer orderid;
	private Integer customerid;
	private String customername;
	private String customeremail;
	private String customerphone;
	private String itemid;
	private Integer itemprice;
	private Integer quantity;
	private Integer zipcode;
	private String City;
	private String Locality;
	private String doorno;
	
	
	public Integer getOrderid() {
		return orderid;
	}
	public void setOrderid(Integer orderid) {
		this.orderid = orderid;
	}
	public Integer getCustomerid() {
		return customerid;
	}
	public void setCustomerid(Integer customerid) {
		this.customerid = customerid;
	}
	public String getCustomername() {
		return customername;
	}
	public void setCustomername(String customername) {
		this.customername = customername;
	}
	public String getCustomeremail() {
		return customeremail;
	}
	public void setCustomeremail(String customeremail) {
		this.customeremail = customeremail;
	}
	public String getCustomerphone() {
		return customerphone;
	}
	public void setCustomerphone(String customerphone) {
		this.customerphone = customerphone;
	}
	public String getItemid() {
		return itemid;
	}
	public void setItemid(String itemid) {
		this.itemid = itemid;
	}
	public Integer getItemprice() {
		return itemprice;
	}
	public void setItemprice(Integer itemprice) {
		this.itemprice = itemprice;
	}
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	public Integer getZipcode() {
		return zipcode;
	}
	public void setZipcode(Integer zipcode) {
		this.zipcode = zipcode;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	public String getLocality() {
		return Locality;
	}
	public void setLocality(String locality) {
		Locality = locality;
	}
	public String getDoorno() {
		return doorno;
	}
	public void setDoorno(String doorno) {
		this.doorno = doorno;
	}

	
	// Conversion from entity to dto
	
	public static OrderDTO valueOf(OrderEntity orderEntity) {
		OrderDTO orderDTO = new OrderDTO();
		orderDTO.setOrderid(orderEntity.getOrderid());
		orderDTO.setCustomerid(orderEntity.getCustomerid());
		orderDTO.setCustomername(orderEntity.getCustomername());
		orderDTO.setCustomeremail(orderEntity.getCustomeremail());
		orderDTO.setCustomerphone(orderEntity.getCustomerphone());
		orderDTO.setCity(orderEntity.getCity());
		orderDTO.setDoorno(orderEntity.getDoorno());
		orderDTO.setZipcode(orderEntity.getZipcode());
		orderDTO.setLocality(orderEntity.getLocality());
		orderDTO.setItemid(orderEntity.getItemid());
		orderDTO.setItemprice(orderEntity.getItemprice());
		orderDTO.setQuantity(orderEntity.getQuantity());
		return orderDTO;
		
	}
	
	// Creating an Entity
	
	public OrderEntity createEntity(){
		OrderEntity orderEntity = new OrderEntity();
		orderEntity.setOrderid(this.getOrderid());
		orderEntity.setCustomerid(this.getCustomerid());
		orderEntity.setCustomername(this.getCustomername());
		orderEntity.setCustomeremail(this.getCustomeremail());
		orderEntity.setCustomerphone(this.getCustomerphone());
		orderEntity.setDoorno(this.getDoorno());
		orderEntity.setCity(this.getCity());
		orderEntity.setLocality(this.getLocality());
		orderEntity.setZipcode(this.getZipcode());
		orderEntity.setItemid(this.getItemid());
		orderEntity.setItemprice(this.getItemprice());
		orderEntity.setQuantity(this.getQuantity());
		return orderEntity;
	}
	
	@Override
	public String toString() {
		return "OrderId [OrderId="+orderid+"CustomerId"+customerid+"CustomerName"+customername+"CustomerEmail"+customeremail+
				"DoorNo"+doorno+"City"+City+"Locality"+Locality+"Zipcode"+zipcode+"Item_Id"+itemid+
				"ItemPrice"+itemprice+"Quantity"+quantity+"]";
	
	}

}
