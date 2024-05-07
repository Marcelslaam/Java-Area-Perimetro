import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

      Scanner leer = new Scanner(System.in);
      
        // while () {
          // pendiente
        // }




      System.out.println("Bienvenido, selecione una opcion");
      System.out.println("1.Perimetro");
      System.out.println("2.Area");
      int opcion1 = leer.nextInt();
      if (opcion1 == 1) {
        funcionSwichtPerimetro(leer);
      }else if (opcion1 == 2) {
        funcionSwichtArea(leer);
        // crea swicht de area
      }



      
      
      }

      // -----------------------
      public static void funcionSwichtPerimetro(Scanner leer){
        System.out.println("1.Perimetro, rectangulo");
        System.out.println("2.Perimetro, trapecio isósceles");
        System.out.println("3.Perimetro, triangulo equilatero");

          int opcion2 = leer.nextInt();
          switch (opcion2) {
            case 1:
            perimetroRectangulo(leer);
            // Logramos acceder al swicht y luego declaramos las funciones donde el mismo swicht ira importando la informacion necesaria
              break;
            case 2:
            perimetroTrapecioIsosceles(leer);
            break;
            case 3:
            perimetroTrianguloEquilatero(leer);
            }
      }
      
      public static void perimetroRectangulo(Scanner leer){
        System.out.println("Rectangulo");
          System.out.println("Ingresa la base de tu rectangulo");
          double base = leer.nextDouble();
          System.out.println("Ahora ingresa su altura");
          double altura = leer.nextDouble();
    
          double resultado = 2*(base + altura);
    
          System.out.println("El perimetro del rectangulo es: " + resultado);
      }

      public static void perimetroTrapecioIsosceles(Scanner leer){
        System.out.println("Trapecio Isosceles");
        System.out.println("Ingresa el lado oblicuo");
        double oblicuo = leer.nextDouble();
        System.out.println("Ingresa la base mayor");
        double baseMayor = leer.nextDouble();
        System.out.println("Ingresa la base menor");
        double baseMenor = leer.nextDouble();
        double resultado2 = (oblicuo*2)+ baseMayor + baseMenor;
        System.out.println("El perimetro del trapecio isoceles es: " + resultado2);
      }

      public static void perimetroTrianguloEquilatero(Scanner leer){
        System.out.println("Triangulo Equilatero");
        System.out.println("Ingrea la longitud");
        double longitud = leer.nextDouble();
        double resultado = 3* longitud;
        System.out.println("El perimetro del triangulo es: " + resultado);
      }
    
      // --------------------------
      public static void funcionSwichtArea(Scanner leer){
        System.out.println("1.Area, rectangulo");
        System.out.println("2.Area, trapecio isósceles");
        System.out.println("3.Area, triangulo equilatero");

        int opcion = leer.nextInt();
        switch (opcion) {
           case 1:
            areaRectangulo(leer);
           break;
           case 2:
            areaTrapecioIsosceles(leer);
           break;
           case 3:
            areaTrianguloEquilatero(leer);
            break;
        
          default:
            break;
        }
      }

      public static void areaRectangulo(Scanner leer){
        System.out.println("Rectangulo");
        System.out.println("Ingrese el largo");
        double largo = leer.nextDouble();
        System.out.println("Ingrese el ancho");
        double ancho = leer.nextDouble();
        double resultado = largo * ancho;
        System.out.println("El area de su rectangulo es: " + resultado);

      }

      public static void areaTrapecioIsosceles(Scanner leer){
        System.out.println("Trapecio Isosceles");
        System.out.println("Ingrese base mayor");
        double baseMayor = leer.nextDouble();
        System.out.println("Ingrese base menor");
        double baseMenor = leer.nextDouble();
        System.out.println("Ahora ingrese altura");
        double altura = leer.nextDouble();
        double resultado = (baseMayor + baseMenor) * altura/2;
        System.out.println("El Area de su trapecio es de: " + resultado);

        // Área = (base mayor + base menor) * altura / 2
      }

      public static void areaTrianguloEquilatero(Scanner leer){
        System.out.println("Triangulo Equilatero");
        System.out.println("Ingrese base");
        double base = leer.nextDouble();
        System.out.println("Ingrese altura");
        double altura = leer.nextDouble();
        double resultado = (base * altura) / 2;
        System.out.println("El area de su Triangulo Equilatero es: " + resultado);
      }
    }

// Agregar readme y explicar que se utilizo