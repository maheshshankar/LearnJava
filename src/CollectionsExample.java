import java.io.*;
import java.util.*;


public class CollectionsExample {
    public static void main(String args[]) throws Exception {
        ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream(new File("/home/sa58vt/Documents/test.txt")));
        SerializeClass x = new SerializeClass();
        x.setX(10);
        x.setY(20);
        x.data = new Test();
        os.writeObject(x);
        os.close();

        ObjectInputStream ois;
        ois = new ObjectInputStream(new FileInputStream(new File("/home/sa58vt/Documents/test.txt")));
        SerializeClass sc = (SerializeClass)ois.readObject();
        System.out.println(sc.getX());
        System.out.println(sc.getY());
    }

    @Override
    public String toString() {
        return "Hello World";
    }
}

class Test {

}
class SerializeClass implements Serializable {
    private int x;
    public transient Test data;
    transient private int y;
    public void setX(int x) {
        this.x = x;
    }
    public int getX() {
        return this.x;
    }
    public void setY(int y) {
        this.y = y;
    }
    public int getY() {
        return this.y;
    }
}