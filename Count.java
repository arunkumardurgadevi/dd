import java.io.*;
public class Count
{
public static void main(String args[])
{
int count=0,num=548;
while(num!=0)
{
num=num/10;
++count;
}
System.out.println(count);
}
}
