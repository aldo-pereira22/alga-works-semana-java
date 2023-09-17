package app;

import modelo.Banco;
import modelo.Conta;

import java.math.BigDecimal;
import java.util.Optional;

public class Principal5 {

    public static void main(String[] args) {
        Banco banco = new Banco();

//        Optional<Conta> contaOptional =  banco.buscar(222,222);
//        contaOptional.ifPresent(conta -> {
//            System.out.println(conta.getSaldo());
//        });

//        banco.buscar(222, 222)
//                .ifPresent(conta -> System.out.println(conta.getSaldo()));

//        if(contaOptional.isPresent()){
//
//            Conta contaEncontrada = contaOptional.get();
//            System.out.println(contaEncontrada.getSaldo());
//        }

//        Conta contaEncontrada = banco.buscar(2222, 222)
//                .orElseThrow(() -> new RuntimeException("Conta não encontrada!"));

        BigDecimal saldo = banco.buscar(222, 2222)
                .map(conta -> conta.getSaldo())
                .orElse(BigDecimal.ZERO);

        System.out.println(saldo);
    }
}
