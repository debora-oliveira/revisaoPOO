package heranca.desafio;

public class Ferrari extends Carro{
    Ferrari(){
        this(200);

    }

    Ferrari(int velocidadeMaxima) {
        super(velocidadeMaxima);
        aceleracao = 20;
    }

 /*   @Override
    void acelerar() {
        this.velocidadeAtual += 15;
    }
*/
}
