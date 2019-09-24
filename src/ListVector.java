import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class ListVector {
    public static void main(String[] args) throws Exception {
        ArrayList<Integer> data =new ArrayList<>();
        List<Integer> data1 = (List<Integer>)Collections.synchronizedList(data);
        Thread t1= new Thread(()->{
            for(int i=0;i<100;i++) {
                data1.add(i);
            }
        });
        Thread t2= new Thread(()->{
            for(int i=0;i<100;i++) {
                data1.add(i);
            }
        });
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println("Completed");
    }
}
