import java.io.*;
public class Ltd
{
public static void main (String args[])
{
try
{
DataInputStream dis = new DataInputStream (System.in);
System.out.println("SAJITHADEVI INTERNATIONAL [P] LTD.");
System.out.println("ONGUR , TINDIVAM, VILLPURAM");
System.out.println("_______________________________");
System.out.println("SALARY BILL RECEPT");
System.out.println("-------------------------------");
System.out.println("ENTER THE EMPLOYEE ID");
String s1 = dis.readLine();
int a= Integer.parseInt(s1);
System.out.println("ENTER THE EMPLOYEE NAME");
String s2 = dis.readLine();
System.out.println("ENTER THE SALARY");
String s3 = dis.readLine();
int b= Integer.parseInt(s3);
System.out.println("INCOME");
int bonus = b*20/100;
System.out.println("BONUS (20% from salary):" +bonus);
int income = b*10/100;
System.out.println("INCOME (10% from salary):" +income);
int increment = b*5/100;
System.out.println("INCREMENT (5% from salary):" +increment);
int grandtotal= bonus + income + increment;
System.out.println("GRAND TOTAL:"+ grandtotal);
System.out.println("EXPENDITURE");
int Lic = b*2/100;
System.out.println("LIC (2% from salary):"+ Lic);
int hral = b*3/100;
System.out.println("HRAL (3% from salary):"+ hral);
int nettotal = grandtotal - Lic - hral;
System.out.println("NET TOTAL:"+ nettotal);
}
catch (Exception e)
{
System.out.println("error:"+e.getMessage());
}

}
}








 
