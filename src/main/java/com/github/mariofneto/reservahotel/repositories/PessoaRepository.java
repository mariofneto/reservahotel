package com.github.mariofneto.reservahotel.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.github.mariofneto.reservahotel.domains.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Long> {

}
