

public class Main {

    public static void main(String[]args){

        Cliente leo = new Cliente();
        leo.setNome("Leo");



        Conta cc = new contaCorrente(leo);

        Conta poupanca = new contaPoupança(leo);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
}
