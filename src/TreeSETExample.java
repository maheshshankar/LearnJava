import java.util.LinkedHashSet;
import java.util.TreeSet;

public class TreeSETExample {
    public static void main(String[] args) {
        TreeSet x = new TreeSet();
        Student s1 = new Student(5);
        Student s2 = new Student(2);
        Student s3 = new Student(4);
        Student s4 = new Student(1);
        x.add(s1);
        x.add(s2);
        x.add(s3);
        x.add(s4);
        System.out.println(x);
    }
}
