package com.peterpham.restfulapi.services;

import com.peterpham.restfulapi.api.v1.model.OrderDTO;

import java.util.List;

public interface OrderService {

    List<OrderDTO> getAllOrders();

    OrderDTO getOrderByName(String name);

    OrderDTO getOrderById(Long id);

    OrderDTO createNewOrder(OrderDTO orderDTO);

    OrderDTO saveOrderByDTO(Long id, OrderDTO orderDTO);

    OrderDTO updateOrder(Long id, OrderDTO orderDTO);

    OrderDTO patchOrder(Long id, OrderDTO orderDTO);

    void deleteOrderById(Long id);
}
