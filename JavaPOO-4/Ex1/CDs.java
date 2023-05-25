package Ex1;

public class CDs extends Produtos {
    protected int numeroDeFaixas;

    public CDs(String nome, double preco, int numeroDeFaixas, int codDeBarras){
        super(nome,preco,codDeBarras);
        this.numeroDeFaixas =numeroDeFaixas;
    }

    @Override
    public void mostrarDetalhesItem(){
        super.mostrarDetalhesItem();
        System.out.println("Faixas: "+numeroDeFaixas);
    }
}
