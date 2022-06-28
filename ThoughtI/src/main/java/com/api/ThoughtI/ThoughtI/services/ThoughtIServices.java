package com.api.ThoughtI.ThoughtI.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.api.ThoughtI.ThoughtI.dao.ThoughtIRepository;
import com.api.ThoughtI.ThoughtI.entities.Order;


@Component
public class ThoughtIServices {

    @Autowired
    private ThoughtIRepository ThoughtIRepository;


    //get all Order
    public List<Order> getAllOrderList()
    {
        List<Order> list=(List<Order>)this.ThoughtIRepository.findAll();
        return  list;
    }
    //get Order by id
    public Order getOrderById(int order_id)
    {
        Order order=null;

        try {
            order=this.ThoughtIRepository.findById(order_id);
            return order;
    
    }
        catch(Exception e) {
            e.printStackTrace();
       return order;
        }
    }
    public Order addOrder(Order order) {
        return null;
    } 

}