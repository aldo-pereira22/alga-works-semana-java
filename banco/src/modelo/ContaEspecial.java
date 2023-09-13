package modelo;

public class ContaEspecial extends Conta {
    private double limite;

    public ContaEspecial(Pessoa titular, int agencia, int numero, double limite) {
        super(titular, agencia, numero);
        this.limite = limite;
    }

    public  ContaEspecial(){

    }

    @Override
    public double getSaldoDisponivel() {
        return  getSaldo() + getLimite();
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }


}
