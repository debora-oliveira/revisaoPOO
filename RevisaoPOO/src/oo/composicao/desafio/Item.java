package oo.composicao.desafio;

import java.util.ArrayList;
import java.util.List;

public class Item {
    int quantidade;
    Produto  produto;

    Item(int quantidade, Produto produto){
        this.quantidade = quantidade;
        this.produto = produto;
    }
}
