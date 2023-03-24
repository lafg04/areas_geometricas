import java.util.Scanner;

public class Area {
    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);
        double x;
        double y;



       String continuar = "S";

        do{

            System.out.println("Bienvenido, por favor seleccione la figura a calcular el area");
            System.out.println("1 - Cuadrado");
            System.out.println("2 - Rectangulo");
            System.out.println("3 - Triangulo");
            int selec = Integer.parseInt(scanner.next());
            switch (selec){
                case 1:
                    System.out.println("Digite la longitud");
                    x = Double.parseDouble(scanner.next());
                    System.out.println("Digite el ancho");
                    y = Double.parseDouble(scanner.next());
                    Cuadrado c = new Cuadrado();
                    System.out.println("El resultado del área del cuadrado es: " + c.areaCuadrado(x, y));
                    System.out.println("¿Desea calcular otra area?");
                    continuar= scanner.next();
                   break;


                case 2:
                    System.out.println("Digite la longitud");
                    x = Double.parseDouble(scanner.next());
                    System.out.println("Digite el ancho");
                    y = Double.parseDouble(scanner.next());
                    Rectangulo rectangulo = new Rectangulo(x,y);
                    System.out.println("El resultado del area del rectangulo es "+ rectangulo.calcular());
                    System.out.println("¿Desea calcular otra area?");
                    continuar= scanner.next();
                    break;
                case 3:
                    System.out.println("Digite la base");
                    x = Double.parseDouble(scanner.next());
                    System.out.println("Digite el altura");
                    y = Double.parseDouble(scanner.next());
                    Triangulo triangulo = new Triangulo(x,y);
                    System.out.println(triangulo.calcularTriangulo(x,y));
                    System.out.println("¿Desea calcular otra area?");
                    continuar= scanner.next();
                break;
            }
        }while (continuar=="S");




    }

}
