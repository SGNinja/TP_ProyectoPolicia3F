package gestion.armas.policia3f;

class ArmaLarga extends Arma implements Comparable<ArmaLarga> {
    private boolean tieneRenar;
    private String descripcionUso;
    private int nivel;

    public ArmaLarga(Policia policia, int cantidadMuniciones, double alcanceMetros, String marca, int calibre, String estado, boolean tieneRenar, String descripcionUso, int nivel) {
        super(policia, cantidadMuniciones, alcanceMetros, marca, calibre, estado);
        this.tieneRenar = tieneRenar;
        this.descripcionUso = descripcionUso;
        this.nivel = nivel;
    }

    @Override
    public int compareTo(ArmaLarga otra) {
        return Integer.compare(this.nivel, otra.nivel);
    }

    public boolean isTieneRenar() {
        return tieneRenar;
    }

    public String getDescripcionUso() {
        return descripcionUso;
    }

    public int getNivel() {
        return nivel;
    }

    public void setTieneRenar(boolean tieneRenar) {
        this.tieneRenar = tieneRenar;
    }

    public void setDescripcionUso(String descripcionUso) {
        this.descripcionUso = descripcionUso;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }
}