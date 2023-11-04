package com.github.mariofneto.reservahotel.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.github.mariofneto.reservahotel.domains.Hotel;

public interface HotelRepository extends JpaRepository<Hotel, Long> {

}