package main;
import produto.Produto;
public class Main {
    public static void main(String[] args) {
        Produto obj = new Produto();
        obj.setCodigo(10);
        obj.setQtde(30);
        obj.setNota(6);
        Produto obj2 = new Produto(10, 200, 30);
        System.out.println("Código: "+obj2.getCodigo());
        System.out.println("Nota: "+obj2.getNota());
        System.out.println("Quantidade: "+obj2.getQtde());
    }
}