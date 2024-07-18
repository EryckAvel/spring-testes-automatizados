package com.eryckavel.ordenacao;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;


@TestMethodOrder(MethodOrderer.MethodName.class)
class MetodoOrdenacaoPorNomeTest {

    @Test
    void testeA(){
        System.out.println("Rodando teste A");
    }

    @Test
    void testeB(){
        System.out.println("Rodando teste B");
    }

    @Test
    void testeC(){
        System.out.println("Rodando teste C");
    }

}
