import java.util.*;

public class List {
    public static void main(String[] args) {
        long start, stop;
        ArrayList<Long> as1 = new ArrayList<Long>();  //(1)
        LinkedList<Long> ls1 = new LinkedList<Long>();  //(2)

        //(3)要素の追加
        for (long i = 0; i < 100000000; i++) {
            as1.add(i);
        }

        //(4)要素の追加
        for (long i = 0; i < 10000; i++) {
            ls1.add(i);
        }

        start = System.currentTimeMillis();
        for (long i= 0; i < 100000000;i++){
          //System.out.println(as1.get(i));  //(5)
          as1.get(i);
        }
        stop = System.currentTimeMillis();
        System.out.println("ArrayListの検索処理---" + (stop-start));
        //System.out.println("---------------------------");
        //for (int i= 0; i < 10000;i++){
        //
        //  System.out.println(ls1.get(i));  //(6)
        //}
    }
}
