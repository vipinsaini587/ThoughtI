package com.api.ThoughtI.ThoughtI.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.api.ThoughtI.ThoughtI.entities.Order;
import com.api.ThoughtI.ThoughtI.services.ThoughtIServices;

@RestController
public class OrderController {
    @Autowired
    private ThoughtIServices thoughtiservice;

@GetMapping("/order")
public ResponseEntity<List<Order>> getOrder()
{
    List<Order> list=thoughtiservice.getAllOrderList();
    if(list.size()<=0) 
    {
        return ResponseEntity.status(HttpStatus.NOT_FOUND).build();

    }
    return ResponseEntity.status(HttpStatus.CREATED).body(list);
}


// single Order handler
@GetMapping("/order/{id}")
public ResponseEntity<Object> getOrder(@PathVariable("id") int id)
{
    Order order=thoughtiservice.getOrderById(id);
    if(order==null)
    {
        return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
    }
    Object order_id;
    return ResponseEntity.of(Optional.of(id));
}

 //new Order handler
@PostMapping("/order")
public ResponseEntity<Order> addOrder(@RequestBody Order order)
{
    Order o=null;
    try{
       o=this.thoughtiservice.addOrder(order);
    System.out.print(order);
    return ResponseEntity.of(Optional.of(o));
    }
    catch(Exception e){
        e.printStackTrace();
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
    }
  
}

}
