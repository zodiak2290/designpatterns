public class LucesLargas : LucesReceiver
{
    private const int DISTANCIA = 200;
 
    public override int Encender()
    {
        this.encendidas = true;
        return DISTANCIA;
    }
}