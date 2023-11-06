package entity;

public class Student {
    private static int latestStudentId = 0;
    private int masv;
    private String namesv;
    private static String trungtam = "ITPLUS";

    public Student(String namesv) {
        this.masv = ++latestStudentId;
        this.namesv = namesv;
    }

    public static void main(String[] args) {
        Student std1 = new Student("Minh");
        Student std2 = new Student("Minh");
        Student std3 = new Student("tai");
        Student std4 = new Student("truong");
        ///////////////////////////
        
        System.out.println("Student ID of std1: " + std1.masv);
        System.out.println("Student ID of std2: " + std2.masv);
        System.out.println("Student ID of std3: " + std3.masv);
        System.out.println("Student ID of std4: " + std4.masv);
    }
}
