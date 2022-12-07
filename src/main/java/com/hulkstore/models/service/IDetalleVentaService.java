package com.hulkstore.models.service;

import com.hulkstore.models.entity.DetalleVenta;

import java.util.List;

public interface IDetalleVentaService {

public List<DetalleVenta> getDetalleVenta(Integer idVenta);
}
