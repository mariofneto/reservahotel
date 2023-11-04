package com.github.mariofneto.reservahotel.domains;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "reservas")
public class Reserva {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Date checkin = new Date();
    private Integer diasReservados;
    @OneToOne
    private Pessoa pessoa;
    @OneToOne
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
