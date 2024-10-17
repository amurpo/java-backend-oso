package com.ejemplo.imagenes.repositorio;

import com.ejemplo.imagenes.modelo.Imagen;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ImagenRepositorio extends JpaRepository<Imagen, Integer> {
}
