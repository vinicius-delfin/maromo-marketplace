package org.example;

public class Main {
    public static void main(String[] args) {
        Carrinho carrinho = new Carrinho();
        Eletronico laptop1 = new Eletronico("Laptop", 199.99, "Não é muito bom não", "01/01/2024");
        Eletronico smartphone1 = new Eletronico("Smartphone", 299.99, "Ótima câmera", "01/01/2024");
        Eletronico headphones1 = new Eletronico("Headphones", 49.99, "Qualidade de som excepcional", "01/01/2024");
        Eletronico tablet1 = new Eletronico("Tablet", 149.99, "Bateria de longa duração", "01/01/2024");
        Eletronico smartwatch1 = new Eletronico("Smartwatch", 79.99, "Monitoramento de saúde avançado", "01/01/2024");
        Eletronico cameraDigital1 = new Eletronico("Câmera Digital", 199.99, "Zoom poderoso", "01/01/2024");
        Eletronico consoleDeJogos1 = new Eletronico("Console de Jogos", 399.99, "Gráficos de alta qualidade", "01/01/2024");
        Eletronico impressora1 = new Eletronico("Impressora", 129.99, "Imprime em alta resolução", "01/01/2024");
        Eletronico monitor1 = new Eletronico("Monitor", 159.99, "Tela de grande tamanho", "01/01/2024");
        Eletronico roteador1 = new Eletronico("Roteador", 79.99, "Alcance de sinal excepcional", "01/01/2024");

        Vestuario roupa1 = new Vestuario("Vestido da Gucci", 20000.00, "Caro demais, ta loko", Tamanho.P, "Azul Coruja");
        Vestuario camiseta1 = new Vestuario("Camiseta Estampada", 29.99, "Confortável para o dia a dia", Tamanho.M, "Branco");
        Vestuario calcaJeans1 = new Vestuario("Calça Jeans Skinny", 59.99, "Estilo moderno", Tamanho.G, "Azul Escuro");
        Vestuario tenisEsportivo1 = new Vestuario("Tênis Esportivo", 79.99, "Amortecimento superior", Tamanho.GG, "Preto");
        Vestuario moletom1 = new Vestuario("Moletom com Capuz", 49.99, "Perfeito para o inverno", Tamanho.G, "Cinza");
        Vestuario vestidoCasual1 = new Vestuario("Vestido Casual", 39.99, "Ideal para ocasiões informais", Tamanho.M, "Rosa");
        Vestuario gravata1 = new Vestuario("Gravata de Seda", 34.99, "Elegante e clássica", Tamanho.PP, "Preto");
        Vestuario meiaEsportiva1 = new Vestuario("Meia Esportiva", 9.99, "Conforto durante os exercícios", Tamanho.M, "Branco");
        Vestuario jaquetaCouro1 = new Vestuario("Jaqueta de Couro", 149.99, "Estilo atemporal", Tamanho.G, "Marrom");
        Vestuario saiaPlissada1 = new Vestuario("Saia Plissada", 29.99, "Elegância feminina", Tamanho.P, "Verde");


        carrinho.adicionarProduto(consoleDeJogos1);

        carrinho.listarProdutos();

    }
}