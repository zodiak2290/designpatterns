public class PoliciaEspecial extends ManejadorMensaje{

        private String key = "0A89E4";

        @Override

        public void manejarMensaje(Mensaje msg){

                if(msg.obtenerCodificacion().equals("especial"))

                        System.out.println("soy especial" + msg.desencriptar(key));

                else

                        this.proximo.manejarMensaje(msg);

        }

}
