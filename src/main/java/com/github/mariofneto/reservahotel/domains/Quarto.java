package com.github.mariofneto.reservahotel.domains;

public class Quarto {
    private Long numero; // sera a primary key
    private Double valorHospedagem;
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
