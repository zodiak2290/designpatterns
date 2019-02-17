import java.awt.event.ActionListener;
import javax.swing.JButton;
//Un amigo concreto
class BtnView extends JButton implements Command {

    IMediator med;

    BtnView(ActionListener al, IMediator m) {
        super("View");
        addActionListener(al);
        med = m;
        med.registerView(this);
    }

    public void execute() {
        med.view();
    }
    
}