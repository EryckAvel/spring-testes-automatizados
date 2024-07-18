package com.eryckavel.ordenacao;

import org.junit.jupiter.api.*;


@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class MetodoOrdenacaoPorOrderTest {

    StringBuilder valoratual = new StringBuilder("");

    @AfterEach
    void afterEach(){
        System.out.println("Valor atual e : " + valoratual);
    }

    @Test
    @Order(1)
    void testeA(){
        System.out.println("Rodando teste A");
        valoratual.append("1");
    }

    @Test
    @Order(3)
    void testeB(){
        System.out.println("Rodando teste B");
        valoratual.append("2");
    }

    @Test
    @Order(2)
    void testeC(){
        System.out.println("Rodando teste C");
        valoratual.append("3");
    }

}
