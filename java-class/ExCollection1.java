import java.util.*;

public class ExCollection1 {
    public static void main(String[] args) {
        Set hs1 = new HashSet();  //(1)
        Set ts1 = new TreeSet();  //(2)

        //(3)要素の追加
        for (int i = 0; i < args.length; i++) {
            hs1.add(args[i]);
        }

        //(4)要素の追加
        for (int i = 0; i < args.length; i++) {
            ts1.add(args[i]);
        }

        System.out.println(hs1);  //(5)
        System.out.println(ts1);  //(6)
    }
}
