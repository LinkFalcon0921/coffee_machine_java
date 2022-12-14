package org.flintcore.cofee.contenedor;

public class Azucarero {

    private int cantidadDeAzucar;

    public Azucarero(int cantidadAzucar) {
        this.cantidadDeAzucar = cantidadAzucar;
    }

    public int getCantidadDeAzucar() {
        return cantidadDeAzucar;
    }

    public void setCantidadDeAzucar(int cantidadDeAzucar) {
        this.cantidadDeAzucar = cantidadDeAzucar;
    }

    public boolean hasAzucar(int cantidadDeAzucar) {
        return this.cantidadDeAzucar >= cantidadDeAzucar;
    }

    public int giveAzucar(int cantidadDeAzucar) {
        if (this.hasAzucar(cantidadDeAzucar)) {
            this.setCantidadDeAzucar(this.getCantidadDeAzucar() - cantidadDeAzucar);

            return cantidadDeAzucar;
        }

        return 0;
    }

}
