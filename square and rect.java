import java.io.*;
 class SquareAndRect
 {
 public static void main(String args[])throws IOException
 {
 InputStreamReader isr=new InputStreamReader(System.in);
 BufferedReader br= new BufferedReader(isr);
 System.out.println("SQUARE & RECTANGLE");
 System.out.println("------------------");
 System.out.println("ENTER THE A VALUE:");
 String s1= br.readLine();
 int a = Integer.parseInt(s1);
 System.out.println("enter the l value:");
 String s2= br.readLine();
 int l = Integer.parseInt(s2);
 System.out.println("enter the B value:");
 String s3= br.readLine();
 int b = Integer.parseInt(s3);
 System.out.println("RESULT:");
 int x=a * a;
 System.out.println("Area of square:"+x);
 x=4 * a;
 System.out.println("Area of Perimeter of rect:"+x);
 x=l * b;
 System.out.println("Area of Reactangle:"+x);
 x=2*(l + b);
 System.out.println("Perimeter of Rectangle:"+x);
 }
 }