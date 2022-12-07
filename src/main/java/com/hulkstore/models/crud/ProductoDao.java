package com.hulkstore.models.crud;

import org.springframework.data.repository.CrudRepository;

import com.hulkstore.models.entity.Producto;

import java.util.List;
import java.util.Optional;

public interface ProductoDao extends CrudRepository<Producto, Integer>{


}
