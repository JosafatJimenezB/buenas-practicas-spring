package com.example.apibuenaspracticas.model.dao;

import com.example.apibuenaspracticas.model.entity.Cliente;
import org.springframework.data.repository.CrudRepository;

public interface ClienteDao extends CrudRepository<Cliente, Integer> {


}
