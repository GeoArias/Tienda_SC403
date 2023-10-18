package com.Tienda_SC403.service;

import com.Tienda_SC403.domain.Categoria;
import java.util.List;

public interface CategoriaService {
    
    // Retorna una lista de categorias (activas o todas)
    public List<Categoria> getCategorias(boolean activos);
    
   // Retorna una categoría por ID
    public Categoria getCategoria(Categoria categoria);
    
    // Se inserta un nuevo registro si el ID de la categoría está vacío
    // Se actualiza el registro si el ID de la categoría NO está vacío
    public void save(Categoria categoria);
    
    // Se elimina el categoria que tiene el id pasado por parámetro
    public void delete(Categoria categoria);
}
