package com.upchiapas.veterinaria.modelos;
    public class Usuario {
        private String nombre;
        private int folio;

        public Usuario(String nombre, int folio) {
            this.nombre = nombre;
            this.folio = folio;
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public int getFolio() {
            return folio;
        }

        public void setFolio(int folio) {
            this.folio = folio;
        }
    }
