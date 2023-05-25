/*
 *Tenemos una clase padre Animal junto con sus 3 clases hijas Perro, Gato, Caballo.
La clase Animal tendrá como atributos el nombre, alimento, edad y raza del Animal.
Crear un método en la clase Animal a través del cual cada clase hija deberá mostrar luego un
mensaje por pantalla informando de que se alimenta. Generar una clase Main que realice lo
siguiente:
 */
package ejaphe_01;

import Entidades.Animal;
import Entidades.Caballo;
import Entidades.Gato;
import Entidades.Perro;

/**
 *
 * @author Wendy
 */
public class EjApHe_01 {

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		Perro perro = new Perro("Stich", "Carne", 15, "Doberman");
		Perro perro1= new Perro("Teddy", "Croquetas", 10, "Chihuahua");
		Gato gato = new Gato("Pelusa", "Galletas", 15, "Siamés");
		Caballo caballo = new Caballo("Spark", "Pasto", 25, "Fino");

		System.out.println(perro.getNombre());
		perro.alimentarse();
		System.out.println("");
		System.out.println(perro1.getNombre());
		perro1.alimentarse();
		System.out.println("");
		System.out.println(gato.getNombre());
		gato.alimentarse();
		System.out.println("");
		System.out.println(caballo.getNombre());
		caballo.alimentarse();
		System.out.println("");
	}
}
