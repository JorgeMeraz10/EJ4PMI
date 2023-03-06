package com.example.ej4pmi.Transacciones;

import java.sql.Blob;

public class FotoImagen {
    private Integer id;
    private byte[] images;

    public FotoImagen(Integer id, byte[] data) {
        this.id = id;
        this.images = images;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public byte[] getImages() {
        return images;
    }

    public void setImages(byte[] images) {
        this.images = images;
    }
}
