package ex1;

public class Cliente {
    private String numConta, numAgencia, nome;
    private float saldo;
    public Cliente(){

    }

    public Cliente(String numConta, String numAgencia, String nome, float saldo) {
        this.setNumConta(numConta);
        this.setNumAgencia(numAgencia);
        this.setNome(nome);
        this.setSaldo(saldo);
    }

    public void setNumConta(String numConta){
        if(numConta.length() == 8 && numConta.charAt(6) == '-'){
            this.numConta = numConta;
        }else{
            System.out.println("Número da Conta Inválido");
        }
    }
    public void setNumAgencia(String numAgencia){
        if(numAgencia.length() == 6 && numAgencia.charAt(4) == '-'){
            this.numAgencia = numAgencia;
        }else {
            System.out.println("Número da Agência Inválido");
        }
    }
    public void setNome(String nome){
        if(nome.length() <= 30){
            this.nome = nome;
        }else {
            System.out.println("Nome Inválido");
        }
    }
    public void setSaldo(float saldo){
        if(saldo >= 0){
            this.saldo = saldo;
        }else {
            System.out.println("Saldo negativo");
        }
    }
    public String getNumConta(){
        return this.numConta;
    }
    public String getNumAgencia(){
        return this.numAgencia;
    }
    public String getNome(){
        return this.nome;
    }
    public float getSaldo(){
        return this.saldo;
    }

    public void realizarDeposito(float x){
        this.setSaldo(this.saldo + x);
//        if(x > 0){
//            this.saldo += x;
//        }
    }
    public void realizarSaque(float x){
        this.setSaldo(this.saldo - x);
//        if(this.saldo - x >= 0 && x <= this.saldo){
//            this.saldo -= x;
//        }
    }
    public void imprimir(){
        System.out.println("Número da Conta: "+this.numConta);
        System.out.println("Número da Agência: "+this.numAgencia);
        System.out.println("Nome: "+this.nome);
        System.out.println("Saldo: "+this.saldo);
    }

}
