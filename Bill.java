import java .io.*;
class Bill
{
public static void main(String args[])
{
try
{
InputStreamReader isr = new InputStreamReader (System.in);
BufferedReader br= new BufferedReader (isr);
System.out.println("MADHU SUPERMArket");
System.out.println("no 4, mainroad, villpuram");
System.out.println("-------------------");
System.out.println("bill");
System.out.println("ENTER THE SERIAL NO");
String s1 = br.readLine();
int a = Integer.parseInt(s1);
System.out.println("enter the particular:");
String s2 = br.readLine();
System.out.println("enter the rate:");
String s3 = br.readLine();
int b = Integer.parseInt(s3);
System.out.println("enter the quantity:");
String s4 = br.readLine();
int c = Integer.parseInt(s4);
System.out.println("result");
int d = b *c;
System.out.println(" total amount:"+ d);
int e= d*10/100;
System.out.println("GST:"+ e);
int  f= d+e ;
System.out.println("Grand Total :"+ f);
}
catch(Exception  e)
{
System.out.println("Error:"+ e.getMessage());
}
}
}
