package com.example.apibuenaspracticas.service;

import com.example.apibuenaspracticas.model.dto.ClienteDto;
import com.example.apibuenaspracticas.model.entity.Cliente;

import java.util.List;

public interface IClienteService {

    List<Cliente> listAll();

    Cliente save(ClienteDto cliente);

    Cliente findById(Integer id);

    void delete(Cliente cliente);

    boolean existsById(Integer id);
}
