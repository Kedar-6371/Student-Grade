import java.util.*;
public class StudentGradeCalculator
{
    int numsub,totalMarks,marks;
    double averagePercentage;
    char grade;
    Scanner sc=new Scanner(System.in);
    void input(){
        System.out.println("enter the number of subject:");
        numsub=sc.nextInt();
        totalMarks=0;
        for(int i=1;i<=numsub;i++)
        {
            System.out.println("enter marks obtained in subject"+ i +" : ");
            marks=sc.nextInt();
            totalMarks+=marks;
        }
    }
    void cal()
    {
        averagePercentage=(double) totalMarks/numsub;
        if(averagePercentage >= 90){
            grade ='O';
        }
        else if(averagePercentage >= 80){
            grade ='A';
        }
        else if(averagePercentage >= 70){
            grade ='B';
        }
        else if(averagePercentage >= 60){
            grade ='C';
        }
        else if(averagePercentage >= 50){
            grade ='D';
        }
        else{
            grade ='F';
        }
    }
    void display(){
      System.out.println("the total marks obtained in all subject= "+totalMarks);  
      System.out.println("average percentage of all subject= "+averagePercentage);
      System.out.println("grade of student is: "+grade);
      sc.close();
    }
    public static void main(String[] args) {
        StudentGradeCalculator ob=new StudentGradeCalculator();
        ob.input();
        ob.cal();
        ob.display();
    }
}