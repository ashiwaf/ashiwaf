class Val {
    String abc = "クラスAのメンバ変数abc";
    void print(String str) {
        System.out.println("クラスAのメソッド"+ str);
    }
}

public class InstanceRef {
    public static void main(String[] args) {
        Val a1 = new Val();  //クラスAのインスタンスa1の生成。インスタンスの参照情報を変数a1に代入
        System.out.println(a1.abc);  //変数a1を介しメンバ変数abcを参照
        a1.print("てすてす");  //変数a1を介しメソッドxyzを参照
        a1 = null;
        System.out.println("null済");
        a1.print("てすてす２"); //ここでnullpo
    }
}
