package org.example;

import java.util.ArrayList;
import java.util.List;

public class Carrinho {
    private List<Produto> produtos = new ArrayList<>();


    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
        System.out.println("Produto inserido com sucesso!");
    }

    public void removerProduto() {

    }

    public void listarProdutos() {
        for (Produto produto : produtos) {
            System.out.println(produto.getNome());
        }
    }


}
