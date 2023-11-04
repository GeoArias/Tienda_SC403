package com.Tienda_SC403.service;

import com.Tienda_SC403.domain.Producto;
import java.util.List;

public interface ProductoService {
    
    // Retorna una lista de productos (activas o todas)
    public List<Producto> getProductos(boolean activos);
    
   // Retorna una categoría por ID
    public Producto getProducto(Producto producto);
    
    // Se inserta un nuevo registro si el ID de la categoría está vacío
    // Se actualiza el registro si el ID de la categoría NO está vacío
    public void save(Producto producto);
    
    // Se elimina el producto que tiene el id pasado por parámetro
    public void delete(Producto producto);
}
