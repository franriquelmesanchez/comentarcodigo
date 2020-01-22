package Entradablog;

/**Clase para manejar las entradas de un blog.
 * @since 22/01/2020 
 * @author Francisco Javier Riquelme S�nchez.
 * @version 2.3
 */

public class EntradaBlogFJRS{
/**separador es el ccar�cter que separa ENTRADA DE del
 * @author Francisco Javier Riquelme S�nchez
 */
	
	public static char separador=':';
	private int id;
	private String texto;
	private String autor;
	
/**Constructor de la clase. recibe el n�mero de entrada, el nombre del autor
 es negativo, lanza una excepci�n.
 * @throws "El id no puede ser negativo" 
 */
	public void EntradaBlog(int id,String autor,String texto)throws IllegalArgumentException{
		if(id<=0) throw new IllegalArgumentException("El id no puede ser negativo");
		this.id=id;
		this.autor=autor;
		this.texto=texto;
	}
	@Override
	public String toString(){
		String cad="";
		cad+="\nENTRADA DE"+separador+autor;
		cad+="\n "+texto;
		return cad;
	}
	
	/** devuelve el n�mero de la entrada
	 * @return n�m entrada
	*/
	
	public int getId(){
		return this.id;
	}
	
	/**devuelve el texto completo de la entrada
	 * @return texto completo entrada
	 */
	public String getTexto(){
		return this.texto;
	}
	
	/**devuelve el nombre del autor de la entrada en may�sculas
	 *  @return nombre del autor en <strong>MAY�SCULAS</strong>
	*/
	public String getAutor(){
		return this.autor.toUpperCase();
	}
	
	/**devuelve el nombre del autor. Ya no se usa. Mejor ver getAutor
	 * @return nombre autor
	 * @see getAutor
	 */
	public String devuelveAutor(){
		return this.autor;
	}
	
	
	public static void main(String[] args) {
                
		EntradaBlogFJRS e1=new EntradaBlogFJRS ();
		System.out.println(e1);
	}
}


	

