package org.flintcore.cofee.contenedor;

public class Vaso {

    private int cantidadVasos;
    private int contenido;

    public Vaso(int cantidadVasos, int contenido) {
        this.cantidadVasos = cantidadVasos;
        this.contenido = contenido;
    }

    public int getCantidadVasos() {
        return cantidadVasos;
    }

    public void setCantidadVasos(int cantidadVasos) {
        this.cantidadVasos = cantidadVasos;
    }

    public int getContenido() {
        return contenido;
    }

    public void setContenido(int contenido) {
        this.contenido = contenido;
    }

//    TODO

    public boolean hasVasos(int cantidadVasos){
        return this.cantidadVasos >= cantidadVasos;
    }

    public int giveVasos(int cantidadVasos){

        if(this.hasVasos(cantidadVasos)){
            this.setCantidadVasos(this.getCantidadVasos() - cantidadVasos);
            return cantidadVasos;
        }

        return 0;
    }
}
