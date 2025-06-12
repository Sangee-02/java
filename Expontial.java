import java .io.*;
class Expontial 
{
public static void main(String args[])
{
try
{
InputStreamReader isr =new InputStreamReader (System.in);
BufferedReader br = new BufferedReader(isr);
System.out.println("CIRCLE PROGRAM");
System.out.println("enter the x value");
String s1= br.readLine();
int x = Integer.parseInt(s1);
System.out.println("enter the y value");
String s2= br.readLine();
int y = Integer.parseInt(s2);
System.out.println("enter the z value");
String s3= br.readLine();
int z = Integer.parseInt(s3);
System.out.println("RESULT");
int a= (x*x)+(y*y)+(z*z);
System.out.println("A:"+ a);
int b =(x*y)+(y*z)+(y*z);
System.out.println("B:"+ b);
int c=(x*x*x)+(x*x*y)+(x*z);
System.out.println("C:"+ c);
}
catch(Exception e)
{
System.out.println("ERROR:"+ e.getMessage());
}
}
}


