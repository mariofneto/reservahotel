package com.github.mariofneto.reservahotel.services;

import java.util.List;

import com.github.mariofneto.reservahotel.domains.Quarto;
import com.github.mariofneto.reservahotel.repositories.QuartoRepository;

public class QuartoServices {
    private final QuartoRepository quartoRepository;

    public QuartoServices(QuartoRepository quartoRepository) {
        this.quartoRepository = quartoRepository;
    }

    public List<Quarto> todosQuartos() {
        return quartoRepository.findAll();
    }

    public Quarto obterQuartoPorNumero(Long numero) {
        return quartoRepository.findById(numero).orElse(null);
    }

    public Quarto criarQuarto(Quarto quarto) {
        return quartoRepository.save(quarto);
    }

    public Quarto editarQuarto(Long numero, Quarto quarto) {
        if (quartoRepository.existsById(numero)) {
            quarto.setNumero(numero);
            return quartoRepository.save(quarto);
        }
        return null;
    }

    public void deletarQuarto(Long numero) {
        quartoRepository.deleteById(numero);
    }
}
