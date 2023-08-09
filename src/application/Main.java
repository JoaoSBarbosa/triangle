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
