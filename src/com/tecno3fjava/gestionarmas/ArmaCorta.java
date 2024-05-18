package com.tecno3fjava.gestionarmas;

class ArmaCorta extends Arma {
    private boolean esAutomatica;

    public ArmaCorta(Policia policia, int cantidadMuniciones, double alcanceMetros, String marca, int calibre, String estado, boolean esAutomatica) {
        super(policia, cantidadMuniciones, alcanceMetros, marca, calibre, estado);
        this.esAutomatica = esAutomatica;
    }

    public boolean disparaMas200m() {
        return getAlcanceMetros() > 200;
    }

    public boolean isEsAutomatica() {
        return esAutomatica;
    }

    public void setEsAutomatica(boolean esAutomatica) {
        this.esAutomatica = esAutomatica;
    }
}