package org.flintcore.cofee.contenedor;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class TestAzucarero {
    Azucarero azuquero;

    @BeforeEach
    public void setUp() {
        azuquero = new Azucarero(10);
    }

    @Test
    public void deberiadevolverVerdaderoSiHaySuficienteAzucarEnElAzuquero() {

        boolean resultado = azuquero.hasAzucar(5);
        assertEquals(true, resultado);
        resultado = azuquero.hasAzucar(10);
        assertEquals(true, resultado);

    }

    @Test
    public void deberiadevolverFalsoPorqueNoHaySuficienteAzucarEnE1Azuquero() {
        boolean resultado = azuquero.hasAzucar(15);
        assertEquals(false, resultado);
    }

    @Test
    public void deberiaRestarAzucarAlAzuquero() {
        azuquero.giveAzucar(5);
        assertEquals(5, azuquero.getCantidadDeAzucar());
        azuquero.giveAzucar(2);
        assertEquals(3, azuquero.getCantidadDeAzucar());
    }


}