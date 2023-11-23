package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Carrinho {
    private List<Produto> produtos = new ArrayList<>();

    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
        System.out.println("Produto adicionado com sucesso!");
    }

    public void removerProduto(Produto produto) {
        produtos.remove(produto);
        System.out.println("Produto removido com sucesso!");
    }

    public void listarProdutos() {
        for (Produto produto : produtos) {
            System.out.println(produto.getNome());
        }
    }

    public void totalCompra() {
        double total = 0;
        for (Produto produto : produtos) {
            total += produto.getPreco();
        }
        System.out.println("O valor total da compra é R$" + total);
    }

}
