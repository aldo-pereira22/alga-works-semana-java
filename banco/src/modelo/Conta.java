package modelo;

import modelo.excessao.SaldoInsuficienteException;

import java.math.BigDecimal;

public abstract class Conta {

    private Pessoa titular;
    private int agencia;
    private int numero;
    private BigDecimal saldo = (BigDecimal.ZERO);


    public Conta(){

    }

    Conta(Pessoa titular, int agencia, int numero){
        this.titular = titular;
        this.agencia  = agencia;
        this.numero = numero;
    }

    public void depositar(BigDecimal valor){
        if( valor.compareTo(BigDecimal.ZERO) <= 0){
            throw new IllegalArgumentException("Valor deve ser maior que 0");
        }
        this.setSaldo(valor);

    }

    public void sacar(BigDecimal valor){

        if(valor.compareTo(BigDecimal.ZERO) <= 0){
            throw  new IllegalArgumentException("Valor deve ser maior que 0");
        }
        if(getSaldoDisponivel().subtract(valor).compareTo(BigDecimal.ZERO) < 0){
            throw new SaldoInsuficienteException("Saldo insuficiente!");
        }

        this.saldo.subtract(valor);
    }

    public void sacar(BigDecimal valor, BigDecimal taxaSaque){
        sacar(valor.add(taxaSaque) );
    }

    public abstract void debitarTarficaMensal();

    public Pessoa getTitular() {
        return titular;
    }

    public void setTitular(Pessoa titular) {
        this.titular = titular;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public BigDecimal getSaldo() {
        return saldo;
    }

    public void setSaldo(BigDecimal saldo) {
        this.saldo = saldo;
    }

    public BigDecimal getSaldoDisponivel(){
        return getSaldo();
    }
}
