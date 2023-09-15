package app;

import modelo.Pessoa;
import modelo.TipoPessoa;
import modelo.atm.CaixaEletronico;
import modelo.excessao.SaldoInsuficienteException;
import modelo.pagamento.Boleto;
import modelo.pagamento.Holerite;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Principal {
    public static void main(String[] args) {

        Pessoa titular1 = new Pessoa();
        titular1.setNome("João");
        titular1.setDocumento("1111111111");
        titular1.setRendimentoAnual(new BigDecimal("15000"));
        titular1.setTipo(TipoPessoa.JURIDICA);
        System.out.println(titular1.getTipo());

//        titular1.setDataUltimaAtualizacao(LocalDateTime.parse("2023-06-27T13:20:00"));
//        System.out.println("Ultima atualização:"+ titular1.getDataUltimaAtualizacao());
//        Double rendimento = titular1.getRendimentoAnual();

        Pessoa titular2 = new Pessoa();
        titular2.setNome("Maria da Abadia");
        titular2.setDocumento("222222222222");



//        ContaInvestimento minhaConta = new ContaInvestimento(titular1,123, 987);
//
//        Conta conta = minhaConta;
//        conta.debitarTarficaMensal();
    try{
        Boleto boletoEscola = new Boleto(titular2, new BigDecimal("15000"));
        Holerite salarioFuncionario = new Holerite(titular2, new BigDecimal("15000"), 160);

        CaixaEletronico caixaEletronico = new CaixaEletronico();
//        caixaEletronico.estornarPagamento(boletoEscola, caixaEletronico);
        caixaEletronico.depositar(new BigDecimal("30000"));
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
