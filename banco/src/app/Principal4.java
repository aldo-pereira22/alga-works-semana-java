package app;

import modelo.Banco;
import modelo.Conta;

import java.math.BigDecimal;
import java.util.stream.Stream;

public class Principal4 {
    public static void main(String[] args) {
//        Banco banco = new Banco();
//        Stream<Conta> stream =  banco.getContas().stream();
//        Stream<Conta> stream2 =  stream.filter(
//                                        conta -> conta.getSaldo()
//                                                .compareTo(new BigDecimal("130")) > 0 );
//
//        Stream<Conta> stream3 = stream2.filter(conta -> conta.getNumero() > 300);
//
//        stream3.forEach(conta -> {
//
//            System.out.println(conta.getAgencia()+" / " +
//                    "" +conta.getNumero() +" = " + conta.getSaldo());
//        });
        Banco banco = new Banco();
        banco.getContas().stream()
                .filter(conta-> conta.getSaldo().compareTo(new BigDecimal("130")) > 0)
                .filter(conta -> conta.getNumero()>300)
                .forEach(conta -> {
                                System.out.println(conta.getAgencia()+" / " +
                    "" +conta.getNumero() +" = " + conta.getSaldo());
                });
    }
}
