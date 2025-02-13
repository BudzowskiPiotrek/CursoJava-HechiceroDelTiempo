package proyecto;

import java.util.Scanner;

public class a0085 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int opcion, energia = 100, puntosPueblo = 50, turno = 1;

		do {
			System.out.println("Dia: " + turno);
			System.out.println("Estado actual de prosperidad: " + puntosPueblo);
			System.out.println("Energia Magica restante: " + energia);
			System.out.println("1. Trae lluvia ( -10 energia, +10 prosperidad )");
			System.out.println("2. Aumentar el Calor ( -5 energia, +5 prosperidad )");
			System.out.println("3. General frio ( +2 energia, -5 prosperidad )");
			System.out.println("4. Crear viento ( -8 energia, +3 prosperidad )");
			System.out.println("5. No hacer nada ( +10 energia, -15 prosperidad )");
			System.out.println("Elige una opcion: ");
			opcion = entrada.nextInt();
			if (energia > 10) {
				System.out.println("Ciudado Hechizero tu nivel de energia esta en: " + energia);
			}

			switch (opcion) {
			case 1:
				System.out.println("Has traido la lluvia, acelerando crecimiento");
				energia -= 10;
				puntosPueblo += 10;
				turno++;
				break;
			case 2:
				System.out.println("Has aumentado calor, acelerando crecimiento");
				energia -= 5;
				puntosPueblo += 5;
				turno++;
				break;
			case 3:
				System.out.println("Has traido Frio, recuoperando magia, pero retrocediendo crecimiento");
				energia += 2;
				puntosPueblo -= 5;
				turno++;
				break;
			case 4:
				System.out.println("Has traido el viento, acelerando crecimiento");
				energia -= 8;
				puntosPueblo += 3;
				turno++;
				break;
			case 5:
				System.out.println(
						"Has decidido no hacer nada hoy, Recuperas 10 de energia, pero pierdes 15 de prosperidad");
				energia += 10;
				puntosPueblo -= 15;
				turno++;
				break;
			default:
				System.out.println("Error");

			}
		} while (energia > 1 && puntosPueblo > 1&&turno<30);

		if (turno==30) {
			System.out.println("Has ganado");
		}else 
		System.out.println("Has Perdido");
	}

}
