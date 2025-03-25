import java.io.*;
class Arith
{
public static void main (String args[])
{
try
{
InputStreamReader isr=new InputStreamReader(System.in);
BufferedReader br=new BufferedReader(isr);
System.out.println("ARITHMETIC OPERATION");
System.out.println(".............");
System.out.println("Enter the first no:");
String S1 = br.readLine();
int a=Integer.parseInt(S1); 
System.out.println("Enter the second no:");
String S2 = br.readLine();
int b=Integer.parseInt(S2);            
System.out.println("Result");
int c=a+b;
System.out.println("Add:"+c);
int d=a-b;
System.out.println("Sub:"+d);
}catch(Exception e)
{
System.out.println("Error:" + e.getMessage());
}
}
}
