import java.applet.*;
import java.awt.*;
//<applet code="Animation1.class" width="500" height="500">  </applet>
public class Animation1 extends Applet {

   public void paint(Graphics g) {
        try{
       
        for(int i=100;i<=200;i++)
        {
            g.setColor(Color.BLACK);
            g.fillRect(0,0,500,500);
            Font fo = new Font("Arial", Font.BOLD,32);
            g.setFont(fo);
            g.setColor(Color.YELLOW);
        g.drawString("MCA STUDENTS",i+10,i+10);
        Thread.sleep(1/900);
        }
        Thread.sleep(5000);

        g.setColor(Color.BLACK);
        g.fillRect(0,0,500,500);
        g.setColor(Color.WHITE);
        g.drawString("coding club 25",100,300);
        g.drawString("MCA 2024-27", 150,350);
        Thread.sleep(5000);
        }
        catch(Exception e){}
        }
}
