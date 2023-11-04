package com.github.mariofneto.reservahotel.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.github.mariofneto.reservahotel.domains.Reserva;

public interface ReservaRepository extends JpaRepository<Reserva, Long> {

}
