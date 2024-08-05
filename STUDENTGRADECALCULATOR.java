import java.util.*;
class STUDENTGRADECALCULATOR
{
public static void main(String args[])
   {
float sub1,sub2,sub3,sub4,avg,total,sum;
     Scanner S=new Scanner(System.in);
    System.out.println("Enter The Marks Of 4 Subjects which is obtained from 100");   //Here I am Taking 4 Subjects Marks
    System.out.print("Marks Of English : ");
sub1=S.nextFloat();
    System.out.print("Marks Of Hindi : ");
sub2=S.nextFloat();
    System.out.print("Marks Of Marathi : ");
sub3=S.nextFloat();
    System.out.print("Marks Of History : ");
 sub4=S.nextFloat();
  sum=sub1+sub2+sub3+sub4;
   System.out.println("\nAddition Of All Subjects is "+sum);
   avg=sum/4;
    System.out.println("\nAverage of All Subjects is " +avg);
     
    if(avg>50 && avg<60)
{
   System.out.println("\nGrade B");

}
 else if(avg>60 && avg<70)
{

System.out.println("\nGrade B+");
}

else if(avg>70 && avg<80)
{
System.out.println("\nGrade A");

}

else if(avg>80 && avg<90)
{
  System.out.println("\nGrade A++");
}

else if(avg>90)
{
System.out.println("\nGrade O");
 }

else
{
   System.out.println("\nFail");
}
  System.out.println("\n*****************************************************************************************************"); 
 System.out.println("\nThe Total Marks is " +sum); 
System.out.println("\n*****************************************************************************************************"); 
 System.out.println("\nAvegage Of Total Marks is " +avg);  
System.out.println("\n*****************************************************************************************************"); 

  
   }




}