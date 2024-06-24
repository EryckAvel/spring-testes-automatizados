package com.eryckavel;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import java.util.Arrays;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Assertions.*;

public class CompararArraysTest {

    @Test
    @DisplayName("Validar ordenaçao de valores.")
    void testOrdenarArray_Ordenarvalores_retonarValoresOrdenados(){
        int[] numeros = {25, 40, 12, 45};
        int[] numerosExperados = {12, 25, 40, 45};
        Arrays.sort(numeros);
        assertArrayEquals(numerosExperados, numeros);
    }

    @Test
    //@Timeout(1)
    @Timeout(value = 3, unit = TimeUnit.SECONDS)
    @DisplayName("Validar time out de ordenaçao de valores.")
    void testPerformarceOrderarArray_timeOutOrdenarArray_timeOut(){
        int[] numeros = {25, 40, 12, 45};
        for (int i = 0; i < 1000000000; i++) {
            numeros[0] = i;
            Arrays.sort(numeros);
        }
    }


}
