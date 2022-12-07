package com.hulkstore.models.crud;

import com.hulkstore.models.entity.Carrito;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CarritoDao extends JpaRepository<Carrito, Integer> {

    List<Carrito> findByIdUsuario(Integer idUsuario);

    void deleteByIdUsuario(Integer usuarioId);

    Long countByIdUsuario(Integer id);


}
