package com.upchiapas.veterinaria.modelos;

import java.util.ArrayList;
import java.util.LinkedList;

public class Cliente {
    private String nombreC;
    private int folioC;
    public ArrayList<Mascota> listaMascotas = new ArrayList<>();
    public LinkedList<Producto> listaProductos = new LinkedList<Producto>();

    public Cliente(String nombreC, int folioC) {
        this.nombreC = nombreC;
        this.folioC = folioC;
    }
    @Override
    public String toString() {
        return "Alumno:     \n" +
                "NombreC = " + nombreC + "\n" +
                "folioC = " + folioC + "\n" +
                "Mascota cargadas : " + listaMascotas;
    }

    public String getNombreC() {
        return nombreC;
    }

    public void setNombreC(String nombreC) {
        this.nombreC = nombreC;
    }

    public int getFolioC() {
        return folioC;
    }

    public void setFolioC(int folioC) {
        this.folioC = folioC;
    }

    public ArrayList<Mascota> getListaMascotas() {
        return listaMascotas;
    }

    public void setListaMascotas(ArrayList<Mascota> listaMascotas) {
        this.listaMascotas = listaMascotas;
    }

    public LinkedList<Producto> getListaProductos() {
        return listaProductos;
    }

    public void setListaProductos(LinkedList<Producto> listaProductos) {
        this.listaProductos = listaProductos;
    }
}
