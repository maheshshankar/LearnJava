public class SBBuilder {
    public static void main(String[] args) {
        StringBuffer x = new StringBuffer("test");
        StringBuilder y = new StringBuilder("test");
        x.append(" hello");
        System.out.println(x);
    }
}
