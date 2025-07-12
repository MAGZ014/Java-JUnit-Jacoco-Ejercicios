package org.magz014;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class ExampleTest {

    private Example example;

    @BeforeEach
    void init(){
        this.example = new Example();
    }

    @Test
    void testSumar(){
        // Given
        int numberA = 1;
        int numberB = 1;

        // When
        int result = example.sumar(numberA,numberB);

        // Then
        assertNotNull(result);
        assertEquals(2,result);
        assertInstanceOf(Integer.class, result);
    }

    @Test
    void testCheckPositivo(){
        // Given
        int number= 1;

        // When
        boolean result = example.checkPositivo(number);

        //Then
        assertTrue(result);
    }

    @Test
    void testCheckPositivoError(){
        // Given
        int number= -1;

        //Then
        assertThrows(IllegalArgumentException.class, () -> {
            example.checkPositivo(number);
        });
    }

    @Test
    void testContarLetrasA(){
        //G
        String cadena = "hola como estas maria";

        //W
        int result = example.contarLetrasA(cadena);

        //T
        assertNotNull(result);
        assertEquals(4, result);
    }

    @Test
    void testContieneElemento(){
        List<String> paises = List.of("Mexico", "Colombia", "Peru");
        String pais = "Mexico";

        boolean result = this.example.contieneElemento(paises, pais);

        assertTrue(result);
    }

    @Test
    void testRevertirCadena(){
        String cadena = "cadena";

        String result = this.example.revertirCadena(cadena);

        assertEquals("anedac", result);
    }

    @Test
    void testFactorial(){
        int number = 12;

        long result =  this.example.factorial(number);

        assertEquals(479001600,result);

    }

    @Test
    void testFactorialError(){
        int number = -12;

        assertThrows(IllegalArgumentException.class,()->{
            this.example.factorial(number);
        });
    }

    @Test
    void testEsPrimo(){
        int number = 3;

        boolean result = this.example.esPrimo(number);

        assertTrue(result);
    }

    @Test
    void testEsPrimoLessThanOne(){
        int number = -1;

        boolean result = this.example.esPrimo(number);

        assertFalse(result);
    }

    @Test
    void testNoEsPrimo(){
        int number = 8;

        boolean result = this.example.esPrimo(number);

        assertFalse(result);
    }

    @Test
    void testEsPrimoMayor(){
        int number = 7;

        boolean result = this.example.esPrimo(number);

        assertTrue(result);
    }

    @Test
    void testMensajeConRetraso() throws InterruptedException {

        String result = this.example.mensajeConRetraso();

        assertEquals("Listo después de retraso", result);
    }

    @Test
    void testConvertirAString(){
        List<Integer> numbersList = List.of(1,2,3,4,5,6,76,8);
        List<String> numbersList1 = List.of("1","2","3","4","5","6","76","8");

        List<String> result = this.example.convertirAString(numbersList);

        assertEquals(numbersList1, result);
    }

    @Test
    void testCalcularMedia(){
        // Given
        List<Integer> numberList = List.of(1,2,3,4,5,6,7,8,9,10);

        //When
        double result = this.example.calcularMedia(numberList);

        //Then
        assertEquals(5.5,result);
    }

    @Test
    void testCalcularMediaNull(){
        // Given
        List<Integer> numberList = null;

        //Then When
        assertThrows(IllegalArgumentException.class, () -> {
           this.example.calcularMedia(numberList);
        });
    }

    @Test
    void testCalcularMediaEmpty(){
        // Given
        List<Integer> numberList = List.of();

        //Then When
        assertThrows(IllegalArgumentException.class, () -> {
            this.example.calcularMedia(numberList);
        });
    }

    @Test
    void testConvertirListaAString(){
        // Given
        List<String> numbersList = List.of("1","2","3","4","5","6","76","8");

        // When
        String result = this.example.convertirListaAString(numbersList);

        // Then
        assertEquals("1,2,3,4,5,6,76,8", result);
    }
}
