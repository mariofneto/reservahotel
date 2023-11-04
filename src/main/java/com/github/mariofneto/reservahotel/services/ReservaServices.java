package com.github.mariofneto.reservahotel.services;

import java.util.List;

import com.github.mariofneto.reservahotel.domains.Quarto;
import com.github.mariofneto.reservahotel.domains.Reserva;
import com.github.mariofneto.reservahotel.repositories.QuartoRepository;
import com.github.mariofneto.reservahotel.repositories.ReservaRepository;

public class ReservaServices {
    private final ReservaRepository reservaRepository;
    private final QuartoRepository quartoRepository;

    public ReservaServices(ReservaRepository reservaRepository, QuartoRepository quartoRepository) {
        this.reservaRepository = reservaRepository;
        this.quartoRepository = quartoRepository;
    }

    public List<Reserva> todasReservas() {
        return reservaRepository.findAll();
    }

    public Reserva obterReservaPorId(Long id) {
        return reservaRepository.findById(id).orElse(null);
    }

    public Reserva criarReserva(Reserva reserva) {
        Quarto quarto = quartoRepository.findById(reserva.getQuarto().getNumero()).orElse(null);

        if (quarto != null) {
            throw new IllegalArgumentException("O Quarto escolhido já está ocupado, tente outro que não esteja!");
        }
        return reservaRepository.save(reserva);
    }

    public Reserva editarReserva(Long id, Reserva reserva) {
        if (reservaRepository.existsById(id)) {
            reserva.setId(id);
            return reservaRepository.save(reserva);
        }
        return null;
    }

    public void deletarReserva(Long id) {
        reservaRepository.deleteById(id);
    }
}
