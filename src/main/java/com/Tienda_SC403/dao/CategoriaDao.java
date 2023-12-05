package com.Tienda_SC403.dao;

import com.Tienda_SC403.domain.Categoria;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaDao extends JpaRepository<Categoria, Long> {
    List<Categoria> findByDescripcionContainingIgnoreCase(String descripcion);
}
