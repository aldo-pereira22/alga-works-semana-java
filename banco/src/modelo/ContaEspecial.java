package modelo;

import java.math.BigDecimal;

public class ContaEspecial extends Conta {
    private BigDecimal limite;

    public ContaEspecial(Pessoa titular, int agencia, int numero, BigDecimal limite) {
        super(titular, agencia, numero);
        this.limite = limite;
    }

    public  ContaEspecial(){

    }

    @Override
    public void debitarTarficaMensal() {
        sacar(new BigDecimal("20"));
    }

    @Override
    public BigDecimal getSaldoDisponivel() {
        return  getSaldo().add(getLimite()) ;
    }

    public BigDecimal getLimite() {
        return limite;
    }

    public void setLimite(BigDecimal limite) {
        this.limite = limite;
    }


}
