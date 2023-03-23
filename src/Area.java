import java.util.Scanner;

public class Area {
    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);

        System.out.println("Bienvenido, por favor seleccione la figura a calcular el area");
        System.out.println("1 - Cuadrado");
        System.out.println("2 - Rectangulo");
        System.out.println("3 - Triangulo");

        int selec = Integer.parseInt(scanner.next());

        if(selec==1){
            System.out.println("Digite la longitud");
            int l = Integer.parseInt(scanner.next());
            System.out.println("Digite el ancho");
            int a = Integer.parseInt(scanner.next());
            Cuadrado c = new Cuadrado();
            System.out.println("El resultado del área del cuadrado es: " + c.areaCuadrado(l, a));
        }

        if(selec==2){
            System.out.println("Digite la longitud");
            int l = Integer.parseInt(scanner.next());
            System.out.println("Digite el ancho");
            int a = Integer.parseInt(scanner.next());
            Rectangulo rectangulo = new Rectangulo(l,a);
            System.out.println("El resultado del area del rectangulo es "+ rectangulo.calcular());
        }

        if(selec==3){
            System.out.println("Digite la base");
            int b = Integer.parseInt(scanner.next());
            System.out.println("Digite el altura");
            int h = Integer.parseInt(scanner.next());
            Triangulo triangulo = new Triangulo(b,h);
            System.out.println("El resultado del area del triangulo es "+ triangulo.calcular());
        }

    }

}
