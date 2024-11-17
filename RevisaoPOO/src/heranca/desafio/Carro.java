package heranca.desafio;

public class Carro {
    final int VELOCIDADE_MAXIMA;
    int velocidadeAtual;
    int aceleracao = 10;

    Carro(int velocidadeMaxima){
        VELOCIDADE_MAXIMA = velocidadeMaxima;
    }

    void acelerar(){
        if (velocidadeAtual + aceleracao > VELOCIDADE_MAXIMA){
            velocidadeAtual = VELOCIDADE_MAXIMA;
        }else {
            velocidadeAtual += aceleracao;
        }
    }

    void frear(){
        if (velocidadeAtual > 0){
            velocidadeAtual -= 5;
        }
    }
}
