import javax.swing.JButton;
import java.awt.event.ActionListener;
//Un amigo concreto
class BtnBook extends JButton implements Command {

    IMediator med;

    BtnBook(ActionListener al, IMediator m) {
        super("Book");
        addActionListener(al);
        med = m;
        med.registerBook(this);
    }

    public void execute() {
        med.book();
    }

}