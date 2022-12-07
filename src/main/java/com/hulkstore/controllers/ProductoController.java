package com.hulkstore.controllers;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.hulkstore.models.entity.Producto;
import com.hulkstore.models.service.IProductoService;

@RestController
public class ProductoController {

	@Autowired
	private IProductoService productoService;
	

@GetMapping("/listar")
public List<Producto> listar(){
	return productoService.getAll();
	
}

@GetMapping("/listar/{id}")
public Producto detalle(@PathVariable Integer idProducto) {
	return productoService.getProducto(idProducto);
}

}
