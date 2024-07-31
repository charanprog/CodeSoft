import java.util.Scanner;

public class StudentGradeCal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Hi Dear! Lest calculate your grade");
        System.out.println("Enter Number of subjects you have");
        int subjects = input.nextInt();
        int TotalMarks=0;
        int i = 1;
        if (subjects <= 7) {
            do {
                System.out.println("Enter your marks in subject" + "  " + i + " :");
                int marks = input.nextInt();
                TotalMarks += marks;
                i++;
            }
            while (i <= subjects);
             int average =TotalMarks/subjects;
            System.out.println("Here is your total marks: "+ TotalMarks);
            System.out.println("Here is your Average: "+average );
            System.out.println(grade(average));
        }
        else{
            System.out.println("Please Select 7 or less subjects ");
        }

        }

         public static int grade(int average){
            if(average>90 && average<100){
                System.out.println("You have obtained Grade:"+"A");
            }
             if(average>80 && average<90){
                 System.out.println("You have obtained Grade:"+"B");
             } if(average>70 && average<80){
                 System.out.println("You have obtained Grade:"+"C");
             } if(average>35 && average<70){
                 System.out.println("You have obtained Grade:"+"D");
             }
             if(average>0&& average<35){
                 System.out.println("Sorry you got failed");
             }
             return 1 ;
         }
}