import java.util.*;

class Employee {
    private int age;
    private boolean manager;
    public Employee(int age) {
        this.age = age;
    }
    public void setAge(int age) {
        this.age =age;
    }
    public int getAge() {
        return this.age;
    }
    public void hello() throws RuntimeException{

    }
}

class Manager extends Employee {
    private int experience;

    public Manager() {
        this(30);
    }
    public Manager(int experience) {
        super(10);
        this.experience = experience;
    }
    public void setExperience(int exp) {
        this.experience = exp;
    }
    public int getExperience() {
        return this.experience;
    }

//    @Override
//    public void hello() throws Exception {
//    }
}
public class Encapsulation {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter Number of Inputs");
        int x = sc.nextInt();
        System.out.println("Please Enter "+x+" Values");
        Manager m1 = new Manager();
        increaseAge(m1.getAge());
        increaseAge(m1);
        System.out.println(m1.getAge());
    }

    public static void increaseAge(Manager m1) {
        m1.setAge(m1.getAge()+60);
    }

    public static void increaseAge(int x) {
        x=x+60;
    }
}
