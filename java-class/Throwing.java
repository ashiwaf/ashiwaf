class Throwing{
  public static void main (String[] args) {
    Throwing Ex8 = new Throwing();
    Ex8.methodA();
    try {
      Ex8.optionThrowingException();
    } catch(IllegalArgumentException e) {
      System.out.println(e.getMessage());
      System.out.println("catchによる出力です");

    }

    }

  void methodA() {
    try {
      methodB();  //(1)
    } catch(ArithmeticException e){
      System.out.println(e.getMessage());
    } finally {
      System.out.println("This program was finished");  //(3)
    }
  }

  void methodB() throws ArithmeticException {  //(2)
    System.out.println("答えは" + (100/0));
  }

  void optionThrowingException() {
    throw new IllegalArgumentException("例外のテスト");
  }
}
