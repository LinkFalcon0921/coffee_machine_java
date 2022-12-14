package org.flintcore.cofee.contenedor;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CafeteraTest {

    @Test
    public void deberiaDevolverVerdaderoSiExisteCafe() {
        Cafetera cafetera = new Cafetera(10);

        boolean resultado = cafetera.hasCafe(5);

        assertEquals(true, resultado);
    }

    @Test
    public void deberiaDevolverFalsoSiNoExisteCafe() {
        Cafetera cafetera = new Cafetera(10);

        boolean resultado = cafetera.hasCafe(11);
        assertEquals(false, resultado);
    }

    @Test
    public void deberiaRestarcafeAlaCafetera() {
        Cafetera cafetera = new Cafetera(10);
        cafetera.giveCafe(7);
        assertEquals(3, cafetera.getCantidadCafe());
    }

}
