package com.Tienda_SC403.domain;

import jakarta.persistence.*;
import java.io.Serializable;
import lombok.Data;

@Data
@Entity
@Table(name = "producto")
public class Producto implements Serializable {
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idProducto; // El Hibernate lo transforma en id_categoria por 

    @ManyToOne
    @JoinColumn(name ="id_categoria")
    private Categoria categoria;
    
    
    private String descripcion;
    private String detalle;
    private double precio;
    private int existencias;
    private String rutaImagen;
    private boolean activo;
   

    public Producto() {
    }
    
}
