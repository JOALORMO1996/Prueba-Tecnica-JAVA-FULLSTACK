package com.hulkstore.models.service;

import com.hulkstore.models.entity.Venta;

import java.util.List;

public interface IVentasService {

    public List<Venta> listarVentaCliente(Integer id);
}
