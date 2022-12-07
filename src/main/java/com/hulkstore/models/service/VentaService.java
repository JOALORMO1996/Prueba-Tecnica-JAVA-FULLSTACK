package com.hulkstore.models.service;

import com.hulkstore.models.crud.VentaDao;
import com.hulkstore.models.entity.Venta;

import java.util.List;

public class VentaService implements  IVentasService{

    private final VentaDao ventaDao;

    public VentaService(VentaDao ventaDao) {
        this.ventaDao = ventaDao;
    }

    @Override
    public List<Venta> listarVentaCliente(Integer id) {
        return ventaDao.findByIdUsuario(id);
    }
}
