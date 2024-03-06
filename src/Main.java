import java.util.Scanner;
class Person{
    private int age;
    public String FIO;
    public String PhoneNum;

    Person(String FIO,int age,String PhoneNum){
        this.FIO= FIO;
        this.age = age;
        this.PhoneNum = PhoneNum;
    }
    public int getAge(){
        return this.age;
    }
}
class Student extends Person{
    Student(String FIO,int age,String PhoneNum,  int Course, String Facultet,int DateOfStart ){

        super(FIO, age, PhoneNum);
        this.Course = Course;
        this.Facultet = Facultet;
        this.DateOfStart = DateOfStart;
    }
    public int Course;
    public String Facultet;
    private int DateOfStart;
    public int getDateOfStart(){
        return this.DateOfStart;

    }
}
public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("Павел Юрьевич", 13, "+7976453453", 2, "Экономика", 2007);
        Student s2 = new Student("Никита Ильич", 17, "+79745333453", 3, "Химия", 2009);
        Student s3 = new Student("Валерий Иваныч", 19, "+7988978653", 4, "ИТ", 2015);
        Student[] Students = new Student[3];
        Students[0] = s1;
        Students[1] = s2;
        Students[2] = s3;
        System.out.println("Выведем всех студентов:");
        for (Student n : Students) {
            System.out.println(n.FIO);
        }
        Scanner input = new Scanner(System.in);
        System.out.println("Введите факультет:");
        String f = input.nextLine();
        System.out.println("Студенты, которые учатся на факультете " + f);
        for (Student n : Students) {
            if (n.Facultet.equals(f)) {
                System.out.println(n.FIO);
            }


        }
        System.out.println("Введите год:");
        int a = input.nextInt();
        for (Student n : Students) {
            if (a <= n.getDateOfStart()) {
                System.out.println(n.FIO);
            }


        }
    }
}