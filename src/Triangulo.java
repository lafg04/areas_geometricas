public class Triangulo {
    private Integer b;
    private Integer h;
    public Triangulo (Integer b, Integer h){
        this.b = b;
        this.h= h;
    }

    public Integer calcular (){
        return  (b*h)/2;
    }
}
