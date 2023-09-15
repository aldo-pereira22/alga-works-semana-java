package app;

import modelo.Conta;
import modelo.ContaEspecial;
import modelo.ContaInvestimento;
import modelo.Pessoa;
import modelo.atm.CaixaEletronico;
import modelo.excessao.SaldoInsuficienteException;
import modelo.pagamento.Boleto;
import modelo.pagamento.DocumentoPagavel;
import modelo.pagamento.Holerite;

public class Principal {
    public static void main(String[] args) {

        Pessoa titular1 = new Pessoa();
        titular1.setNome("João");
        titular1.setDocumento("1111111111");


        Pessoa titular2 = new Pessoa();
        titular2.setNome("Maria da Abadia");
        titular2.setDocumento("222222222222");



//        ContaInvestimento minhaConta = new ContaInvestimento(titular1,123, 987);
//
//        Conta conta = minhaConta;
//        conta.debitarTarficaMensal();
    try{
        Boleto boletoEscola = new Boleto(titular2, 500_000);
        Holerite salarioFuncionario = new Holerite(titular2, 100, 160);

        CaixaEletronico caixaEletronico = new CaixaEletronico();
//        caixaEletronico.estornarPagamento(boletoEscola, caixaEletronico);
        caixaEletronico.depositar(30_000);
        caixaEletronico.pagar(boletoEscola,caixaEletronico);
        caixaEletronico.pagar(salarioFuncionario, caixaEletronico);

        System.out.println(caixaEletronico.getSaldo());
        boletoEscola.imprimirRecibo();
        salarioFuncionario.imprimirRecibo();

    }catch (SaldoInsuficienteException ex){
        System.out.println("Erro ao exectuar operação na conta"+ ex.getMessage());
    }

//        caixaEletronico.pagar(boletoEscola, minhaConta);
//        System.out.println("Boleto pago: " + boletoEscola.estaPago());

//        minhaConta.depositar(18_000);
//        minhaConta.sacar(17);
//        minhaConta.creditarRendimentos(0.8);






//        System.out.println("\n\nTitular: " +minhaConta.getTitular().getNome());
//        System.out.println("Saldo: " + minhaConta.getSaldo());

    }
}
