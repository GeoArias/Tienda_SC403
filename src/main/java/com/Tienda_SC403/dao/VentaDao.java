package com.Tienda_SC403.dao;

import com.Tienda_SC403.domain.Venta;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VentaDao extends JpaRepository <Venta,Long> {
     
}