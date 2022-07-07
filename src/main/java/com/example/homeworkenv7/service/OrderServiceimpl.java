package com.example.homeworkenv7.service;

import com.example.homeworkenv7.component.Cart;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceimpl implements OrderService {

    private final Cart cart;

    public OrderServiceimpl(Cart cart) {
        this.cart=cart;
    }

    @Override
    public List<Integer> addItems(List<Integer> idList) {
        return cart.addItems(idList);
    }

    @Override
    public List<Integer> getItems() {
        return cart.getItems();
    }
}
