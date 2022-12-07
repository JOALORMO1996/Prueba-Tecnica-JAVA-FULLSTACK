package com.hulkstore.models.service;

import com.hulkstore.models.crud.CarritoDao;
import com.hulkstore.models.entity.Carrito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class CarritoService implements ICarritoService{

    @Autowired
    private final CarritoDao carritoDao;


    public CarritoService(CarritoDao carritoDao) {
        this.carritoDao = carritoDao;


    }

    @Override
    public List<Carrito> listarItems(Integer idUsuario ) {
        return this.carritoDao.findByIdUsuario(idUsuario);
    }

    @Override
    public void limpiarCarrito(Integer clienteId) {
this.carritoDao.deleteByIdUsuario(clienteId);
    }

    @Override
    public void borrarItem(Integer id) {
this.carritoDao.deleteById(id);
    }

    @Override
    public void agregarItem(Carrito carrito) {
        this.carritoDao.save(carrito);
    }

    @Override
    public long contarItem(Integer cliente_id) {
        return this.carritoDao.countByIdUsuario(cliente_id);
    }
}
