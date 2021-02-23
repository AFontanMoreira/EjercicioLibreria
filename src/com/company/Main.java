package com.company;
import  libreria.Consola;
import libreria.Ventana;
public class Main {

    public static void main(String[] args) {
        String mensaje="hola";
        Consola miConsola = new Consola();
        Ventana miVentana = new Ventana();
        miConsola.visualizar(mensaje);
        miVentana.visualizar(mensaje);
    }
}
