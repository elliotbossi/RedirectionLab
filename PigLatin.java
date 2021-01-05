import java.util.*;
public class PigLatin{
  public static void main(String[] args){
  }

  public static String pigLatinSimple(String s){
    String temp = s.toLowerCase();
    String initial = temp.charAt(0);
    if ((((inital == "a")||(inital == "e")) || ((inital == "i")||(inital == "o"))) || (initial == "u")){
      return (temp + "hay");
    }
    else{
      return (temp.substring(1) + first + "ay");
    }
  }
}
