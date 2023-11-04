package com.github.mariofneto.reservahotel.domains;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "quartos")
public class Quarto {
    @Id
    private Long numero; // sera a primary key
    private Double valorHospedagem;
    @OneToOne
    private Reserva reserva;

    public Quarto() {
    }

    public Quarto(Long numero, Double valorHospedagem, Reserva reserva) {
        this.numero = numero;
        this.valorHospedagem = valorHospedagem;
        this.reserva = reserva;
    }

    public Long getNumero() {
        return numero;
    }

    public void setNumero(Long numero) {
        this.numero = numero;
    }

    public Double getValorHospedagem() {
        return valorHospedagem;
    }

    public void setValorHospedagem(Double valorHospedagem) {
        this.valorHospedagem = valorHospedagem;
    }

    public Reserva getReserva() {
        return reserva;
    }

    public void setReserva(Reserva reserva) {
        this.reserva = reserva;
    }

}
