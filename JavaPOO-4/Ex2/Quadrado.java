package Ex2;

public class Quadrado extends Retangulo{
    public Quadrado(float lado, float altura) {
        super(lado, altura);
    }

    @Override
    public void mostrarResultado() {
        System.out.println("O resultado da área do quadrado é: "+calcaularArea());
        System.out.println("O resuldado do perimetro do quadrado é: "+calcularPerimetro());
    }
}
