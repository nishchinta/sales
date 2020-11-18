package com.project.order.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import com.project.order.dto.OrderDTO;
import com.project.order.entity.OrderEntity;
import com.project.order.service.OrderService;

@RestController
@CrossOrigin
@RequestMapping(value="/api")
public class OrderController {
	
	@Autowired
	OrderService orderService;

	//Get Method to view all the orders in the table
	@GetMapping(value="orders" ,produces= MediaType.APPLICATION_JSON_VALUE)
	public List<OrderDTO> getorders(){
		List<OrderDTO> orderDto=orderService.getorders();
		return orderDto;
    }
	
	//Get method to view the amount for a particular order using order_id
	@GetMapping(value="order/amount/{order_id}" ,produces= MediaType.APPLICATION_JSON_VALUE)
	public Object getAmount(@PathVariable Integer order_id){
		Integer value = orderService.getAmount(order_id);
		return "Total Amount for customer is Rs " +value;
    }
	
	//Get method to get all the order amount in the table
	@GetMapping(value="order/amount",produces= MediaType.APPLICATION_JSON_VALUE )
	public String getallamount(){
		List<OrderDTO> orderDto=orderService.getorders();
		String Otp="\n";
		for(OrderDTO ord : orderDto) {
			Integer Amount = ord.getItemprice()*ord.getQuantity();
			Otp+="Total Price for " +ord.getCustomername()+" is Rs " +Amount+"\n";
		}return Otp;}
	
	//Post method to add a new order
    @PostMapping(value="new/orders", consumes  = MediaType.APPLICATION_JSON_VALUE)
    public String addOrders(@RequestBody OrderDTO orders) {
    	orderService.saveOrders(orders.createEntity());
    	Integer amount;
    	amount=orders.getItemprice()*orders.getQuantity();
    	return "Order Confirmed: Total Price is Rs " +amount;
    	
    }

    //Delete method to remove the order from the table
	@DeleteMapping(value="delete/{order_id}")
	public String deleteorder(@PathVariable Integer order_id) {
		orderService.deleteorder(order_id);
		return "Order Deleted succesfully!";

	}
	
	
	//Put method to update order
	@PutMapping(value="update", consumes  = MediaType.APPLICATION_JSON_VALUE)
	public String updateorder(@RequestBody OrderEntity order ) {
		orderService.updateOrder(order);
		return "Quantity Updated";
	}
	



}
