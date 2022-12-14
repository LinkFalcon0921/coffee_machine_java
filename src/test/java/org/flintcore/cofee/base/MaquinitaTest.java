package org.flintcore.cofee.base;

import org.flintcore.cofee.contenedor.Azucarero;
import org.flintcore.cofee.contenedor.Cafetera;
import org.flintcore.cofee.contenedor.Vaso;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaquinitaTest {
    Cafetera cafetera;
    Vaso vasosPequeno;

    Vaso vasosMediano;

    Vaso vasosGrande;
    Azucarero azucarero;
    Maquinita Maquinita;

    @BeforeEach
    public void setUp() {
        cafetera = new Cafetera(50);

        vasosPequeno = new Vaso(5, 10);
        vasosMediano = new Vaso(5, 20);
        vasosGrande = new Vaso(5, 30);

        azucarero = new Azucarero(20);

        Maquinita = new Maquinita();

        Maquinita.setCafetera(cafetera);

        Maquinita.setVasoPequeno(vasosPequeno);
        Maquinita.setVasoMediano(vasosMediano);
        Maquinita.setVasoGrande(vasosGrande);

        Maquinita.setAzucarero(azucarero);

    }

    @Test
    public void deberiaDevolverUnVasoPequeno() {
        Vaso vaso = Maquinita.getTipoDeVaso("pequeno");
        assertEquals(vasosPequeno, vaso);
    }

    @Test
    public void deberiaDevolverUnVasoMediano() {
        Vaso vaso = Maquinita.getTipoDeVaso("mediano");
        assertEquals(vasosMediano, vaso);
    }

    @Test
    public void deberiaDevolverUnVasoGrande() {
        Vaso vaso = Maquinita.getTipoDeVaso("grande");
        assertEquals(vasosGrande, vaso);
    }

    @Test
    public void deberiaDevolverNoHayVasos() {


        Vaso vaso = Maquinita.getTipoDeVaso("pequeno");
        String resultado = Maquinita.getVasoDeCafe(vaso, 10, 2);
        assertEquals("No hay Vasos", resultado);
    }

    @Test
    public void deberiaDevolverNoHayCafe() {
        cafetera = new Cafetera(5);
        Maquinita.setCafetera(cafetera);

        Vaso vaso = Maquinita.getTipoDeVaso("pequeno");
        String resultado = Maquinita.getVasoDeCafe(vaso, 1, 2);
        assertEquals("No hay Cafe", resultado);
    }

    @Test
    public void deberiaDevolverNoHayAzucar() {
        azucarero = new Azucarero(2);
        Maquinita.setAzucarero(azucarero);

        Vaso vaso = Maquinita.getTipoDeVaso("pequeno");
        String resultado = Maquinita.getVasoDeCafe(vaso, 1, 3);
        assertEquals("No hay Azucar", resultado);
    }

    @Test
    public void deberiaRestarCafe() {
        Vaso vaso = Maquinita.getTipoDeVaso("pequeno");
        Maquinita.getVasoDeCafe(vaso, 1, 3);
        int resultado = Maquinita.getCafetera().getCantidadCafe();
        assertEquals(40, resultado);
    }

    @Test
    public void deberiaRestarVaso() {
        Vaso vaso = Maquinita.getTipoDeVaso("pequeno");
        Maquinita.getVasoDeCafe(vaso, 1, 3);
        int resultado = vaso.getCantidadVasos();
        assertEquals(4, resultado);
    }

    @Test
    public void deberiaRestarAzucar() {
        Vaso vaso = Maquinita.getTipoDeVaso("pequeno");
        Maquinita.getVasoDeCafe(vaso, 1, 3);
        int resultado = Maquinita.getAzucarero().getCantidadDeAzucar();
        assertEquals(17, resultado);
    }

    @Test
    public void deberiaDevolverFelicitaciones() {
        Vaso vaso = Maquinita.getTipoDeVaso("pequeno");
        String resultado =
                Maquinita.getVasoDeCafe(vaso, 1, 3);
        assertEquals("Felicitaciones", resultado);

    }

}