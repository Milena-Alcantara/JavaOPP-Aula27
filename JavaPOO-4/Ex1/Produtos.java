package Ex1;

import java.util.List;
import java.util.Objects;

abstract class Produtos {
    public String nome;
    public double preco;
    public int codDeBarras;

    public Produtos(String nome, double preco, int codDeBarras){
        this.nome = nome;
        this.preco = preco;
        this.codDeBarras = codDeBarras;
    }
    public void mostrarDetalhesItem(){
        System.out.println("----------------------------------");
        System.out.println("Nome: "+nome);
        System.out.println("Valor: "+preco);
        System.out.println("Código de Barras: "+codDeBarras);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Produtos produtos = (Produtos) o;
        return  codDeBarras == produtos.codDeBarras;

    }
    public static String buscarProdutoporObjeto(Produtos objeto, List<Produtos> itens){
        for (int i = 0; i < itens.size(); i++) {
            if (itens.get(i) == objeto){
                return "O produto está no indice " + i;
            }
        }
        return "Produto não encontrado";

    }



}
