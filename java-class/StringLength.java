public class StringLength {
  public static void main(String[] args) {
    String[] stringArray = new String[10];
    stringArray[0] = new String("Sunday"); //Stringオブジェクトの生成
    System.out.println(stringArray[0].length());

    stringArray[1] = new String("aaaWednesday"); //Stringオブジェクトの生成
    System.out.println(stringArray[1].length());
  }
}
