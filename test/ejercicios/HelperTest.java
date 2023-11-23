package ejercicios;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HelperTest {

    @Test
    void testCalcularValorMedio() {
        assertEquals(2, Helper.calcularValorMedio(2, 2));
        assertEquals(0, Helper.calcularValorMedio(-2, 2));
        assertEquals(-2, Helper.calcularValorMedio(-2, -2));
        assertEquals(2.5, Helper.calcularValorMedio(2, 3));
    }


    @Test
    void calcularRaizCuadrada() {
        assertEquals(2, Helper.calcularRaizCuadrada(4));
        assertEquals((float) Math.sqrt(3), Helper.calcularRaizCuadrada(3));
        assertTrue(Float.isNaN(Helper.calcularRaizCuadrada(-3)));
    }

    @Test
    void devolverDosCuadrados() {
        assertNotNull(Helper.devolverDosCuadrados(1, 2));
        assertArrayEquals(new int[]{1,4}, Helper.devolverDosCuadrados(1, 2));
        assertArrayEquals(new int[]{1,4}, Helper.devolverDosCuadrados(-1, -2));

    }

    @Test
    void devolverMayorValor() {
        assertEquals(3, Helper.devolverMayorValor(3, 1));
        assertEquals(3, Helper.devolverMayorValor(1, 3));
        assertEquals(3, Helper.devolverMayorValor(3, 3));
        assertEquals(3, Helper.devolverMayorValor(3, 0));
        assertEquals(0, Helper.devolverMayorValor(-3, 0));
        assertEquals(-3, Helper.devolverMayorValor(-3, -10));


    }

    @Test
    void devolverMenorValor() {
        assertEquals(1, Helper.devolverMenorValor(3, 1, 2));
        assertEquals(1, Helper.devolverMenorValor(1, 3, 3));
        assertEquals(3, Helper.devolverMenorValor(3, 3, 3));
        assertEquals(-9, Helper.devolverMenorValor(3, 0, -9));
        assertEquals(-3, Helper.devolverMenorValor(-3, 0, 1));
        assertEquals(-10, Helper.devolverMenorValor(-3, -10, 0));
    }

    @Test
    void esPrimo() {
        assertFalse(Helper.esPrimo(4));
        assertTrue(Helper.esPrimo(3));
        assertTrue(Helper.esPrimo(77_232_917));
        assertFalse(Helper.esPrimo(77_232_911));
        assertTrue(Helper.esPrimo(1));
        assertFalse(Helper.esPrimo(0));
        assertFalse(Helper.esPrimo(-10));
    }

    @Test
    void esParOImpar() {
        assertNotNull(Helper.esParOImpar(2));
        assertEquals("PAR", Helper.esParOImpar(2));
        assertEquals("IMPAR", Helper.esParOImpar(3));
        assertNotEquals("PAR", Helper.esParOImpar(5));
        assertNotEquals("IMPAR", Helper.esParOImpar(6));
        assertEquals("PAR", Helper.esParOImpar(-2));
        assertEquals("IMPAR", Helper.esParOImpar(-3));
        assertEquals("PAR", Helper.esParOImpar(0));

    }

    @Test
    void esDivisible() {
        assertFalse(Helper.esDivisible(3, 2));
        assertFalse(Helper.esDivisible(1, 2));
        assertFalse(Helper.esDivisible(-3, 2));
        assertFalse(Helper.esDivisible(3, -2));
        assertFalse(Helper.esDivisible(-3, -2));
        assertTrue(Helper.esDivisible(4, 2));
        assertTrue(Helper.esDivisible(-4, 2));
        assertTrue(Helper.esDivisible(-4, -2));
        assertTrue(Helper.esDivisible(0, 2));
        assertTrue(Helper.esDivisible(0, -2));
        assertFalse(Helper.esDivisible(0, 0));
        assertFalse(Helper.esDivisible(3, 0));
        assertFalse(Helper.esDivisible(-3, 0));
    }
}