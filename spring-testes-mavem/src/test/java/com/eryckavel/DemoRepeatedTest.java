package com.eryckavel;

import com.eryckavel.math.MatematicaSimples;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class DemoRepeatedTest {

    private static final double N1 = 10;

    MatematicaSimples matematica;

    @BeforeEach
    void instaciMatematica(){
        matematica = new MatematicaSimples();
    }

    @RepeatedTest(value = 3, name = "{displayName}, repetição " + "{currentRepetition} de {totalRepetitions}")
    @DisplayName("Teste divisão por 0")
    void testDivisao_quando_dezdivididoporquatro_retornardoispontocinco(RepetitionInfo repetitionInfo, TestInfo testInfo){
        System.out.println("Nome do Teste : " + testInfo.getTestMethod().get().getName());
        System.out.println("Repetição atual : " + repetitionInfo.getCurrentRepetition());
        String mensagemesperada = "Impossivel dividir por zero!";
        ArithmeticException atual = assertThrows(ArithmeticException.class,
                () -> matematica.divisao(N1, 0D),
                () -> "Divião por zero irar retonar uma ArithmeticException"
        );
        assertEquals(mensagemesperada, atual.getMessage(), () -> "Mensagem de exceção incorreta!");
    }

}
