package org.example;

import lombok.*;

import java.util.Date;

@Getter
@Setter
@ToString
public class Eletronico extends Produto {
    private String garantia;

    public Eletronico(String nome, double preco, String descricao, String garantia) {
        super(nome, preco, descricao);
        this.garantia = garantia;
    }
}
