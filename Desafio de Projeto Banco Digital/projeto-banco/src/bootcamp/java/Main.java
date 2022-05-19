package bootcamp.java;

public class Main {

    public static void main(String[] args) {
        Cliente suelem = new Cliente();
        suelem.setNome("Suelem");

        Conta cc = new ContaCorrente(suelem);
        Conta poupanca = new ContaPoupanca(suelem);

        cc.depositar(100);
        cc.transferir(100, poupanca);
        poupanca.sacar(40);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
}
