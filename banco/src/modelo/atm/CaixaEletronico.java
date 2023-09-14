package modelo.atm;

import modelo.Conta;
import modelo.pagamento.DocumentoEstornavel;
import modelo.pagamento.DocumentoPagavel;

public class CaixaEletronico extends Conta {

    public void imprimirsaldo(Conta conta){
        System.out.println("Conta: "+ conta.getSaldo());
    }

    public void pagar(DocumentoPagavel documento, Conta conta){
        if(documento.estaPago()){
            throw new IllegalArgumentException("Documento ja está pago");
        }
        conta.sacar(documento.getValorTotal());
        documento.quitarPagamento();
    }

    @Override
    public void debitarTarficaMensal() {

    }

    public void estornarPagamento(DocumentoEstornavel documentoEstornavel, Conta conta){

        if(documentoEstornavel.estaPago()){
            throw new IllegalArgumentException("Documento não está pago!");
        }
        conta.depositar(documentoEstornavel.getValorTotal());
        documentoEstornavel.estornarPagamento();
    }
}
