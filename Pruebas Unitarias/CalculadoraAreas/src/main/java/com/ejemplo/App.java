mport java.util.Scanner;

public class App {
    public static void main(String[] args) {
        CalculadoraAreas calc = new CalculadoraAreas();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Seleccione una operación:");
        System.out.println("1. Área del círculo");
        System.out.println("2. Área del cuadrado");
        System.out.println("3. Área del rectángulo");
        System.out.println("4. Área del triángulo");

        int opcion = scanner.nextInt();
        switch (opcion) {
            case 1:
                System.out.print("Ingrese el radio: ");
                double radio = scanner.nextDouble();
                System.out.println("Área del círculo: " + calc.areaCirculo(radio));
                break;
            case 2:
                System.out.print("Ingrese el lado: ");
                double lado = scanner.nextDouble();
                System.out.println("Área del cuadrado: " + calc.areaCuadrado(lado));
                break;
            case 3:
                System.out.print("Ingrese el largo y el ancho: ");
                double largo = scanner.nextDouble();
                double ancho = scanner.nextDouble();
                System.out.println("Área del rectángulo: " + calc.areaRectangulo(largo, ancho));
                break;
            case 4:
                System.out.print("Ingrese la base y la altura: ");
                double base = scanner.nextDouble();
                double altura = scanner.nextDouble();
                System.out.println("Área del triángulo: " + calc.areaTriangulo(base, altura));
                break;
            default:
                System.out.println("Opción inválida");
        }
        scanner.close();
    }
}