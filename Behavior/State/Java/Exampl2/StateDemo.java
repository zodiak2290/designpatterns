import java.io.IOException;
import java.io.InputStreamReader;

public class StateDemo {
    public static void main(String[] args) throws IOException {
        InputStreamReader is = new InputStreamReader( System.in );
        Button btn = new Button();
        int i = 0;
        while (i < 10) {
            //System.out.print("Press 'Enter'");
            //is.read();
            btn.push();
            i++;
        }
    }
}
