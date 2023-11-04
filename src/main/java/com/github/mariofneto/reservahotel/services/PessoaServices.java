package com.github.mariofneto.reservahotel.services;

import java.util.List;

import com.github.mariofneto.reservahotel.domains.Pessoa;
import com.github.mariofneto.reservahotel.repositories.PessoaRepository;

public class PessoaServices {
    private final PessoaRepository pessoaRepository;

    public PessoaServices(PessoaRepository pessoaRepository) {
        this.pessoaRepository = pessoaRepository;
    }

    public List<Pessoa> todasPessoas() {
        return pessoaRepository.findAll();
    }

    public Pessoa obterPessoaPorId(Long id) {
        return pessoaRepository.findById(id).orElse(null);
    }

    public Pessoa criarPessoa(Pessoa pessoa) {
        return pessoaRepository.save(pessoa);
    }

    public Pessoa editarPessoa(Long id, Pessoa pessoa) {
        if (pessoaRepository.existsById(id)) {
            pessoa.setId(id);
            return pessoaRepository.save(pessoa);
        }
        return null;
    }

    public void deletarPessoa(Long id) {
        pessoaRepository.deleteById(id);
    }
}
