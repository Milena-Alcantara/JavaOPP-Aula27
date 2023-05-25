package Ex1;

public class DVDs extends Produtos {
    protected float duracao;

    public DVDs(String nome, double preco, float duracao, int codDeBarras){
        super(nome, preco,codDeBarras);
        this.duracao = duracao;
    }

    @Override
    public void mostrarDetalhesItem(){
       super.mostrarDetalhesItem();
        System.out.println("Duração: "+duracao);
    }
}
