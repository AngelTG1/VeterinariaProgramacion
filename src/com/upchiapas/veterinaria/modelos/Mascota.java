package com.upchiapas.veterinaria.modelos;

public class Mascota {
    private String nombreM, tipoM, especieM, generM;

    public Mascota(String nombreM, String tipoM, String especieM, String generM) {
        this.nombreM = nombreM;
        this.tipoM = tipoM;
        this.especieM = especieM;
        this.generM = generM;
    }

    public String getNombreM() {
        return nombreM;
    }

    public void setNombreM(String nombreM) {
        this.nombreM = nombreM;
    }

    public String getTipoM() {
        return tipoM;
    }

    public void setTipoM(String tipoM) {
        this.tipoM = tipoM;
    }

    public String getEspecieM() {
        return especieM;
    }

    public void setEspecieM(String especieM) {
        this.especieM = especieM;
    }

    public String getGenerM() {
        return generM;
    }

    public void setGenerM(String generM) {
        this.generM = generM;
    }

}
