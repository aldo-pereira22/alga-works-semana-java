package app;

import modelo.Conta;
import modelo.ContaEspecial;
import modelo.ContaInvestimento;
import modelo.Pessoa;

public class Principal {
    public static void main(String[] args) {

        Pessoa titular1 = new Pessoa();
        titular1.setNome("João");
        titular1.setDocumento("1111111111");


        Pessoa titular2 = new Pessoa();
        titular2.setNome("Maria da Abadia");
        titular2.setDocumento("222222222222");



        ContaInvestimento minhaConta = new ContaInvestimento(titular1,123, 987);
        ContaEspecial outraConta = new ContaEspecial(titular2, 123, 987, 1000);

        Conta conta = minhaConta;
        conta.debitarTarficaMensal();

        minhaConta.depositar(18_000);
        minhaConta.sacar(17);
        minhaConta.creditarRendimentos(0.8);






        System.out.println("\n\nTitular: " +minhaConta.getTitular().getNome());
        System.out.println("Saldo: " + minhaConta.getSaldo());

    }
}
