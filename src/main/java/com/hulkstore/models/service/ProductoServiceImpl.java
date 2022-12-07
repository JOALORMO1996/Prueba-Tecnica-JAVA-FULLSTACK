package com.hulkstore.models.service;

import com.hulkstore.models.crud.ProductoDao;
import com.hulkstore.models.entity.Carrito;
import com.hulkstore.models.entity.DetalleVenta;
import com.hulkstore.models.entity.Producto;
import com.hulkstore.models.entity.Venta;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
public class ProductoServiceImpl implements IProductoService {

    @Autowired
    private ProductoDao productoDao;


    @Override
    @Transactional(readOnly = true)
    public List<Producto> getAll() {
        return (List<Producto>) productoDao.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Producto getProducto(Integer idProducto) {
        return productoDao.findById(idProducto).orElse(null);
    }

    @Override
    public List<Venta> getVentasUsuario(String usuario) {
        return null;
    }

    @Override
    public List<DetalleVenta> getVentaId(Integer idVenta) {
        return null;
    }



}
