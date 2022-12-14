package org.flintcore.cofee.base;

import org.flintcore.cofee.contenedor.Azucarero;
import org.flintcore.cofee.contenedor.Cafetera;
import org.flintcore.cofee.contenedor.Vaso;

import java.util.HashMap;
import java.util.Map;

/**
 * Clase grande: contiene vasos, azucarero y la cafetera
 */
public class MaquinaDeCafe {

    public static final String PEQUENO = "pequeno",
            MEDIANO = "mediano",
            GRANDE = "grande";

    private Cafetera cafetera;
    private Map<String, Vaso> vasos;
    private Azucarero azucarero;

    public MaquinaDeCafe() {
        this.vasos = new HashMap<>();
    }

    public Vaso getTipoDeVaso(String tipoVaso) {
        return this.vasos.get(tipoVaso);
    }

    public String getVasoDeCafe(Vaso vasoSeleccionado, int cantidadVasos, int cantidadAzucar) {

        if (!vasoSeleccionado.hasVasos(cantidadVasos)){
            return "No hay Vasos";
        }

        if (!azucarero.hasAzucar(cantidadAzucar)){
            return "No hay Azucar";
        }

        int contenidoEsperado = vasoSeleccionado.getContenido() * cantidadVasos;

        if (!cafetera.hasCafe(contenidoEsperado)){
            return "No hay Cafe";
        }

        vasoSeleccionado.giveVasos(cantidadVasos);
        azucarero.giveAzucar(cantidadAzucar);
        cafetera.giveCafe(contenidoEsperado);

        return "Felicitaciones";
    }

    public void setVasoPequeno(Vaso vaso) {
        this.vasos.put(PEQUENO, vaso);
    }

    public void setVasoMediano(Vaso vaso) {
        this.vasos.put(MEDIANO, vaso);
    }

    public void setVasoGrande(Vaso vaso) {
        this.vasos.put(GRANDE, vaso);
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
}
