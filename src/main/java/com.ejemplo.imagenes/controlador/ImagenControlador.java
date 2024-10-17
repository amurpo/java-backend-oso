package com.ejemplo.imagenes.controlador;

import com.ejemplo.imagenes.modelo.Imagen;
import com.ejemplo.imagenes.repositorio.ImagenRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin(origins = {
        "http://localhost:3000",
        "http://192.168.1.226:8081",
        "http://localhost:8081"
})
public class ImagenControlador {
    @Autowired
    private ImagenRepositorio imagenRepositorio;

    @GetMapping("/")
    public String readRoot() {
        return "API is running";
    }

    @GetMapping("/images")
    public List<Imagen> getImages() {
        return imagenRepositorio.findAll();
    }
}
