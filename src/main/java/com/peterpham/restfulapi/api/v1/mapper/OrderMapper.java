package com.peterpham.restfulapi.api.v1.mapper;

import com.peterpham.restfulapi.api.v1.model.OrderDTO;
import com.peterpham.restfulapi.domain.Order;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface OrderMapper {

    OrderMapper INSTANCE = Mappers.getMapper(OrderMapper.class);

    OrderDTO orderToOrderDto(Order order);

    Order orderDtoToOrder(OrderDTO orderDTO);
}
