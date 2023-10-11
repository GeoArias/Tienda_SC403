package com.Tienda_SC403.service;

import com.Tienda_SC403.domain.Categoria;
import java.util.List;

public interface CategoriaService {
    public List<Categoria> getCategorias(boolean activos);
    public Categoria getCategoria(Categoria categoria);
}
