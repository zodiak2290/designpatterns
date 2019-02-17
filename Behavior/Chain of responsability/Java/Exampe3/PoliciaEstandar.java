public class PoliciaEstandar extends ManejadorMensaje{

        private String key = "0069A0";

        @Override
        public void manejarMensaje(Mensaje msg){

                if(msg.obtenerCodificacion().equals("base"))

                        System.out.println("soy base" + msg.desencriptar(key));

                else

                        this.proximo.manejarMensaje(msg);

        }

}
