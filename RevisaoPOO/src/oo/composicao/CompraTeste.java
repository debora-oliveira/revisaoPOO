package oo.composicao;

public class CompraTeste {
    public static void main(String[] args) {
        Compra compra1 = new Compra();
        compra1.cliente = "Ana";
        compra1.itens.add(new Item("caneta",20, 7.40));
        compra1.itens.add(new Item("caderno",20, 18.40));
        compra1.itens.add(new Item("borracha",20, 3.9));
        System.out.println(compra1.itens.size());
        System.out.println(compra1.obterValorTotal());
    }
}
