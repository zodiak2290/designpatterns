import javax.swing.JButton;
import java.awt.event.ActionListener;
//Un amigo concreto
class BtnSearch extends JButton implements Command {

    IMediator med;

    BtnSearch(ActionListener al, IMediator m) {
        super("Search");
        addActionListener(al);
        med = m;
        med.registerSearch(this);
    }

    public void execute() {
        med.search();
    }
    
}
