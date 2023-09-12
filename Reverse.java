                                            *** Reverse a Number ***

import java.util.Scanner;
public class  Main
{
public static void main(String args[])
{
int n,i,r,sum=0;
Scanner sc=new Scanner(System.in);
System.out.println("Enter a number:");
n=sc.nextInt();
while(n > 0){
r=n%10;
sum=(sum*10) +r;
n=n/10;
}
System.out.println("The Reversed Number is:"+sum);
}
}																
