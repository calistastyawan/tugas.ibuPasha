import java.util.Scanner;

public class percobaan {
     public static void main(String[] args) {
               Scanner in = new Scanner(System.in);
               System.out.println("Pilih 1. teacher atau 2. student");
               int pilihan = in.nextInt();
               in.nextLine();
               if(pilihan == 1) {
                   System.out.println("name");
                   String name;
                   System.out.println("subject");
                   String subject;
                   System.out.println("age");
                   int age;
                   System.out.println("Part Time");
                   int partTime;
       
                   teacher teacher1 = new teacher(subject,name,age,partTime);
                   teacher1.print();
       
               }else if (pilihan ==2) {
                   System.out.println("name");
                   String name;
                   System.out.println("major");
                   String major;
                   System.out.println("age");
                   int age;
                   System.out.println("studentNumber");
                   int studentNumber;
                   System.out.println("score");
                   int score;
                   student student1 = new student(name,age,major,score,studentNumber);
                   student1.print();
                }else {
                   System.out.println("Input salah");
         }
      }
       
     }
} 

