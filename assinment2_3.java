
package assinment2.pkg1;
import java.lang.reflect.Array;
import java.util.*;
import java.util.Arrays;
class Business3
   {
    Scanner sc = new Scanner(System.in);
    String[] dateArray=new String[3];
    String newdate;
    String[] anagramInputsets={"listen", "silent", "part", "leloh", "trap", "tensil", "hi", "prat","hello"};
    public void printAnagram()
    {
      boolean status=false;
      String loopstr2="";
      String SearchedWord=""; 
      System.out.println("Input words set:{listen,silent,part,leloh,trap,tensil,hi,prat,hello}");
      System.out.print("Found all Anagram sets are:");
     for (int i=0;i<anagramInputsets.length;i++)
     {
       loopstr2=""; 
      //System.out.println(SearchedWord);
       if(SearchedWord.contains(anagramInputsets[i])==false )
       {
       for(int j=i;j<anagramInputsets.length;j++)
        {
         if (anagramInputsets[i].length()==anagramInputsets[j].length() )
         {
          if(anagramInputsets[i]!=anagramInputsets[j])
            {
           char[] arr1=anagramInputsets[i].toCharArray();
           char[] arr2=anagramInputsets[j].toCharArray();
           Arrays.sort(arr1);
           Arrays.sort(arr2);
           status=Arrays.equals(arr1,arr2);
          if(status==true)
           {
             if(loopstr2=="")
               loopstr2=anagramInputsets[i]+","+anagramInputsets[j];
             else
               loopstr2=loopstr2+","+anagramInputsets[j];
           } 
             SearchedWord=SearchedWord+"-"+loopstr2;
            }
         }
         
        }
       }  
            if(loopstr2!="")          
            System.out.print("{"+loopstr2+"}");
        }
      
    }
    
  }

public class assinment2_3
{
    public static void main(String[] args)
     {
         Business3 b3=new Business3();
         System.out.println("========Enter Your Choice:===============");
         System.out.println("Enter 1 Finds all anagram sets:");
//         System.out.println("Enter 2 for Date formate:");
//         System.out.println("Enter 3 for Array aspected result:");

         //int  choice= sc.nextInt();
         //if(choice==1) 
         b3.printAnagram();
         //if(choice==2) b2.PrintDateFormat();
         //if(choice==3)b2.PrintOPfrominputArray();
         System.out.println();
     }
}
