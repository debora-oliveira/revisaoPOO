package heranca.desafio;

public class Ferrari extends Carro implements Esportivo, Luxo{
    private boolean ligarTurbo = false;
    private boolean ligarAr = false;

    public Ferrari(){
        this(400);

    }

    public Ferrari(int velocidadeMaxima) {
        super(velocidadeMaxima);
        setAceleracao(20);
    }

    @Override
    public void ligarTurbo() {
        ligarTurbo = true;
    }

    @Override
    public void desligarTurbo() {
        ligarTurbo = false;
    }

    @Override
    public void ligarAr() {
        ligarAr = true;
    }

    @Override
    public void desligarAr() {
        ligarAr = false;
    }

    @Override
    public int getAceleracao() {
        if(ligarTurbo && !ligarAr) {
            return 35;
        } else if(ligarTurbo && ligarAr) {
            return 30;
        } else if(!ligarTurbo && !ligarAr) {
            return 20;
        } else {
            return 15;
        }
    }

 /*   @Override
    void acelerar() {
        this.velocidadeAtual += 15;
    }
*/
}
