/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Tienda_SC403.service;

import com.Tienda_SC403.domain.Usuario;
import org.springframework.security.core.userdetails.*;

public interface UsuarioDetailsService {
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException;
    
    public Usuario getUsuarioPorUsername(String username);
    
}