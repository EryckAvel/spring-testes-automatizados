package com.eryckavel;

import java.io.Serializable;
import java.util.Objects;

public class Pessoa implements Serializable {

    private Long id;
    private String primeiroNome;
    private String segundoNome;
    private String email;
    private String endereco;
    private String genero;

    public Pessoa() {
    }

    public Pessoa(String primeiroNome, String segundoNome, String email, String endereco, String genero) {
        this.primeiroNome = primeiroNome;
        this.segundoNome = segundoNome;
        this.email = email;
        this.endereco = endereco;
        this.genero = genero;
    }

    public Pessoa(Long id, String primeiroNome, String segundoNome, String email, String endereco, String genero) {
        this.id = id;
        this.primeiroNome = primeiroNome;
        this.segundoNome = segundoNome;
        this.email = email;
        this.endereco = endereco;
        this.genero = genero;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPrimeiroNome() {
        return primeiroNome;
    }

    public void setPrimeiroNome(String primeiroNome) {
        this.primeiroNome = primeiroNome;
    }

    public String getSegundoNome() {
        return segundoNome;
    }

    public void setSegundoNome(String segundoNome) {
        this.segundoNome = segundoNome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pessoa pessoa = (Pessoa) o;
        return Objects.equals(id, pessoa.id) && Objects.equals(primeiroNome, pessoa.primeiroNome) && Objects.equals(segundoNome, pessoa.segundoNome) && Objects.equals(email, pessoa.email) && Objects.equals(endereco, pessoa.endereco) && Objects.equals(genero, pessoa.genero);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, primeiroNome, segundoNome, email, endereco, genero);
    }
}
