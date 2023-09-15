package modelo;

import modelo.excessao.SaldoInsuficienteException;

public abstract class Conta {

    private Pessoa titular;
    private int agencia;
    private int numero;
    private double saldo;


    public Conta(){

    }

    Conta(Pessoa titular, int agencia, int numero){
        this.titular = titular;
        this.agencia  = agencia;
        this.numero = numero;
    }

    public void depositar(double valor){
        if( valor <= 0){
            throw new IllegalArgumentException("Valor deve ser maior que 0");
        }
        this.saldo += valor;
    }

    public void sacar(double valor){

        if(valor <= 0){
            throw  new IllegalArgumentException("Valor deve ser maior que 0");
        }
        if(getSaldoDisponivel() - valor < 0){
            throw new SaldoInsuficienteException("Saldo insuficiente!");
        }

        this.saldo -= valor;
    }

    public void sacar(double valor, double taxaSaque){
        sacar(valor - taxaSaque);
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

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldoDisponivel(){
        return getSaldo();
    }
}
