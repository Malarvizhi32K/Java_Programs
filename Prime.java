                                 ***Prime Number***

import java.util.Scanner;
public class Prime{
public static void main(String args[]){
int n,i,count=0;
Scanner sc=new Scanner(System.in);
System.out.println("Enter a number:");
n=sc.nextInt();
for(i=2;i<n;i++){
if(n%i==0) {
count++;
break;
}
}
if(count==0){
System.out.println("Prime number");
}
else{
System.out.println("Not a Prime number");
}
}
}
