package org.flintcore.cofee.contenedor;

public class Cafetera {

    private int cantidadCafe;

    public Cafetera() {
    }

    public Cafetera(int cantidadCafe) {
        this.cantidadCafe = cantidadCafe;
    }

    public int getCantidadCafe() {
        return cantidadCafe;
    }

    public void setCantidadCafe(int cantidadCafe) {
        this.cantidadCafe = cantidadCafe;
    }

    public boolean hasCafe(int cantidadVasos) {
        return this.cantidadCafe >= cantidadVasos;
    }

    public int giveCafe(int cantidadCafe) {

        if (hasCafe(cantidadCafe)){
            setCantidadCafe(getCantidadCafe() - cantidadCafe);

            return cantidadCafe;
        }

        return 0;
    }
}
