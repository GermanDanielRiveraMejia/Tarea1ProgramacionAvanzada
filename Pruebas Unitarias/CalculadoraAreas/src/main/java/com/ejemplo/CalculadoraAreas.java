public class CalculadoraAreas {
    public double areaCirculo(double radio) {
        return Math.PI * radio * radio;
    }

    public double areaCuadrado(double lado) {
        return lado * lado;
    }

    public double areaRectangulo(double largo, double ancho) {
        return largo * ancho;
    }

    public double areaTriangulo(double base, double altura) {
        return (base * altura) / 2;
    }
}