public class Triangulo {
    private Double b;
    private Double l;

    private Double h;

    public Triangulo(Double b, Double h) {
        this.b = b;
        this.h = h;
    }


    public Double calcularTriangulo(Double b, Double h){
        System.out.println("Calculando el area de un Triangulo");
        Double calcular = (b * h) / 2;
        return calcular;
    }

}

