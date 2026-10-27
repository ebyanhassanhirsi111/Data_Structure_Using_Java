package University_Exam_Registration_System;

import java.util.Scanner;

public class University {
   public static void main() {
        Scanner input= new Scanner(System.in);
        System.out.println("==== Exam Registration System ======");
        try{
            System.out.println("Enter your ID:");
            String StudentID= input.next();
            System.out.println("Enter your name:");
            String name= input.next();
            System.out.println("Enter age:");
            int age= input.nextInt();
            System.out.println("Enter exam mark:");
            double ExaminationMark= input.nextDouble();
            System.out.print("Enter Number of Subjects: ");
            int NumberOfSubjects = input.nextInt();
            ExamRegistration student = new ExamRegistration(StudentID, name, age, ExaminationMark, NumberOfSubjects);
            student.check();
            System.out.println("Registration Successful!");
            System.out.println("student ID: "+ StudentID);
            System.out.println("Student: " + name);
            System.out.println("student marks:"+ ExaminationMark);
            System.out.println("Subjects:: " + NumberOfSubjects);

        } catch (invalidRegistrationException e) {
            System.out.println("Registration Failed!");
            System.out.println("Error: " + e.getMessage());

        } catch (NumberFormatException e) {
            System.out.println("Error: Enter valid numbers.");

        } finally {
            System.out.println("Registration successfully.");
        }
    }

}


class invalidRegistrationException extends Exception{
    public invalidRegistrationException(String message){
        super(message);
    }
}
class ExamRegistration{
    Scanner input= new Scanner(System.in);
    String StudentID;
    String name;
    int age;
    double ExaminationMark;
    int NumberOfSubjects;

   ExamRegistration(String StudentID, String name, int age,double ExaminationMark,
                    int NumberOfSubjects){
       this.StudentID=StudentID;
       this.name=name;
       this.ExaminationMark=ExaminationMark;
       this.NumberOfSubjects=NumberOfSubjects;
   }
   public void check() throws invalidRegistrationException{
       if(age >= 18){
           throw new invalidRegistrationException("age must be at least 18.");
       }
       else if(ExaminationMark < 0 || ExaminationMark > 100){
           throw new invalidRegistrationException("examination marks must be between 0 to 100.");
       }
       else if(NumberOfSubjects < 1 || NumberOfSubjects > 5){
           throw new invalidRegistrationException("number of subject 1 to 5.");
       }
       else if(StudentID == null){
           throw new invalidRegistrationException("student id can not be empty.");
       }
       else{
           throw new invalidRegistrationException("login is successfully.");
       }
   }
}