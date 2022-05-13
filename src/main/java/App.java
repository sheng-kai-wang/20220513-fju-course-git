/**
 * for compile pass.
 */
public class App {

  /**
   * for compile pass.
   *
   * @param args for compile pass.
   */
  public static void main(String[] args) {
    System.out.println("Hello world");

    GradeConverter converter = new GradeConverter();
    for (int i = -1; i < 102; i++) {
      System.out.println(i + ": " + converter.convert(i));
    }
  }
}
