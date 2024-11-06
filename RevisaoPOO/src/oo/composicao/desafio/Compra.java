package oo.composicao.desafio;

import java.util.ArrayList;
import java.util.List;

public class Compra {
    List<Item> itens = new ArrayList<>();

    void adicionarItem(Produto p , int qtde){
        this.itens.add(new Item(qtde, p));
    }
    void adicionarItem(String nome, double preco, int qtde){
        var produto = new Produto(nome, preco);
        this.itens.add(new Item(qtde, produto));
    }

    double obterValorToral(){
        double valorTotal = 0;
        for(Item item: itens){
            valorTotal += item.quantidade * item.produto.valor;
        }
        return valorTotal;
    }
}
