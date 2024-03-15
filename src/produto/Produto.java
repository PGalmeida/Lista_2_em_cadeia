package produto;
public class Produto {
    private int codigo;
    private int qtde;
    private float nota;

    public Produto(){

    }
    public Produto(int codigo, int qtde, float nota) {
        this.setCodigo(codigo);
        this.setQtde(qtde);
        this.setNota(nota);
    }

    public void setCodigo(int codigo){
        if(codigo > 0){
            this.codigo = codigo;
        }else{
            System.out.println("Código Inválido");
        }
    }
    public void setQtde(int qtde){
        if(qtde >= 0){
            this.qtde = qtde;
        }else{
            System.out.println("Quantidade Inválido");
        }
    }
    public void setNota(float nota){
        if(nota >= 0 && nota <=10){
            this.nota = nota;
        }else{
            System.out.println("Nota Inválida");
        }
    }

    public int getCodigo(){
        return this.codigo;
    }
    public int getQtde(){
        return  this.qtde;
    }
    public float getNota(){
        return this.nota;
    }
    private boolean produtoRuim(){
        if(this.nota < 4){
            return true;
        }else {
            return false;
        }
    }
}
