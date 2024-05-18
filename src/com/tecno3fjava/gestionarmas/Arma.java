package com.tecno3fjava.gestionarmas;

abstract class Arma {
    private Policia policia;
    private int cantidadMuniciones;
    private double alcanceMetros;
    private String marca;
    private int calibre;
    private String estado;

    public Arma(Policia policia, int cantidadMuniciones, double alcanceMetros, String marca, int calibre, String estado) {
        this.policia = policia;
        this.cantidadMuniciones = cantidadMuniciones;
        this.alcanceMetros = alcanceMetros;
        this.marca = marca;
        this.calibre = calibre;
        this.estado = estado;
    }

    public boolean enCondiciones() {
        return estado.equals("EN USO") && calibre >= 9;
    }

    public Policia getPolicia() {
        return policia;
    }

    public int getCantidadMuniciones() {
        return cantidadMuniciones;
    }

    public double getAlcanceMetros() {
        return alcanceMetros;
    }

    public String getMarca() {
        return marca;
    }

    public int getCalibre() {
        return calibre;
    }

    public String getEstado() {
        return estado;
    }

    public void setPolicia(Policia policia) {
        this.policia = policia;
    }

    public void setCantidadMuniciones(int cantidadMuniciones) {
        this.cantidadMuniciones = cantidadMuniciones;
    }

    public void setAlcanceMetros(double alcanceMetros) {
        this.alcanceMetros = alcanceMetros;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setCalibre(int calibre) {
        this.calibre = calibre;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Arma [policia=" + policia + ", cantidadMuniciones=" + cantidadMuniciones + ", alcanceMetros=" + alcanceMetros
                + ", marca=" + marca + ", calibre=" + calibre + ", estado=" + estado + "]";
    }
}