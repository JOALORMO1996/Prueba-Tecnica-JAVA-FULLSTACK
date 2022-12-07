package com.hulkstore.models.service;

import com.hulkstore.models.entity.Carrito;

import java.util.List;


public interface ICarritoService {

    public List<Carrito> listarItems(Integer idUsuario);

public void limpiarCarrito(Integer clienteId);

public void borrarItem(Integer id);

public void agregarItem(Carrito carrito);

public long contarItem(Integer cliente_id);
}
