package org.flintcore.cofee.base;

import org.flintcore.cofee.contenedor.Azucarero;
import org.flintcore.cofee.contenedor.Cafetera;
import org.flintcore.cofee.contenedor.Vaso;

public class Maquinita {

    private Cafetera cafetera;
    private Azucarero azucarero;
    private Vaso vasoPequeno;
    private Vaso vasoMediano;
    private Vaso vasoGrande;

    public Maquinita() {

    }

    public Cafetera getCafetera() {
        return cafetera;
    }

    public void setCafetera(Cafetera cafetera) {
        this.cafetera = cafetera;
    }

    public Azucarero getAzucarero() {
        return azucarero;
    }

    public void setAzucarero(Azucarero azucarero) {
        this.azucarero = azucarero;
    }

    public void setVasoPequeno(Vaso vasoPequeno) {
        this.vasoPequeno = vasoPequeno;
    }

    public void setVasoMediano(Vaso vasoMediano) {
        this.vasoMediano = vasoMediano;
    }

    public void setVasoGrande(Vaso vasoGrande) {
        this.vasoGrande = vasoGrande;
    }

    public Vaso getTipoDeVaso(String tipoVaso) {
        switch (tipoVaso) {
            case "pequeno":
                return this.vasoPequeno;
            case "grande":
                return this.vasoGrande;
            case "mediano":
                return this.vasoMediano;

        }
        return null;
    }

    public String getVasoDeCafe(Vaso vasoSeleccionado, int cantidadVasos, int cantidadAzucar) {
        if (!vasoSeleccionado.hasVasos(cantidadVasos)) {
            return "No hay Vasos";
        }
        if (!azucarero.hasAzucar(cantidadAzucar)) {
            return "No hay Azucar";
        }
        int contenidoEsperado = vasoSeleccionado.getContenido() * cantidadVasos;
        if (!cafetera.hasCafe(contenidoEsperado)) {
            return "No hay Cafe";
        }
        vasoSeleccionado.giveVasos(cantidadVasos);
        azucarero.giveAzucar(cantidadAzucar);
        cafetera.giveCafe(contenidoEsperado);
        return "Felicitaciones";
    }
}

