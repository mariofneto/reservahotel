package com.github.mariofneto.reservahotel.domains;

public class Hotel {
    private Long id;
    private String nome;
    private Quarto[] quartos;

    public Hotel() {
    }

    public Hotel(Long id, String nome, Quarto[] quartos) {
        this.id = id;
        this.nome = nome;
        this.quartos = quartos;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Quarto[] getQuartos() {
        return quartos;
    }

    public void setQuartos(Quarto[] quartos) {
        this.quartos = quartos;
    }

}
