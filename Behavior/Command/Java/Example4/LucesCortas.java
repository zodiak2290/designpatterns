public class LucesCortas : LucesReceiver
{
    private const int DISTANCIA = 40;
 
    public override int Encender()
    {
        this.encendidas = true;
        return DISTANCIA;
    }
}