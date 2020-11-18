package com.project.order.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@SuppressWarnings("serial")
@Entity
@Component
@Table(name="orderdata")
@IdClass(OrderEntity.class)
public class OrderEntity implements Serializable{

		@Id
		@GeneratedValue(generator = "pkgen",strategy = GenerationType.SEQUENCE)
		@Column(name = "ordid")
		private Integer orderid;
		@Id
		@Column(name = "custid")
		private Integer customerid;
		@Column(name = "custname")
		private String customername;
		@Column(name = "custemail")
		private String customeremail;
		@Column(name = "custphone")
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
		
		

	

}
