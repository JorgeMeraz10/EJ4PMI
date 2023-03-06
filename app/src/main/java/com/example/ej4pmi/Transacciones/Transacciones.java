package com.example.ej4pmi.Transacciones;

public class Transacciones {

    //Nombre de la base de datos

    public static final String NameDatabase = "PM03DB";

    //Tablas de la base de datos
    public  static final String tablaImages = "images";

    /* Transacciones de la base de datos PM03DB; */

    public static final String CreateTBImages =
            "CREATE TABLE fotos (id INTEGER PRIMARY KEY AUTOINCREMENT, images BLOB)";

    public static final String DropTableImages = "DROP TABLE IF EXISTS fotos";

    //Helpers
    public static final String Empty = "";
}
