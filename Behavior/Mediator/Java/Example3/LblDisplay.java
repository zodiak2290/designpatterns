import javax.swing.JLabel;
import java.awt.Font;
class LblDisplay extends JLabel {

    IMediator med;

    LblDisplay(IMediator m) {
        super("Just start...");
        med = m;
        med.registerDisplay(this);
        setFont(new Font("Arial", Font.BOLD, 24));
    }

}