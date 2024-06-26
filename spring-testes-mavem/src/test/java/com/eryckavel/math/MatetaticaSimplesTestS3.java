package com.eryckavel.math;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;

@DisplayName("Teste de Matematica Simples")
class MatetaticaSimplesTestS3 {

    private static final double N1 = 10;
    private static final double N2 = 4;
    MatematicaSimples matematica;

    @BeforeAll
    static void setup(){
        System.out.println("Rodando antes dos Testes!");
    }

    @AfterAll
    static void cleanup(){
        System.out.println("Rodando depois dos Testes!");
    }

    @BeforeEach
    void instaciMatematica(){
        matematica = new MatematicaSimples();
    }

    @AfterEach
    void mesagemTeste(){
        System.out.println("Rodando depois desse Testes!");
    }

    @Test
    @Disabled
    @DisplayName("Validando Erro")
    void testeResultado_Quando_retornarerro(){
        fail();
    }

    @Test
    @DisplayName("Teste 10 + 4 = 14")
    void testSoma_quando_dezmaisquatro_retornarquatorze(){
        //given
        double experado = 14;
        //when
        Double result = matematica.soma(N1, N2);
        //then
        assertEquals(experado, result, () -> "O metodo soma não produzio o resultado esperado!");
    }

    @Test
    @DisplayName("Teste 10 - 4 = 6")
    void testSubtracao_quando_dezmenosquatro_retornarseis(){
        Double result = matematica.subtracao(N1, N2);
        double experado = 6;
        assertEquals(experado, result, () -> "O metodo subtração não produzio o resultado esperado!");
    }

    @Test
    @DisplayName("Teste 10 * 4 = 40")
    void testMultiplicacao_quando_dezvezesquatro_retornarquarenta(){
        Double result = matematica.multiplicacao(N1, N2);
        double experado = 40;
        assertEquals(experado, result, () -> "O metodo multiplicacao não produzio o resultado esperado!");
    }

    @Test
    @DisplayName("Teste divisão por 0")
    void testDivisao_quando_dezdivididoporquatro_retornardoispontocinco(){
        String mensagemesperada = "Impossivel dividir por zero!";
        ArithmeticException atual = assertThrows(ArithmeticException.class,
                () -> matematica.divisao(N1, 0D),
                () -> "Divião por zero irar retonar uma ArithmeticException"
        );
        assertEquals(mensagemesperada, atual.getMessage(), () -> "Mensagem de exceção incorreta!");
    }

    @Test
    @DisplayName("Teste 10 / 4 = 2.5")
    void testDivisao_quando_valordividoporzero_retornaerro(){
        Double result = matematica.divisao(N1, N2);
        double experado = 2.5;
        assertEquals(experado, result, () -> "O metodo divisao não produzio o resultado esperado!");
    }

    @Test
    @DisplayName("Teste (10 + 4) / 2 = 7")
    void testMedia_quando_amediafordezequatro_retonarsete(){
        Double result = matematica.media(N1, N2);
        double experado = 7;
        assertEquals(experado, result, () -> "O metodo media não produzio o resultado esperado!");
    }

    @Test
    @DisplayName("Teste raiz de 4 = 2")
    void testRaiz_quando_buscararaizdequatro_retonardois(){
        Double result = matematica.raizQuadrada(N2);
        double experado = 2;
        assertEquals(experado, result, () -> "O metodo raiz quadrada não produzio o resultado esperado!");
    }

}
