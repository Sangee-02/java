import java.io.*;
class Cylinder{
public static void main (String args[])
{
try
{
InputStreamReader isr =new InputStreamReader(System.in);
BufferedReader br= new BufferedReader(isr);
System.out.println("CIRCLE PROGRAM");
System.out.println("enter the r value");
String s1= br.readLine();
int r = Integer.parseInt(s1);
System.out.println("enter the h value");
String s2= br.readLine();
int h = Integer.parseInt(s2);


System.out.println("RESULT");
double a = r*r*3.14*h;
System.out.println("AREA OF CYLINDER :"+a);
double b= 2*r*3.14*h;
System.out.println("PRIMETER OF CYLINDER :"+b);
}
catch(Exception e)
{
System.out.println("ERROR:"+ e.getMessage());
}
}
}
