package Ex1;

import java.awt.*;
import java.util.List;

public class Livros extends Produtos {
    public String nomeAutor;

    public Livros(String nome, double preco, String nomeAutor,int codDeBarras){
      super(nome,preco,codDeBarras);
        this.nomeAutor =nomeAutor;

    }

    @Override
    public void mostrarDetalhesItem(){
      super.mostrarDetalhesItem();
        System.out.println("Autor: "+nomeAutor);
    }


}
