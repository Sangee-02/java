import java.awt.*;
class App_Arith extends Frame
{
public static void main(String args[]){
App_Arith f=new App_Arith();
f.setTitle("ARITHMETIC");
f.setSize(400,400);
f.setVisible(true);
}
App_Arith()
{
FlowLayout f1=new FlowLayout();
this.setLayout(f1);
this.setLayout(null);
Panel p1=new Panel();
Label l0=new Label("ARITHMETIC OPERATION");
p1.setBackground(Color.YELLOW);
Font f0=new Font("Arial",Font.BOLD,32);
l0.setFont(f0);
p1.add(l0);
this.add(p1);
p1.setBounds(0,30,500,50);
Label L1=new Label("First name");
Label L2=new Label("Second name");
Label L3=new Label("Result");
TextField t1=new TextField(20);
TextField t2=new TextField(20);
TextField t3=new TextField(20);
Button b1=new Button("ADD");
Button b2=new Button("SUB");
Button b3=new Button("DIV");
Button b4=new Button("MUL");
this.add(L1);
this.add(t1);
this.add(L2);
this.add(t2);
this.add(L3);
this.add(t3);
this.add(b1);
this.add(b2);
this.add(b3);
this.add(b4);
L1.setBounds(50,100,150,30);
L2.setBounds(50,150,150,30);
L3.setBounds(50,200,150,30);
t1.setBounds(200,100,150,30);
t2.setBounds(200,150,150,30);
t3.setBounds(200,200,150,30);
b1.setBounds(50,250,80,30);
b2.setBounds(150,250,80,30);
b3.setBounds(250,250,80,30);
b4.setBounds(350,250,80,30);
}
}










