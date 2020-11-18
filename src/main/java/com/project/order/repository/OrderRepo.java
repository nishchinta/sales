package com.project.order.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.order.dto.OrderDTO;
import com.project.order.entity.OrderEntity;

@Repository
@Transactional
public interface OrderRepo extends JpaRepository<OrderEntity, Integer>{

	Object save(OrderDTO orders);

	OrderEntity findByorderid(Integer order_id);
	
	OrderEntity findBycustomerid(Integer order_id);

	




    



}
