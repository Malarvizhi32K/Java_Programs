                                                 ***Anagram Program***

import java.util.Scanner;
import java.util.Arrays;
public class Anagram{
    public static void main(String args[]){
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter a string s1:");
      String s1=sc.nextLine();
      System.out.println("Enter a string s2:");
      String s2=sc.nextLine();
      s1=s1.toLowerCase();
      s2=s2.toLowerCase();
      if(s1.length() == s2.length()){
         char c1[]=s1.toCharArray();
         char c2[]=s2.toCharArray();
         Arrays.sort(c1);
         Arrays.sort(c2);
         boolean result=Arrays.equals(c1,c2);
         if(result){
             System.out.println("Anagrams");
         }
         else{
            System.out.println("Not Anagrams"); 
         }
      }
    }
}
