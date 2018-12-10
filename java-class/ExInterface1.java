import java.text.*;
import java.util.*;

//(5)インタフェースGreetingとShowingDateの実装
public class ExInterface1 implements Greeting, ShowingDate{
    public void greet() {  //(6)メソッドgreetの本体の定義
        System.out.println("こんにちは");
    }

    public void showDate() {  //(7)メソッドshowDateの本体の定義
        SimpleDateFormat dateformatter =
        new SimpleDateFormat("yyyy/MM/dd");
        String dateString = dateformatter.format(new Date());
        System.out.println(dateString);
    }

    public static void main(String[] args) {
        ShowingDate object1 = new ExInterface1();  //(8)
        object1.greet();  //(9)
//        object1.showDate();  //(10)
    }
}
