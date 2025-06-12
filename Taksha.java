import java.awt.*;
class Taksha extends Frame
{
public static void main(String args[])
{
Taksha f6=new Taksha();
f6.setSize(800,600);
f6.setTitle("TAKSHA");
f6.setVisible(true);
}
Taksha()
{
FlowLayout f1=new FlowLayout();
this.setLayout(f1);
this.setLayout(null);
Panel p1=new Panel();
Label l0=new Label("TAKSHASHILA UNIVERSITY");
Label l1=new Label("State Private University");
Label l2=new Label("Ongur,Tindivanam,Villupuram,Dist");
p1.setBackground(Color.YELLOW);
Font f0=new Font("Arial",Font.BOLD,32);
l0.setFont(f0);
l1.setFont(f0);
l2.setFont(f0);
this.add(l0);
this.add(l1);
this.add(l2);
this.add(p1);
p1.setBounds(40,30,40,50);
Panel p2=new Panel();
Label l3=new Label("STUDENT MARK LIST");
p2.setBackground(Color.RED);
Font f=new Font("Arial",Font.BOLD,32);
l3.setFont(f0);
p2.add(l3);
this.add(p2);
Label l11=new Label("Enrollement Number");
Label l12=new Label("Name of the Student");
Label l13=new Label("Java program Mark");
Label l14=new Label("Computer Network Mark");
Label l15=new Label("Operating System Mark");
Label l16=new Label("Totel Mark");
Label l17=new Label("Average Mark");
TextField t1=new TextField(20);
TextField t2=new TextField(20);
TextField t3=new TextField(20);
TextField t4=new TextField(20);
TextField t5=new TextField(20);
TextField t6=new TextField(20);
TextField t7=new TextField(20);
Button b1=new Button("SUMBIT");
this.add(l11);
this.add(l12);
this.add(l13);
this.add(l14);
this.add(l15);
this.add(l16);
this.add(l17);
this.add(t1);
this.add(t2);
this.add(t3);
this.add(t4);
this.add(t5);
this.add(t6);
this.add(t7);
this.add(b1);
l11.setBounds(100,10,400,30);
l12.setBounds(140,20,500,50);
l13.setBounds(200,150,150,50);
l14.setBounds(50,150,150,50);
l15.setBounds(50,150,150,50);
l16.setBounds(50,150,150,50);
l17.setBounds(50,150,150,50);
t1.setBounds(50,150,150,50);
t2.setBounds(50,150,150,50);
t3.setBounds(50,150,150,50);
t4.setBounds(50,150,150,50);
t5.setBounds(50,150,150,50);
t6.setBounds(50,150,150,50);
t7.setBounds(50,150,150,50);
b1.setBounds(50,150,150,50);

}
}
            
               
                   
