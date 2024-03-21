package estructura;

/**
 * Clase que representa a un insecto.
 * 
 * @author Ángel Subtil
 * @version 1.0
 * @since 21-03-2024
 */
public class Insecto {
	/**
	 * El nombre del insecto.
	 */
	private String nombre;

	/**
	 * La edad del insecto en días.
	 */
	private int edad;

	/**
	 * Constructor para crear un nuevo insecto con un nombre y edad inicial.
	 *
	 * @param nombre El nombre del insecto.
	 * @param edad   La edad del insecto en días.
	 */
	public Insecto(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
	}

	/**
	 * Método para obtener el nombre del insecto.
	 * @return El nombre del insecto.
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Método para establecer el nombre del insecto.
	 * @param nombre El nombre del insecto.
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Método para obtener la edad del insecto.
	 * @return La edad del insecto en días.
	 */
	public int getEdad() {
		return edad;
	}

	/**
	 * Método para establecer la edad del insecto.
	 * @param edad La edad del insecto en días.
	 */
	public void setEdad(int edad) {
		this.edad = edad;
	}

	/**
	 * Método que hace que el insecto se mueva.
	 * @param distancia La distancia que el insecto se moverá.
	 * @return Un mensaje indicando que el insecto se ha movido.
	 */
	public String mover(int distancia) {
		return "El insecto se ha movido " + distancia + " metros.";
	}

	/**
	 * Método que hace que el insecto emita un sonido.
	 * @return El sonido emitido por el insecto.
	 */
	public String hacerSonido() {
		return "¡El insecto hizo un zumbido!";
	}
}
