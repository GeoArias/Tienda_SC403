/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.Tienda_SC403.dao;

import com.Tienda_SC403.domain.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author geoas
 */
public interface ProductoDao extends JpaRepository<Producto, Long>{
    
}
