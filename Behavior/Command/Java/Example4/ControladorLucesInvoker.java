public class ControladorLucesInvoker : IInvoker
{
    ICommand command;
 
    public void SetCommand(ICommand command)
    {
        this.command = command;
    }
 
    public void Invoke()
    {
        command.Execute();
    }
}