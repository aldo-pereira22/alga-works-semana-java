package app;

import modelo.Banco;
import modelo.Conta;

import java.math.BigDecimal;
import java.util.stream.Stream;

public class Principal4 {
    public static void main(String[] args) {
        Banco banco = new Banco();
        Stream<Conta> stream =  banco.getContas().stream();
        Stream<Conta> stream2 =  stream.filter(
                conta -> conta.getSaldo().compareTo(new BigDecimal("130")) > 0
        );

        stream2.forEach(conta -> {

            System.out.println(conta.getAgencia()+" / " +
                    "" +conta.getNumero() +" = " + conta.getSaldo());
        });
//        banco.getContas().get(0).setSaldo(new BigDecimal("100"));
//        System.out.println("Saldo: "+banco.getContas().get(0).getSaldo());
    }
}
