import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Graphics;

public class Draw extends JPanel{
    public void paintComponent (Graphics g){
        super.paintComponent(g);
        
        int width = getWidth();
        int height = getHeight();
        //lINHAS ATÉ A METADE DA TELA     
//          g.drawLine(150, 150, 0, 0);
//          g.drawLine(180, 120, 0, 0);
//          g.drawLine(210, 90, 0, 0);
//          g.drawLine(240, 60, 0, 0);
//          g.drawLine(270, 30, 0, 0);
//          g.drawLine(120, 180, 0, 0);
//          g.drawLine(90, 210, 0, 0);
//          g.drawLine(60, 240, 0, 0);
//          g.drawLine(30, 270, 0, 0);
        
      
      //EFEITO FODA
      //Lado esquerdo pra baixo
//      g.drawLine(0, 0, 30, 300);
//      g.drawLine(0, 30, 60, 300);
//      g.drawLine(0, 60, 90, 300);
//      g.drawLine(0, 90, 120, 300);
//      g.drawLine(0, 120, 150, 300);
//      g.drawLine(0, 150, 180, 300);
//      g.drawLine(0, 180, 210, 300);
//      g.drawLine(0, 210, 240, 300);
//      g.drawLine(0, 240, 300, 300);
//      g.drawLine(0, 270, 300, 300);
//      g.drawLine(0, 300, 300, 300);
//      //Lado direito pra baixo
//      g.drawLine(300, 0, 300, 300);
//      g.drawLine(300, 0, 270, 300);
//      g.drawLine(300, 30, 240, 300);
//      g.drawLine(300, 60, 210, 300);
//      g.drawLine(300, 90, 180, 300);
//      g.drawLine(300, 120, 150, 300);
//      g.drawLine(300, 150, 120, 300);
//      g.drawLine(300, 180, 90, 300);
//      g.drawLine(300, 210, 60, 300);
//      g.drawLine(300, 240, 30, 300);
//      g.drawLine(300, 270, 0, 300);
//      //Lado esquerdo pra cima
//      g.drawLine(0, 300, 30, 0);
//      g.drawLine(0, 270, 60, 0);
//      g.drawLine(0, 240, 90, 0);
//      g.drawLine(0, 210, 120, 0);
//      g.drawLine(0, 180, 150, 0);
//      g.drawLine(0, 150, 180, 0);
//      g.drawLine(0, 120, 210, 0);
//      g.drawLine(0, 90, 240, 0);
//      g.drawLine(0, 60, 300, 0);
//      g.drawLine(0, 30, 300, 0);
//      g.drawLine(0, 0, 300, 0);
//      //Lado direito pra cima
//      g.drawLine(300, 300, 300, 0);
//      g.drawLine(300, 300, 270, 0);
//      g.drawLine(300, 270, 240, 0);
//      g.drawLine(300, 240, 210, 0);
//      g.drawLine(300, 210, 180, 0);
//      g.drawLine(300, 180, 150, 0);
//      g.drawLine(300, 150, 120, 0);
//      g.drawLine(300, 120, 90, 0);
//      g.drawLine(300, 90, 60, 0);
//      g.drawLine(300, 60, 30, 0);
//      g.drawLine(300, 30, 0, 0);

    }
}

class Main0{
    public static void main(String[] args) {
        Draw panel = new Draw();
        
        JFrame application = new JFrame();
        
        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
        application.add(panel);
        application.setSize(315, 340);
        application.setVisible(true);
    }
}
