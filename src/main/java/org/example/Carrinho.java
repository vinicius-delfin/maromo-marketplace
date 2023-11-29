package org.example;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Carrinho {
    private final List<Produto> produtos = new LinkedList<>();

    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
        System.out.println("Produto adicionado com sucesso!\n");
        imprimirInformacoes(produto);
    }

    public void removerProduto(Produto produto) {
        produtos.remove(produto);
        System.out.println("Produto removido com sucesso!\n");
    }

    public void listarProdutos() {
        if (produtos.isEmpty()) {
            System.out.println("O carrinho está vazio!");
        } else {
            for (Produto produto : produtos) {
                imprimirInformacoes(produto);
            }
        }
    }

    public void totalCompra() {
        if (produtos.isEmpty()) {
            System.out.println("O carrinho está vazio!");
        } else {
            double total = produtos.stream().map(produto -> produto.getPreco()).reduce(0.0, (a, b) -> a + b);
            System.out.println("O valor total da compra é R$" + total);
        }
    }

    private static void imprimirInformacoes(Produto produto) {
        if (produto instanceof Eletronico) {
            System.out.println((Eletronico) produto);
        } else {
            System.out.println((Vestuario) produto);
        }
        System.out.println("========================================================");
    }
}
