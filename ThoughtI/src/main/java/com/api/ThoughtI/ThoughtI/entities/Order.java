package com.api.ThoughtI.ThoughtI.entities;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity

public class Order {

                        
    @OneToMany(cascade = CascadeType.ALL)
    @JsonManagedReference
    public Item item;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private int orderId;
    @Column(name="order_id")



    private String order_date;
    private String order_status;
    private String COllection_of_items;
    private int order_id;
    public int getOrderId() {
        return orderId;
    }
    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }
    public int getOrder_id() {
        return order_id;
    }
    public void setOrder_id(int order_id) {
        this.order_id = order_id;
    }
    public String getOrder_date() {
        return order_date;
    }
    public void setOrder_date(String order_date) {
        this.order_date = order_date;
    }
    public String getOrder_status() {
        return order_status;
    }
    public void setOrder_status(String order_status) {
        this.order_status = order_status;
    }
    public String getCOllection_of_items() {
        return COllection_of_items;
    }
    public void setCOllection_of_items(String cOllection_of_items) {
        COllection_of_items = cOllection_of_items;
    }
  



}
