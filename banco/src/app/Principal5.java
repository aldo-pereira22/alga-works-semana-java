package app;

import modelo.Banco;
import modelo.Conta;

import java.util.Optional;

public class Principal5 {

    public static void main(String[] args) {
        Banco banco = new Banco();

        Optional<Conta> contaOptional =  banco.buscar(222,222);

        if(contaOptional.isPresent()){

            Conta contaEncontrada = contaOptional.get();
            System.out.println(contaEncontrada.getSaldo());
        }

    }
}
