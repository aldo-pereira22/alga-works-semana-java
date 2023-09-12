public class Principal {
    public static void main(String[] args) {

        Pessoa titular1 = new Pessoa();
        titular1.setNome("João");
        titular1.setDocumento("1111111111");


        Pessoa titular2 = new Pessoa();
        titular2.setNome("Maria da Abadia");
        titular2.setDocumento("222222222222");

        Conta minhaConta = new Conta();
        minhaConta.setTitular(titular1);
        minhaConta.setTitular(titular2);
//        minhaConta.saldo = 15.000;
        minhaConta.depositar(18_000);
        minhaConta.sacar(17_000, 10);


        Conta suaConta = new Conta();
        suaConta.setTitular(titular2);
        suaConta.setAgencia(222);
        suaConta.setNumero(333);
//        suaConta.saldo = 30_000;
        suaConta.depositar(10_000);



        System.out.println("\n\nTitular: " +minhaConta.getTitular().getNome());
        System.out.println("Saldo: " + minhaConta.getSaldo());


        System.out.println("\n\n\nTitular: " +suaConta.getTitular().getNome());
        System.out.println("Saldo: " + suaConta.getSaldo());

    }
}
