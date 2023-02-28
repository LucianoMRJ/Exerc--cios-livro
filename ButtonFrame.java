
import javax.swing.JFrame;


public class ButtonFrame extends JFrame {
    
    
    
    public ButtonFrame(){
        
    }
}

class Main3{
    public static void main(String[] args) {
        TextFieldFrame test = new TextFieldFrame();
        
        test.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        test.setSize(1000, 1000);
        test.setVisible(true);
        
        //System.exit(0);
    }
}

