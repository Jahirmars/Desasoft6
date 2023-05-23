package com.example.iniciodesesion;

import android.os.Bundle;

public class Registrarse {

    private String Nombre;
    private String Cedula;
    private String Correo;
    private String Contraseña;

    public Registrarse(String nombre, String cedula, String correo, String contraseña) {
        Nombre = nombre;
        Cedula = cedula;
        Correo = correo;
        Contraseña = contraseña;
    }

    public String getNombre() {
        return Nombre;
    }

    public String getCedula() {
        return Cedula;
    }

    public String getCorreo() {
        return Correo;
    }

    public String getContraseña() {
        return Contraseña;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public void setCedula(String cedula) {
        Cedula = cedula;
    }

    public void setCorreo(String correo) {
        Correo = correo;
    }

    public void setContraseña(String contraseña) {
        Contraseña = contraseña;
    }




    }

