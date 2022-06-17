import java.util.*;

public class FirstJavaClass {
  public static void main(String args[]) {
    Scanner scn = new Scanner(System.in);

    String x="Hello";

    String y="Hello";



    System.out.println(x+y);
      try {
        int a = scn.nextInt();
        int b = scn.nextInt();
        System.out.println(a + b);
      } catch (Exception e) {
        System.out.println(e.toString());
      }
    }
  }
