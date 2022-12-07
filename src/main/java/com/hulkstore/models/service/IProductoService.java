package com.hulkstore.models.service;

import java.util.List;
import java.util.Optional;

import com.hulkstore.models.entity.Carrito;
import com.hulkstore.models.entity.DetalleVenta;
import com.hulkstore.models.entity.Producto;
import com.hulkstore.models.entity.Venta;

public interface IProductoService {
	
	public List<Producto> getAll();
	
	public Producto getProducto(Integer idProducto);

public List<Venta> getVentasUsuario(String usuario);

public  List<DetalleVenta> getVentaId(Integer idVenta);







}
