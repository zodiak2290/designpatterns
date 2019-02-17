public class Main{
	public static void main(String [] args){

	        ManejadorMensaje policia1 = new PoliciaEstandar();
	        ManejadorMensaje policia2 = new PoliciaEspecial();
	        ManejadorMensaje policia3 = new PoliciaElite();


	        policia1.establecerProximo(policia2);
	        policia2.establecerProximo(policia3);

	        Mensaje mensaje = new Mensaje("base", " Este mensaje va para la policía especial");
	        policia1.manejarMensaje(mensaje);


	        mensaje = new Mensaje("top-secret", "Este mensaje va para la policía de élite");

	        policia1.manejarMensaje(mensaje);

	}
}