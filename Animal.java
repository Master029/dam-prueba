package estructura;

/**
 * @author Ángel Subtil
 * @version 1.0
 * @since 21-03-2024
 */
public class Animal {

	/**
	 * El nombre del animal.
	 */
	private String nombre;

	/**
	 * La edad del animal en años.
	 */
	private int edad;

	/**
	 * Constructor para crear un animal.
	 * @param nombre El nombre del animal.
	 * @param edad   La edad del animal en años.
	 */
	public Animal(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
	}

	/**
	 * Método para conseguir el nombre del animal
	 * @return El nombre del animal.
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Método para establecer el nombre del animal.
	 * 
	 * @param nombre El nombre del animal.
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Método para obtener la edad del animal.
	 * 
	 * @return La edad del animal.
	 */
	public int getEdad() {
		return edad;
	}

	/**
	 * Método para establecer la edad del animal.
	 * 
	 * @param edad La edad del animal.
	 */
	public void setEdad(int edad) {
		this.edad = edad;
	}

	/**
	 * Método que hace que el animal emita un sonido.
	 * 
	 * @return El sonido emitido por el animal.
	 * @deprecated Este método está obsoleto, el nuevo es el método hacerSonido().
	 * @see #hacerSonido()
	 */
	@Deprecated
	public String emitirSonido() {
		return "¡El animal emitió un sonido!";
	}

	/**
	 * Método que hace que el animal haga un sonido
	 * 
	 * @return El sonido que hace el animal.
	 */
	public String hacerSonido() {
		return "¡El animal hizo un sonido!";
	}
}
