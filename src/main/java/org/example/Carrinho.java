package org.example;

import java.util.LinkedList;
import java.util.List;

public class Carrinho {
    private final List<Produto> produtos = new LinkedList<>();

    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
        System.out.println("Produto adicionado com sucesso!");
    }

    public void removerProduto(Produto produto) {
        produtos.remove(produto);
        System.out.println("Produto removido com sucesso!");
    }

    public void listarProdutos() {
        if (produtos.size() == 0) {
            System.out.println("O carrinho está vazio!");
        } else {
            for (Produto produto : produtos) {
                System.out.println("Nome: " + produto.getNome());
                System.out.println("R$" + produto.getPreco());
                System.out.println(produto.getDescricao());

                if (produto instanceof Eletronico) {
                    System.out.println("Garantia: " + ((Eletronico) produto).getGarantia());
                } else {
                    System.out.println("Tamanho: " + ((Vestuario) produto).getTamanho());
                    System.out.println("Cor: " + ((Vestuario) produto).getCor());
                }
                System.out.println("========================================================");
            }
        }
    }

    public void totalCompra() {
        if (produtos.size() == 0) {
            System.out.println("O carrinho está vazio!");
        } else {
            double total = 0;
            for (Produto produto : produtos) {
                total += produto.getPreco();
            }
            System.out.println("O valor total da compra é R$" + total);
        }
    }

}
