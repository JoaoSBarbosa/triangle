# Calculadora de Áreas de Triângulos📐☕

Este é um programa Java simples para calcular as áreas de dois triângulos e determinar qual deles possui a maior área. O programa utiliza a fórmula de Heron para calcular a área de um triângulo a partir das medidas de seus lados.

## Funcionalidades

- Solicita as medidas dos lados dos triângulos X e Y.
- Calcula a área de cada triângulo utilizando a fórmula de Heron.
- Compara as áreas e determina qual triângulo possui a maior área.
- Exibe os resultados na saída padrão.

## Pacotes e Classes

### entities.Triangle

O pacote `entities` contém a classe `Triangle`, que é responsável por calcular a área de um triângulo utilizando a fórmula de Heron.

`public class Triangle {
    public double a;
    public double b;
    public double c;

    public class Triangle {
        public double a;
        public double b;
        public double c;
    
        public Triangle() {
        }
    
        public Triangle(double a, double b, double c) {
            this.a = a;
            this.b = b;
            this.c = c;
        }
    
        public double area() {
            double p = (a + b + c) / 2.0;
            return Math.sqrt(p * (p - a) * (p - b) * (p - c));
        }
    }
### application.Main

O pacote `application` contém a classe `Main`, que é a classe principal do programa. Ela interage com o usuário para obter as medidas dos lados dos triângulos...