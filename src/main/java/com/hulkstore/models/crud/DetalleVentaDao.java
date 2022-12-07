package com.hulkstore.models.crud;

import com.hulkstore.models.entity.DetalleVenta;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DetalleVentaDao extends JpaRepository<DetalleVenta, Integer> {
List<DetalleVenta> finBySale_id(Integer idVenta);

}
