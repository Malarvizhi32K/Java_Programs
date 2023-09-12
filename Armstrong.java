                                                   // *** Armstrong number ***

import java.util.Scanner;
public class Main
{
public static void main(String args[])
{
int n,i,temp,sum=0,r;
Scanner sc=new Scanner(System.in);
System.out.println("Enter a number:");
n=sc.nextInt();
temp=n;
while(n>0){
r=n%10;
sum=sum+(r*r*r);
n=n/10;
}
if(temp==sum){
System.out.println("Armstrong Number");
}
else{
System.out.println("Not an Armstrong Number");
}
}
}