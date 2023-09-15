package app;

import modelo.Banco;
import modelo.Conta;

import java.util.Comparator;
import java.util.function.ToIntFunction;

public class Principal3 {
    public static void main(String[] args) {
        Banco banco = new Banco();

//        ToIntFunction<Conta> function = (Conta conta) ->{
//            return conta.getNumero();
//        };
//        banco.getContas().sort(Comparator.comparingInt(new NumeroContaFunction()).reversed());

//        banco.getContas().sort(Comparator.comparingInt((Conta conta) ->{
//            return conta.getNumero();
//        } ));

        banco.getContas().sort(Comparator.comparingInt(Conta::getNumero));
        for(Conta conta: banco.getContas()){
            System.out.println(conta.getAgencia() + " / " + conta.getNumero());
        }
    }
}
