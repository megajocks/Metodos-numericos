import java.util.Scanner;

public class Practica_1 {
    public static void main(String[] args) {

		Scanner ObjLeer=new Scanner(System.in);

		int  opcion=0;
		double radio1,diametro1,area1;
		double base2,altura2,area2;
		double lado3,area3;

		
		System.out.printf("Universidad tecnologica de Panama\n");
		System.out.printf("Metodos numericos para ingenieros\n");
		System.out.printf("Practica numero 1\n");

		System.out.printf("\n");
		while(opcion != 3)
		{
			System.out.printf("\n");
			System.out.printf("1)Circulo\n");
			System.out.printf("2)Triangulo\n");
			System.out.printf("3)Cuadrado\n");
			System.out.printf("\n");
		System.out.printf("Selecciones figura geometrica para obtener su area:        \n");
		opcion=ObjLeer.nextInt();

		switch(opcion)
		{
		case 1:
			System.out.printf("\n");
			System.out.printf("Introdusca el radio del Circulo:   \n");
			radio1=ObjLeer.nextDouble();
			diametro1=radio1*2;
			area1=(3.1416)*(radio1*radio1);
			System.out.printf("\n");
			System.out.printf("El area del Circulo es:   \n"+area1);
			System.out.printf("\n");
			break;

		case 2:
			System.out.printf("\n");
			System.out.printf("Introdusca la base del Triangulo:   \n");
			base2=ObjLeer.nextDouble();
			System.out.printf("\n");
			System.out.printf("Introdusca la altura del Triangulo:   \n");
			altura2=ObjLeer.nextDouble();
			area2=base2*altura2/2;
			System.out.printf("\n");
			System.out.printf("El area del Triangulo es:   \n"+area2);
			System.out.printf("\n");
			break;

		case 3:
			System.out.printf("\n");
			System.out.printf("Introdusca el numero de lados del Cuadrado:   \n");
			lado3=ObjLeer.nextDouble();
			area3=lado3*lado3;
			System.out.printf("\n");
			System.out.printf("El area del Cuadrado es:   \n"+area3);
			System.out.printf("\n");
			break;
		}
		}
		
	}
}
