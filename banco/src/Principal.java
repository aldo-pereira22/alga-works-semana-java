public class Principal {
    public static void main(String[] args) {

        Pessoa titular1 = new Pessoa();
        titular1.nome  = "João da Silva";
        titular1.documento = "111111111111";


        Pessoa titular2 = new Pessoa();
        titular2.nome = "Maria da Abadia";
        titular2.documento = "222222222222";

        Conta minhaConta = new Conta();
        minhaConta.titular = titular1;
        minhaConta.agencia= 123;
        minhaConta.numero = 987;
        minhaConta.saldo = 15.000;


        Conta suaConta = new Conta();
        suaConta.titular = titular2;
        suaConta.agencia = 222;
        suaConta.numero = 333;
        suaConta.saldo = 30_000;


        System.out.println("\n\nTitular: " +minhaConta.titular.nome);
        System.out.println("Saldo: " + minhaConta.saldo);


        System.out.println("\n\n\nTitular: " +suaConta.titular.nome);
        System.out.println("Saldo: " + suaConta.saldo);

    }
}
