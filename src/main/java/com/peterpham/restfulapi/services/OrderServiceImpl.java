package com.peterpham.restfulapi.services;

import com.peterpham.restfulapi.api.v1.model.OrderDTO;

import java.util.List;

public class OrderServiceImpl implements OrderService {
    @Override
    public List<OrderDTO> getAllOrders() {
        return null;
    }

    @Override
    public OrderDTO getOrderByName(String name) {
        return null;
    }

    @Override
    public OrderDTO getOrderById(Long id) {
        return null;
    }

    @Override
    public OrderDTO createNewOrder(OrderDTO orderDTO) {
        return null;
    }

    @Override
    public OrderDTO saveOrderByDTO(Long id, OrderDTO orderDTO) {
        return null;
    }

    @Override
    public OrderDTO updateOrder(Long id, OrderDTO orderDTO) {
        return null;
    }

    @Override
    public OrderDTO patchOrder(Long id, OrderDTO orderDTO) {
        return null;
    }

    @Override
    public void deleteOrderById(Long id) {

    }
}
