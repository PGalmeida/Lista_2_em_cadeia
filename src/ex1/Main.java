package ex1;
public class Main {
    public static void main(String[] args) {
        Cliente fulano = new Cliente("123456-8","1237-6","bjb",100.0f);
        fulano.realizarDeposito(500.0f);
        fulano.realizarSaque(200.0f);

        fulano.imprimir();

        Cliente fulano2 = new Cliente();
        fulano2.setNome("Pedro");
        fulano2.setSaldo(500.0f);
        fulano2.setNumAgencia("4567-2");
        fulano2.setNumConta("451278-9");

        fulano2.imprimir();
    }
}