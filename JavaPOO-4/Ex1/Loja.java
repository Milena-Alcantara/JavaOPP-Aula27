package Ex1;

import Ex1.CDs;
import Ex1.DVDs;
import Ex1.Livros;

import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Loja {
    public static Scanner input = new Scanner(System.in);

   public static List<Produtos> itens = new ArrayList<>();
    public static void main(String[] args) {

      Livros livro = new Livros("Mulheres, Raça e Classe",54.90, "Angela Davis", 123);
      CDs cd = new CDs("Tim maia", 20, 4, 2321);
      CDs cd2 = new CDs("Fundo de Quintal: 20 anos",25.00,10,909);
      DVDs dvd = new DVDs("Motoqueiro Fantasma", 30, 1, 447);
      DVDs dvd2 = new DVDs("Corra",14.90,1.4f, 521);

      Livros livro2 = new Livros("Mulheres, Raça e Classe",54.90,"Angela Davis",123);
      CDs cd3 = new CDs("ExaltaSamba",12.90,12,1234);

        itens.addAll(Arrays.asList(livro,cd,cd2,dvd,dvd2));

        for (int i = 0; i <itens.size() ; i++) {
            itens.get(i).mostrarDetalhesItem();
        }
        System.out.println();
        System.out.println(livro.equals(cd3));
        System.out.println(livro.equals(livro2));


        System.out.println(Produtos.buscarProdutoporObjeto(cd,itens));

    }


}