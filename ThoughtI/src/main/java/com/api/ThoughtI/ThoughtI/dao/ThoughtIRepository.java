package com.api.ThoughtI.ThoughtI.dao;

import org.springframework.data.repository.CrudRepository;

import com.api.ThoughtI.ThoughtI.entities.Order;

public interface ThoughtIRepository extends CrudRepository<Order,Integer> {
   public Order  findById(int order_id);

}
