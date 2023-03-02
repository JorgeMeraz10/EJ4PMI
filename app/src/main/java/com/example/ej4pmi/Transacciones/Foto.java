package com.example.ej4pmi.Transacciones;

import android.content.Intent;

import java.sql.Blob;

public class Foto {
    private Integer id;
    private Blob imagen;

    public Foto(Blob imagen) {
        this.imagen = imagen;
        this.id = id;
    }

    public Foto(){}

    public Blob getImagen() {
        return imagen;
    }

    public void setImagen(Blob imagen) {
        this.imagen = imagen;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}


