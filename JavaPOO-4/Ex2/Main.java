package Ex2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Retangulo retangulinho = new Retangulo(5.5f,6.6f);
        Circulo circulinho = new Circulo(7.7f);
        Quadrado quadradinho = new Quadrado(2.2f,4.8f);
        Quadrado quadrado2= new Quadrado(8.8f, 9.9f);
        Retangulo retangulo2 = new Retangulo(3.3f,5.5f);

        List<Forminha> listaFormas = new ArrayList<>(5);
        listaFormas.addAll(Arrays.asList(circulinho,quadrado2,retangulinho,retangulo2,quadradinho));

        for (int i = 0; i <listaFormas.size() ; i++) {
            System.out.println();
          listaFormas.get(i).mostrarResultado();
          System.out.println();

        }



    }
}
