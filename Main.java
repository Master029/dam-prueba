package estructura;

/**
 * @author Ángel Subtil
 * @version 1.0
 * @since 21-03-2024
 */
public class Main {
	/**
	 * Método principal que crea un objeto Animal y prueba sus métodos.
	 * @param args pasa cualquier argumento da cadenas de caracteres.
	 */
	public static void main(String[] args) {
		Animal perro = new Animal("Antonio", 5);
		System.out.println("Nombre del animal: " + perro.getNombre());
		System.out.println("Edad del animal: " + perro.getEdad());
		System.out.println(perro.hacerSonido());
	}
}
