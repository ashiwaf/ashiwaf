public class DoWhile {
    public static void main(String[] args) {
        int lot = 1;   //(1)
        switch (lot) {   //(2)
            //(3)該当するcase値の文を実行
            case 1: System.out.println("車が当選!"); break;
            case 2: System.out.println("旅行が当選!"); break;
            case 3: System.out.println("冷蔵庫が当選!"); break;
            case 4: System.out.println("ビデオが当選!"); break;
            default: System.out.println("はずれです。"); break;
        }
    }
}
