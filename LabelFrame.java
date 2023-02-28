import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.Icon;
import javax.swing.ImageIcon;

public class LabelFrame extends JFrame{
    private JLabel label1;
    private JLabel label2;
    private JLabel label3;
    
    public LabelFrame(){
        super( "Testing JLabel" );
        setLayout( new FlowLayout() );
        
        label1 = new JLabel ("Label with text");
        label1.setToolTipText("This is label1");
        label1.setHorizontalTextPosition(SwingConstants.CENTER);
        label1.setVerticalTextPosition(SwingConstants.TOP);
        add(label1);
        
        Icon frog1 = new ImageIcon(getClass().getResource("Frog1.jpg"));
        label2 = new JLabel("Label with text and icon", frog1, SwingConstants.LEFT);
        label2.setToolTipText("This is label2");
        add(label2);
        
        Icon frog2 = new ImageIcon(getClass().getResource("Frog2.jpg"));
        label3 = new JLabel();
        label3.setText("Label with icon and text at the bottom");
        label3.setIcon(frog2);
        label3.setHorizontalTextPosition(SwingConstants.CENTER);
        label3.setVerticalTextPosition(SwingConstants.BOTTOM);
        label3.setToolTipText("This is Label3");
        add(label3);
    }
}

class Main1{
    public static void main(String[] args) {
        LabelFrame test = new LabelFrame();
        
        test.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        test.setSize(385, 1000);
        test.setVisible(true);
        
        //System.exit(0);
    }
}
