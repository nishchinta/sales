package com.project.order.service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.project.order.dto.OrderDTO;
import com.project.order.entity.OrderEntity;
import com.project.order.repository.OrderRepo;

@Service
public class OrderService {
	
	
	@Autowired
	OrderRepo orderRepo;
	
	public List<OrderDTO> getorders() {
		List<OrderEntity> orders=orderRepo.findAll();
		List<OrderDTO> orderDTO=new ArrayList<OrderDTO>();
		for(OrderEntity order: orders) {
		OrderDTO orderDto=OrderDTO.valueOf(order);
		orderDTO.add(orderDto);
		}
		return orderDTO;
	}
	
	public Integer getAmount(Integer order_id) {
		OrderEntity orders=orderRepo.findByorderid(order_id);
		Integer Amount = orders.getItemprice()*orders.getQuantity();
		return Amount;
		
	}
	
	public List<OrderDTO> getallamount() {
		List<OrderEntity> ord=orderRepo.findAll();
		List<OrderDTO> orderDTO=new ArrayList<OrderDTO>();
		for(OrderEntity order: ord) {
		OrderDTO orderDto=OrderDTO.valueOf(order);
		orderDTO.add(orderDto);
		}
		return orderDTO;
	}
	

	public Object saveOrders(OrderEntity order) {
		return orderRepo.save(order);
	}

	public void deleteorder(Integer order_id) {
		OrderEntity entity = orderRepo.findByorderid(order_id);
		orderRepo.delete(entity);
		
	}

	public void updateQuantity(Integer orderid, OrderEntity order) {
		OrderEntity orderEntity = orderRepo.findByorderid(orderid);
		orderEntity.setQuantity(order.getQuantity());
		orderRepo.save(orderEntity);
	}



	public void updateOrder(OrderEntity order) {
		OrderEntity orderEntity = orderRepo.findByorderid(order.getOrderid());
		orderRepo.save(order);
		orderRepo.delete(orderEntity);

		
	}
	

}
