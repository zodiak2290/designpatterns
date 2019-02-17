public class Mensaje{
	
	String codificacion, text, key;

	public Mensaje(String codificacion, String text){
		this.codificacion = codificacion;
		this.text = text;
	}

	public String obtenerCodificacion(){
		return this.codificacion;
	}

	public String desencriptar(String key){
		return this.text;
	}
}