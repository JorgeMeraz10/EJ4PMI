package com.example.ej4pmi.Transacciones;

public class Transacciones {

    //Nombre de la base de datos

    public static final String NameDatabase = "PM03DB";

    //Tablas de la base de datos
    public  static final String tablacontactos = "fotos";

    /* Transacciones de la base de datos PM03DB; */

    public static final String CreateTBContactos =
            "CREATE TABLE fotos (id INTEGER PRIMARY KEY AUTOINCREMENT, "+
                    " imagen BLOB)";

    public static final String DropTableContactos = "DROP TABLE IF EXISTS fotos";

    //Helpers
    public static final String Empty = "";
}
