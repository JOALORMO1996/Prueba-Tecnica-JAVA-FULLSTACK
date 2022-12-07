package com.hulkstore.models.service;

import com.hulkstore.models.crud.DetalleVentaDao;
import com.hulkstore.models.entity.DetalleVenta;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class DetalleVentaService implements IDetalleVentaService{

    private final DetalleVentaDao detalleVentaDao;

    @Autowired
    public DetalleVentaService(DetalleVentaDao detalleVentaDao) {
        this.detalleVentaDao = detalleVentaDao;


    }

    public void crearDetalle(DetalleVenta detalleVenta){
        this.detalleVentaDao.save(detalleVenta);
    }

    @Override
    public List<DetalleVenta> getDetalleVenta(Integer idVenta) {
        return null;
    }
}
