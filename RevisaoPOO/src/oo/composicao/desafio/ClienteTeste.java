package oo.composicao.desafio;

public class ClienteTeste {
    public static void main(String[] args) {

        Cliente cliente1 = new Cliente("Maria");
        Compra compra1 = new Compra();
        compra1.adicionarItem("Caneta", 10, 5);
        compra1.adicionarItem(new Produto("Notebook", 2000),2);

        Compra compra2 = new Compra();
        compra2.adicionarItem("Caderno", 10, 1);
        compra2.adicionarItem(new Produto("Mochila", 100),1);

        cliente1.compras.add(compra1);
        cliente1.compras.add(compra2);

        System.out.println(cliente1.obterValorTotal());
    }
}
