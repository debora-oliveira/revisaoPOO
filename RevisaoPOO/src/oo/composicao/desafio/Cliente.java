package oo.composicao.desafio;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
    String nome;
    List<Compra> compras = new ArrayList<>();

    public Cliente(String nome) {
    }

    double obterValorTotal(){
        double total = 0;
        for (Compra compraAtual: compras){
            total += compraAtual.obterValorToral();
        }
        return total;
    }
}
