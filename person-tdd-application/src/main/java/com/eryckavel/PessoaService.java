package com.eryckavel;

import java.util.concurrent.atomic.AtomicLong;

public class PessoaService implements IPessoaService {
    @Override
    public Pessoa criarPessoa(Pessoa pessoa) {
        Long id = new AtomicLong().incrementAndGet();
        pessoa.setId(id);
        return pessoa;
    }
}
