package heranca.desafio.teste;

import heranca.desafio.Carro;
import heranca.desafio.Ferrari;
import heranca.desafio.Fusca;

public class TesteCarro {
    public static void main(String[] args) {

        Carro fusca = new Fusca();

        fusca.acelerar();
        System.out.println(fusca);

        fusca.acelerar();
        System.out.println(fusca);

        fusca.acelerar();
        System.out.println(fusca);

        Ferrari ferrari = new Ferrari(400);
        ferrari.ligarTurbo();
        ferrari.ligarAr();
       // ferrari.desligarAr();

        System.out.println(ferrari.velocidadeDoAr());

        ferrari.acelerar();
        ferrari.frear();
        System.out.println(ferrari);

        ferrari.acelerar();
        ferrari.frear();
        System.out.println(ferrari);

        ferrari.acelerar();
        System.out.println(ferrari);

    }
}
