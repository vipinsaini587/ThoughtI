package com.api.ThoughtI.ThoughtI.entities;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name="Order")

public class Item {


    @OneToOne(mappedBy = "Item")
    @JsonManagedReference
    private Order order;


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="Order_id")
    
    private String order_name;

    @OneToOne(cascade = CascadeType.ALL)
    @JsonManagedReference
    private Order Item;
    
    private int order_id;
    private int item_id;
    private int item quantity;
    private int itemprice;
    public int getOrder_id() {
        return order_id;
    }

    public void setOrder_id(int order_id) {
        this.order_id = order_id;
    }

    public int getItem_id() {
        return item_id;
    }

    public void setItem_id(int item_id) {
        this.item_id = item_id;
    }

    public String getOrder_name() {
        return order_name;
    }

    public void setOrder_name(String order_name) {
        this.order_name = order_name;
    }

    public Order getItem() {
        return Item;
    }

    public void setItem(Order item) {
        Item = item;
    }
    
    public Order getQuantity() {
        return quantity;
    }

    public void setItem(Order Quantity) {
        quantity= quantity;
    }

    
    public Order getPrice() {
        return price;
    }

    public void setItem(Order Price) {
        price= price;
    }
    @Override
    public String toString() {
        return "Item [Item=" + Item + ", item_id=" + item_id + ", order_id=" + order_id + ", order_name=" + order_name
                + "]";
    }

   

    
    
}
