package com.example.ej4pmi;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import com.example.ej4pmi.Transacciones.FotoImagen;

import java.util.ArrayList;
import java.util.List;

public class ActivityListView extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);

        List<FotoImagen> imagenList = new ArrayList<>();
        String selectQuery = "SELECT id, images FROM fotos";



    }
}