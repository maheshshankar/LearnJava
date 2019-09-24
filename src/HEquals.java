import java.util.*;

class Student implements Comparable {
    private int id;
    Student(int id) {
        this.id = id;
    }
    public int getId() {
        return this.id;
    }
    public void setId(int id) {
        this.id =id;
    }

    @Override
    public int hashCode() {
        return this.id;
    }

    @Override
    public boolean equals(Object o) {
        if(o==null || !(o instanceof Student)) {
            return false;
        } else {
            Student x = (Student) o;
            return x.getId()==this.getId();
        }
    }

    @Override
    public int compareTo(Object o) {
        if(o==null || !(o instanceof Student)) {
            return 0;
        } else {
            Student x = (Student) o;
            Integer a=x.getId();
            Integer b=this.getId();
            return b.compareTo(a);
        }
    }

    @Override
    public String toString() {
        return ""+this.id;
    }
}
public class HEquals {
    public static void main(String[] args) {
        LinkedHashSet x = new LinkedHashSet();
        Student s1 = new Student(5);
        Student s2 = new Student(2);
        Student s3 = new Student(4);
        Student s4 = new Student(1);
        x.add(s1);
        x.add(s2);
        x.add(s3);
        x.add(s4);
//      x.clear();
//        x.add(5);
//        x.add(2);
//        x.add(1);
//        x.add(3);
        System.out.println(x);
    }
}
