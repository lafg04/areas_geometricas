public class Triangulo {
    private Integer b;
    private Integer l;

    private Integer h;

    public Triangulo(Integer b, Integer h) {
        this.b = b;
        this.h = h;
    }


    public int calcularTriangulo(int b, int h){
        System.out.println("Calculando el area de un Triangulo");
        int calcular = (b * h) / 2;
        return calcular;
    }

}

