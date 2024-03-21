package estructura;

/**
 * @author �ngel Subtil
 * @version 1.0
 * @since 21-03-2024
 */
public class Animal {

	/**
	 * El nombre del animal.
	 */
	private String nombre;

	/**
	 * La edad del animal en a�os.
	 */
	private int edad;

	/**
	 * Constructor para crear un animal.
	 * @param nombre El nombre del animal.
	 * @param edad   La edad del animal en a�os.
	 */
	public Animal(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
	}

	/**
	 * M�todo para conseguir el nombre del animal
	 * @return El nombre del animal.
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * M�todo para establecer el nombre del animal.
	 * 
	 * @param nombre El nombre del animal.
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * M�todo para obtener la edad del animal.
	 * 
	 * @return La edad del animal.
	 */
	public int getEdad() {
		return edad;
	}

	/**
	 * M�todo para establecer la edad del animal.
	 * 
	 * @param edad La edad del animal.
	 */
	public void setEdad(int edad) {
		this.edad = edad;
	}

	/**
	 * M�todo que hace que el animal emita un sonido.
	 * 
	 * @return El sonido emitido por el animal.
	 * @deprecated Este m�todo est� obsoleto, el nuevo es el m�todo hacerSonido().
	 * @see #hacerSonido()
	 */
	@Deprecated
	public String emitirSonido() {
		return "�El animal emiti� un sonido!";
	}

	/**
	 * M�todo que hace que el animal haga un sonido
	 * 
	 * @return El sonido que hace el animal.
	 */
	public String hacerSonido() {
		return "�El animal hizo un sonido!";
	}
}
