package com.eryckavel.math;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.*;

import java.util.stream.Stream;
import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Teste de Matematica Simples")
class MatetaticaSimplesTestS4 {

    MatematicaSimples matematica;

    @BeforeEach
    void instaciMatematica(){
        matematica = new MatematicaSimples();
    }

    public static Stream<Arguments> testDivisaoValores(){
        return Stream.of(
                Arguments.of(10D, 4D, 2.5D),
                Arguments.of(10D, 2D, 5D),
                Arguments.of(100D, 100D, 1D),
                Arguments.of(71D, 14D, 5.07D),
                Arguments.of(18.3D, 3.1D, 5.09D)
        );
    }

    @ParameterizedTest
    @MethodSource("testDivisaoValores")
    @DisplayName("Teste divisão de valores parametrizados por method")
    void testDivisao_quando_dividirvalores_retornarvalorcorretopormetodos(double n1, double n2, double experado){
        Double result = matematica.divisao(n1, n2);
        assertEquals(experado, result, 2D, () -> "O metodo divisao não produzio o resultado esperado!");
    }


    @ParameterizedTest
    /*
    @CsvSource({
            "10, 4, 2.5",
            "10, 2, 5",
            "100, 100, 1",
            "71, 14, 5.07",
            "18.3, 3.1, 5.09"
    })
    @CsvSource({
        "Eryck, ''",
        "Marta, Mãe"
    })
    */
    @CsvFileSource(resources = "/testDivisao.csv")
    @DisplayName("Teste divisão de valores parametrizados por csv")
    void testDivisao_quando_dividirvalores_retornarvalorcorretoporcsv(double n1, double n2, double experado){
        Double result = matematica.divisao(n1, n2);
        assertEquals(experado, result, 2D, () -> "O metodo divisao não produzio o resultado esperado!");
    }

    @ParameterizedTest
    @ValueSource(strings = {"Tiago", "Lucas", "Eryck", "Telles"})
    void testValueScore(String primeiroNome){
        System.out.println(primeiroNome);
        assertNotNull(primeiroNome);
    }


}
