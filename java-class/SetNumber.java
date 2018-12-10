public class SetNumber {
    private int basicNum;
    private int specialNum;
    //int型の引数を持つコンストラクタ
    SetNumber (int spn) {
        this.basicNum = 100;
        this.specialNum = spn;
    }
    //引数を持たないコンストラクタ
    SetNumber () {
        this(200);
    }
    public static void main(String[] args) {
        SetNumber insA = new SetNumber();
        System.out.println(insA.basicNum);
        System.out.println(insA.specialNum);

    }
}
