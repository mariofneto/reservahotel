package com.github.mariofneto.reservahotel.domains;

import java.sql.Date;

public class Reserva {
    private Long id;
    private Date checkin;
    private Integer diasReservados;
    private Pessoa pessoa;
    private Quarto quarto;

    public Reserva() {
    }

    public Reserva(Long id, Date checkin, Integer diasReservados, Pessoa pessoa, Quarto quarto) {
        this.id = id;
        this.checkin = checkin;
        this.diasReservados = diasReservados;
        this.pessoa = pessoa;
        this.quarto = quarto;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getCheckin() {
        return checkin;
    }

    public void setCheckin(Date checkin) {
        this.checkin = checkin;
    }

    public Integer getDiasReservados() {
        return diasReservados;
    }

    public void setDiasReservados(Integer diasReservados) {
        this.diasReservados = diasReservados;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public Quarto getQuarto() {
        return quarto;
    }

    public void setQuarto(Quarto quarto) {
        this.quarto = quarto;
    }

}
