package com.Tienda_SC403.service.impl;

import com.Tienda_SC403.dao.CategoriaDao;
import com.Tienda_SC403.domain.Categoria;
import com.Tienda_SC403.service.CategoriaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class CategoriaServiceImpl implements CategoriaService {

    @Autowired
    private CategoriaDao categoriaDao;
    
    @Override
    @Transactional(readOnly = true)
    public List<Categoria> getCategorias(boolean activos) {
        List<Categoria> categorias = categoriaDao.findAll();
        
        if (activos) {
            categorias.removeIf(c -> !c.isActivo());
        }
        return categorias;
    }

    @Override
    public Categoria getCategoria(Categoria categoria) {
        return categoriaDao.findById(categoria.getIdCategoria()).orElse(null);
    }
    
}
