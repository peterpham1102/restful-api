package com.peterpham.restfulapi.services;

import com.peterpham.restfulapi.api.v1.model.CustomerDTO;

import java.util.List;

public class CustomerServiceImpl implements CustomerService {
    @Override
    public List<CustomerDTO> getAllCustomers() {
        return null;
    }

    @Override
    public CustomerDTO getCustomerByName(String name) {
        return null;
    }

    @Override
    public CustomerDTO getCustomerById(Long id) {
        return null;
    }

    @Override
    public CustomerDTO createNewCustomer(CustomerDTO customerDTO) {
        return null;
    }

    @Override
    public CustomerDTO saveCustomerByDTO(Long id, CustomerDTO customerDTO) {
        return null;
    }

    @Override
    public CustomerDTO updateCustomer(Long id, CustomerDTO customerDTO) {
        return null;
    }

    @Override
    public CustomerDTO patchCustomer(Long id, CustomerDTO customerDTO) {
        return null;
    }

    @Override
    public void deleteCustomerById(Long id) {

    }
}
