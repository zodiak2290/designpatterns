public abstract class ManejadorMensaje{

        ManejadorMensaje proximo;



        public void establecerProximo(ManejadorMensaje proximo){

                this.proximo = proximo;

        }



    public abstract void manejarMensaje(Mensaje msg);

}

