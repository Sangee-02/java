import java.awt.*;
class Apps
{
public static  void main(String args[])
{
Frame f=new Frame();
f.setTitle("word");
f.setSize(300,500);
f.setLayout(newFlowLayout());
Label l1=new Label("user name");
TextField tf1=new TextField(30);
Label l2=new Label("password");
TextField tf2=new TextField(30);
Button login= new Button("login");
l1.setForeground(Color.RED);
f.setBackground(Color.BLUE);
f.add(l1);
f.add(tf1);
f.add(l2);
f.add(tf2);
f.add(login);
f.setVisible(true);
}
}