package Ex2;

import java.text.Format;
import java.math.MathContext;

public class Circulo extends Forminha {

    public float raio;
    public float pi = 3.14f;

    public Circulo(float raio){
        this.raio = raio;
    }

    @Override
    public float calcaularArea() {
        return pi*(raio*raio);
    }

    @Override
    public float calcularPerimetro() {
        return pi*2*raio;
    }
    @Override
    public void mostrarResultado(){
        System.out.println("O resultado da área do Circulo é: "+calcaularArea());
        System.out.println("O resuldado do perimetro do Circulo é: "+calcularPerimetro());
    }


}
