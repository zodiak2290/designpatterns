public class PoliciaElite extends ManejadorMensaje{

        private String master_key = "F0FEF2";

        @Override

        public void manejarMensaje(Mensaje msg){

                System.out.println("soy elite "+ msg.desencriptar(master_key));

        }

}
