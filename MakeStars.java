import java.util.*;
public class MakeStars{
  public static void main(String[] args) {
    int length = 0;
    int i = 0;
    Scanner scan = new Scanner(System.in);
      while (scan.hasNextLine()){
        Scanner scan1 = new Scanner(scan.nextLine());
        while (scan1.hasNext()){
          Scanner scan2 = new Scanner(scan1.next());
          while (scan2.hasNext()){
            i = 0;
            length = scan2.next().length();
            while (i < length){
              System.out.print("*");
              i += 1;
            }
          }
          if (scan1.hasNext()){
            System.out.print(" ");
          }
        }
        if (scan.hasNext()){
          System.out.println();
        }
      }
      System.out.println();
  }
}
