package ex2;
public class Aluno {
    private int numAluno, idade;
    private String nome;
    private float p1, p2;

    public void Aluno(){

    }

    public Aluno(int numAluno, int idade, String nome, float p1, float p2) {
        this.setIdade(idade);
        this.setNumAluno(numAluno);
        this.setNome(nome);
        this.setP1(p1);
        this.setP2(p2);
    }

    public void setNumAluno(int numAluno){
        String numAlunoStr = String.valueOf(numAluno);
        if(numAlunoStr.length() == 6){
            this.numAluno = numAluno;
        }else {
            System.out.println("Número Inválido");
        }
    }
    public void setIdade(int idade){
        if(idade >= 0){
            this.idade = idade;
        }else {
            System.out.println("Idade Inválido");
        }
    }
    public void setNome(String nome){
        if(nome.length() <= 30){
            this.nome = nome;
        }else{
            System.out.println("Nome Inválido");
        }
    }
    public void setP1(float p1){
        if(p1 >= 0 && p1 <= 10){
            this.p1 = p1;
        }else {
            System.out.println("Nota Inválido");
        }
    }
    public void setP2(float p2){
        if(p2 >= 0 && p2 <= 10){
            this.p2 = p2;
        }else {
            System.out.println("Nota Inválido");
        }
    }

    public int getIdade() {
        return this.idade;
    }

    public int getNumAluno() {
        return this.numAluno;
    }

    public String getNome() {
        return this.nome;
    }

    public float getP1() {
        return this.p1;
    }

    public float getP2() {
        return this.p2;
    }

    public float notaFinal(){
        return (this.p1 + this.p2)/2;
    }
    public void dadosAluno(){
        System.out.println("Número do ALuno: "+this.numAluno);
        System.out.println("Nome do Aluno: "+this.nome);
        System.out.println("Idade do Aluno: "+this.idade);
        System.out.println("Primeira nota: "+this.p1);
        System.out.println("Segunda Nota: "+this.p2);
        System.out.println("Média do Aluno: "+this.notaFinal());
    }
}
