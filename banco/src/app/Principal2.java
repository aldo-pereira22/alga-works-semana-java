package app;

import modelo.Pessoa;

import java.util.ArrayList;
import java.util.List;

public class Principal2 {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa("João da Silva", "12331231");
        Pessoa pessoa2 = new Pessoa("Maria das Cuves", "12331231");
        List<Pessoa> pessoas = new ArrayList<>();

        pessoas.add(pessoa1);
        pessoas.add(pessoa2);

        System.out.println(pessoas);

        Pessoa pessoa3 = pessoas.get(1);

        for(int i = 0 ; i < pessoas.size(); i++){
            System.out.println(pessoas.get(i).getNome());
        }

        for(Pessoa pessoa : pessoas){
            System.out.println("\n"+pessoa.getNome());
        }

        boolean existe = pessoas.contains(pessoa1);
        System.out.println(existe);
    }
}
