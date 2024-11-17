package heranca.desafio;

public class TesteCarro {
    public static void main(String[] args) {
        Fusca fusca = new Fusca();

        Ferrari ferrari = new Ferrari();
        for (int i = 0 ; i < 6; i++){
            fusca.acelerar();
            ferrari.acelerar();
        }
    ferrari.acelerar();
    ferrari.acelerar();
    ferrari.acelerar();
    ferrari.acelerar();
    ferrari.acelerar();
        System.out.println("Velocidade fusca: "+fusca.velocidadeAtual);
        System.out.println("Velocidade ferrari: "+ferrari.velocidadeAtual);
        System.out.println("----------------------------------");
        fusca.frear();
        fusca.frear();
        fusca.frear();
        ferrari.frear();
        ferrari.frear();
        ferrari.frear();
        System.out.println("Velocidade fusca: "+fusca.velocidadeAtual);
        System.out.println("Velocidade ferrari: "+ferrari.velocidadeAtual);

    }
}
