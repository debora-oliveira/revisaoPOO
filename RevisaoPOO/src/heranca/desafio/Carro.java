package heranca.desafio;

public class Carro {
    final int VELOCIDADE_MAXIMA;
    protected int velocidadeAtual;
    private int aceleracao = 10;

    protected Carro(int velocidadeMaxima){
        VELOCIDADE_MAXIMA = velocidadeMaxima;
    }

    public void acelerar(){
        if (velocidadeAtual + aceleracao > VELOCIDADE_MAXIMA){
            velocidadeAtual = VELOCIDADE_MAXIMA;
        }else {
            velocidadeAtual += aceleracao;
        }
    }

    public void frear(){
        if (velocidadeAtual > 0){
            velocidadeAtual -= 5;
        }
    }

    public int getAceleracao() {
        return aceleracao;
    }

    public void setAceleracao(int aceleracao) {
        this.aceleracao = aceleracao;
    }

    public String toString() {
        return "Velocidade atual é " + velocidadeAtual + "Km/h.";
    }
}
