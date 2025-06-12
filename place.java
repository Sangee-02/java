import java.io.*;
class place
{
void technical()
{
System.out.println("Technical programs");
}
void communication()
{
System.out.println("communication training");
}
}


class MCA_2024 extends place
{
void java()
{
System.out.println("java app development");
}
void set()
{
System.out.println("software engineering");
}
void os()
{
System.out.println("operating system");
}

}

class sample
{
public static void main(String args[])
{
MCA_2024 mca=new MCA_2024();
mca.technical();
mca.communication();
mca.java();
mca.set();
mca.os();
}
}