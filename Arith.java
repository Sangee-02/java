import java .io.*;
class Arith
{
public static void main(String args[])
{
try
{
InputStreamReader isr = new InputStreamReader (System.in);
BufferedReader br= new BufferedReader (isr);
System.out.println("ARITHMETIC OPERATION ");
System.out.println("_____________________");
System.out.println("ENTER THE FIRST NUMBER ");
String s1 = br.readLine();
int a = Integer.parseInt(s1);
System.out.println("ENTER THE SECOND NUMBER ");
String s2 = br.readLine();
int b = Integer.parseInt(s2);
System.out.println("RESULT");
int c = a + b;
System.out.println("ADD:"+ c);
int d= a -b;
System.out.println("SUB:"+d);

int e = a *b;
System.out.println("MUL:"+e);

int f= a/ b;
System.out.println("DIV :"+f);
int g= a % b;
System.out.println("MOD :" +g);
}
catch (Exception e)
{
System.out.println("Error:"+ e.getMessage());
}
}
}




