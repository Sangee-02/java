import java.applet.*;
import java.awt.*;
// <applet code="CarAnimation.class" width="800" height="400">
//</applet>
public class CarAnimation extends Applet
{
 public void paint(Graphics g)
 {
 for(int i=1; i<=1000;i++)
 {
 try {
g.setColor(Color.WHITE);
g.fillOval(0,0,800,400);
 g.setColor(Color.RED);
 g.fillRect(i+50, 100, 200, 50);
 g.fillRect(i+75, 75, 150, 50);
 g.setColor(Color.CYAN);
 g.fillRect(i+110, 80, 30, 30);
 g.fillRect(i+160, 80, 30, 30);
 g.setColor(Color.BLACK);
 g.fillOval(i+75, 140, 50, 50);
 g.fillOval(i+175, 140, 50, 50);
Thread.sleep(50);
 }catch(Exception e){}
 }
 }
}