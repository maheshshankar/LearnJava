import java.util.TreeMap;
import java.util.TreeSet;

public class TreeMAPExample {
    public static void main(String[] args) {
        TreeMap x = new TreeMap();
        Student s1 = new Student(5);
        Student s2 = new Student(1);
        Student s3 = new Student(4);
        Student s4 = new Student(1);
        x.put(s1,"5");
        x.put(s2,"1");
        x.put(s3,"4");
        x.put(s4,"1");
        System.out.println(x);
    }
}
