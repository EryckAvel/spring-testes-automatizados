import com.eryckavel.IPessoaService;
import com.eryckavel.Pessoa;
import com.eryckavel.PessoaService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PessoaServiceTest {

    Pessoa pessoa;

    @BeforeEach
    void setup(){
        pessoa = new Pessoa(
                "Eryck",
                "Calisto",
                "teste@gmail.com",
                "Rua 27, 1206",
                "Masculino"
        );
    }

    @Test
    @DisplayName("Quando criar uma pessoa e for sucedida ela deve retornar uma pessoa!")
    void testCriandoPessoa_QuandoSucedido_retornarPessoa(){
        IPessoaService service = new PessoaService();
        Pessoa pessoaAtual = service.criarPessoa(pessoa);
        assertNotNull(pessoaAtual, () -> "O criarPessoa() não possue retorno null!");

    }

    @Test
    @DisplayName("Quando criar uma pessoa e for sucedida ela deve ter todos os campos preenchidos e retornar uma pessoa!")
    void testeCriandoPessoa_QuandoSucedido_ContemCamposPreenchidosERetornarPessoa(){
        IPessoaService service = new PessoaService();
        Pessoa pessoaAtual = service.criarPessoa(pessoa);
        assertNotNull(pessoaAtual.getId(), () -> "Id esta retornando nulo!");
        assertNotNull(pessoaAtual.getPrimeiroNome(), () -> "Primeiro Nome esta retornando nulo!");
        assertEquals(pessoa.getPrimeiroNome(), pessoaAtual.getPrimeiroNome(), () -> "O primeiro nome e diferente!");
        assertNotNull(pessoaAtual.getSegundoNome(), () -> "Segundo Nome esta retornando nulo!");
        assertEquals(pessoa.getSegundoNome(), pessoaAtual.getSegundoNome(), () -> "O segundo nome e diferente!");
        assertNotNull(pessoaAtual.getEmail(), () -> "Email esta retornando nulo!");
        assertEquals(pessoa.getEmail(), pessoaAtual.getEmail(), () -> "O Email e diferente!");
        assertNotNull(pessoaAtual.getEndereco(), () -> "Endereco esta retornando nulo!");
        assertEquals(pessoa.getEndereco(), pessoaAtual.getEndereco(), () -> "O Endereco e diferente!");
        assertNotNull(pessoaAtual.getGenero(), () -> "Genero esta retornando nulo!");
        assertEquals(pessoa.getGenero(), pessoaAtual.getGenero(), () -> "O Genero e diferente!");
        assertNotNull(pessoaAtual, () -> "O criarPessoa() não possue retorno null!");
    }

    @Test
    @DisplayName("Quando criar uma pessoa e for sucedida ela deve conter primeiro nome e retornar uma pessoa!")
    void testCriandoPessoa_QuandoSucedido_ContemPrimeiroNomeERetornarPessoa(){
        IPessoaService service = new PessoaService();
        Pessoa pessoaAtual = service.criarPessoa(pessoa);
        assertNotNull(pessoaAtual.getPrimeiroNome(), () -> "Primeiro Nome esta retornando nulo!");
        assertEquals(pessoa.getPrimeiroNome(), pessoaAtual.getPrimeiroNome(), () -> "O primeiro nome e diferente!");
    }

    @Test
    @DisplayName("Quando criar uma pessoa e for sucedida ela deve conter segundo nome e retornar uma pessoa!")
    void testeCriandoPessoa_QuandoSucedido_ContemSegundoNomeERetornarPessoa(){
        IPessoaService service = new PessoaService();
        Pessoa pessoaAtual = service.criarPessoa(pessoa);
        assertNotNull(pessoaAtual.getSegundoNome(), () -> "Segundo Nome esta retornando nulo!");
        assertEquals(pessoa.getSegundoNome(), pessoaAtual.getSegundoNome(), () -> "O segundo nome e diferente!");
    }

    @Test
    @DisplayName("Quando criar uma pessoa e for sucedida ela deve conter email e retornar uma pessoa!")
    void testeCriandoPessoa_QuandoSucedido_ContemEmailERetornarPessoa(){
        IPessoaService service = new PessoaService();
        Pessoa pessoaAtual = service.criarPessoa(pessoa);
        assertNotNull(pessoaAtual.getEmail(), () -> "Email esta retornando nulo!");
        assertEquals(pessoa.getEmail(), pessoaAtual.getEmail(), () -> "O Email e diferente!");
    }

    @Test
    @DisplayName("Quando criar uma pessoa e for sucedida ela deve conter endereco e retornar uma pessoa!")
    void testeCriandoPessoa_QuandoSucedido_ContemEnderecoERetornarPessoa(){
        IPessoaService service = new PessoaService();
        Pessoa pessoaAtual = service.criarPessoa(pessoa);
        assertNotNull(pessoaAtual.getEndereco(), () -> "Endereco esta retornando nulo!");
        assertEquals(pessoa.getEndereco(), pessoaAtual.getEndereco(), () -> "O Endereco e diferente!");
    }

    @Test
    @DisplayName("Quando criar uma pessoa e for sucedida ela deve conter genero e retornar uma pessoa!")
    void testeCriandoPessoa_QuandoSucedido_ContemGeneroERetornarPessoa(){
        IPessoaService service = new PessoaService();
        Pessoa pessoaAtual = service.criarPessoa(pessoa);
        assertNotNull(pessoaAtual.getGenero(), () -> "Genero esta retornando nulo!");
        assertEquals(pessoa.getGenero(), pessoaAtual.getGenero(), () -> "O Genero e diferente!");
    }

}
