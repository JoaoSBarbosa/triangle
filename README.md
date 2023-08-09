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

O pacote `application` contém a classe principal `Main`, onde o programa é executado. O programa realiza as seguintes etapas:

1. Lê as medidas dos lados dos triângulos X e Y.
2. Calcula a área de cada triângulo utilizando a fórmula de Heron.
3. Compara as áreas dos triângulos e determina qual possui a maior área.
4. Exibe as áreas calculadas e o resultado da comparação.

```
package application;
import java.util.Locale;
import java.util.Scanner;
import entities.Triangle;
public class Main {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double areaX, areaY;
		Triangle x, y;
		x = new Triangle();
		y = new Triangle();
		
		System.out.println("Enter the measures of triangle X:");
		System.out.print("A: ");
		x.a = sc.nextDouble();
		System.out.print("B: ");
		x.b = sc.nextDouble();
		System.out.print("C: ");
		x.c = sc.nextDouble();

		System.out.println("Enter the measures of triangle Y: ");
		System.out.print("A: ");
		y.a = sc.nextDouble();
		System.out.print("B: ");
		y.b = sc.nextDouble();
		System.out.print("C: ");
		y.c = sc.nextDouble();
	
		areaX = x.area();
		areaY = y.area();
		
		System.out.printf("Triangle X area: %.4f%n",areaX);
		System.out.printf("Triangle Y area: %.4f%n",areaY);
		
		if(areaX > areaY) {
			System.out.println("Large area: X");
		}else {
			System.out.println("Large area: Y");
		}
		sc.close();
	}
}

```

## Como utilizar

1. Execute a classe `Main` no pacote `application`.
2. Siga as instruções para inserir as medidas dos lados dos triângulos X e Y.
3. O programa exibirá as áreas calculadas de cada triângulo e indicará qual deles possui a maior área.

Lembre-se de inserir medidas válidas para os lados dos triângulos a fim de obter resultados precisos.

## Tecnologias Utilizadas

- Linguagem de programação: Java
- Pacotes: `entities` e `application`
- Bibliotecas: `java.util.Locale`, `java.util.Scanner`, `java.lang.Math`

**Desenvolvido por [João Barbosa]**