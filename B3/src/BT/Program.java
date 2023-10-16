package BT;

public class Program {
    public static void main(String[] args) {
         Department department1 = new Department();
         department1.id = 1;
         department1.name = "English";
         
         Department department2 = new Department();
         department1.id = 2;
         department1.name = "IT";
         
         Department department3 = new Department();
         department1.id = 3;
         department1.name = "Dohoa";
         
         Department department4 = new Department();
         department1.id = 4;
         department1.name = "English"; 
         
         /////////
         
         Position mentorPosition = new Position();
         mentorPosition.id = 1;
         mentorPosition.name = "Mentor";

         Position studentPosition = new Position();
         studentPosition.id = 2;
         studentPosition.name = "Student";
         /////////
         
         Account account1 = new Account();
         account1.id = 1;
         account1.email = "mentor1@example.com";
         account1.userName = "mentor1";
         account1.gender = Gender.FEMALE;
         account1.departmentid = department1;
         account1.positionid = mentorPosition ; 
         
         Account account2 = new Account();
         account2.id = 2;
         account2.email = "student1@example.com";
         account2.userName = "student2";
         account2.gender = Gender.FEMALE;
         account2.departmentid = department2;
         account2.positionid = studentPosition; 
         
         Account account3 = new Account();
         account2.id = 2;
         account2.email = "student1@example.com";
         account2.userName = "student3";
         account2.gender = Gender.FEMALE;
         account2.departmentid = department3;
         account2.positionid = studentPosition;
         
         /////
         Account[] IT1 = {account1 , account2, account3 };
         Account[] IT2 = { account1,account3};
         ////
         Clazz clazz1 = new Clazz();
         clazz1.id = 1;
         clazz1.name = "IT1";
         clazz1.study = IT1; 

         Clazz clazz2 = new Clazz();
         clazz2.id = 2;
         clazz2.name = "IT2";
         clazz2.study = IT2;
         
         //////
         
         System.out.println("Danh sách các tài khoản trong Clazz " + clazz1.name + ":");
         for (Account account : clazz1.study) {
             System.out.println("AccountID: " + account.id + ", UserName: " + account.userName);
         }
         
         
     
    }
}

