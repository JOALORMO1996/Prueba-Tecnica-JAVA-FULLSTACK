package com.hulkstore.models.crud;

import com.hulkstore.models.entity.Venta;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface VentaDao extends JpaRepository<Venta, Integer> {

    List<Venta>findByIdUsuario(Integer idUsuario);
}
