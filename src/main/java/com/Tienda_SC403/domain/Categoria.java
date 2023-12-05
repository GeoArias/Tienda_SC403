package com.Tienda_SC403.domain;

import jakarta.persistence.*;
import java.io.Serializable;
import java.util.List;
import lombok.Data;

@Data
@Entity
@Table(name = "categoria")
public class Categoria implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_categoria") //opcional si abajo es distinto nombre
    private Long idCategoria; // El Hibernate lo transforma en id_categoria por 

    private String descripcion;
    private String rutaImagen;
    private boolean activo;

    @OneToMany
    @JoinColumn(name = "id_categoria", insertable = false, updatable = false)
    List<Producto> productos;

    public Categoria() {
    }

    public Categoria(String description, String rutaImagen, boolean activo) {
        this.descripcion = description;
        this.rutaImagen = rutaImagen;
        this.activo = activo;
    }
    
    
}
