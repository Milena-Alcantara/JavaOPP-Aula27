package Ex2;

public class Retangulo extends Forminha{
    public float lado;
    public float altura;

    public Retangulo(float lado, float altura){
        this.lado = lado;
        this.altura = altura;
    }
    @Override
    public float calcaularArea() {
        return lado*altura;

    }
    @Override
    public float calcularPerimetro() {
        return (lado*2) +(altura*2);
    }

    @Override
    public void mostrarResultado() {

        System.out.println("O resultado da área do Retângulo é: "+calcaularArea());
        System.out.println("O resuldado do perimetro do Retângulo é: "+calcularPerimetro());


    }


}
