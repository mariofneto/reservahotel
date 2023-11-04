package com.github.mariofneto.reservahotel.services;

import java.util.List;

import com.github.mariofneto.reservahotel.domains.Hotel;
import com.github.mariofneto.reservahotel.repositories.HotelRepository;

public class HotelServices {
    private final HotelRepository hotelRepository;

    public HotelServices(HotelRepository hotelRepository) {
        this.hotelRepository = hotelRepository;
    }

    public List<Hotel> todosHoteis() {
        return hotelRepository.findAll();
    }

    public Hotel obterHotelPorId(Long id) {
        return hotelRepository.findById(id).orElse(null);
    }

    public Hotel criarHotel(Hotel hotel) {
        return hotelRepository.save(hotel);
    }

    public Hotel editarHotel(Long id, Hotel hotel) {
        if (hotelRepository.existsById(id)) {
            hotel.setId(id);
            return hotelRepository.save(hotel);
        }
        return null;
    }

    public void deletarHotel(Long id) {
        hotelRepository.deleteById(id);
    }
}
