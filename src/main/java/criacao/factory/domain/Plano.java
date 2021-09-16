package criacao.factory.domain;

public abstract class Plano {

    protected double taxa;

    public abstract void getTaxa();

    public void calcularConta(int quantidade){
        System.out.println(quantidade * taxa);
    }
}
