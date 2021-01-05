import java.util.*;
public class PigLatin{
  public static void main(String[] args){
  }

  public static String pigLatinSimple(String s){
    String temp = s.toLowerCase();
    char initial = temp.charAt(0);
    if ((((initial == 'a')||(initial == 'e')) || ((initial == 'i')||(initial == 'o'))) || (initial == 'u')){
      return (temp + "hay");
    }
    else{
      return (temp.substring(1) + initial + "ay");
    }
  }

  public static String pigLatin(String s){
    String[] d = {"bl", "br", "ch", "ck", "cl", "cr", "dr", "fl", "fr", "gh", "gl", "gr", "ng", "ph", "pl", "pr", "qu", "sc",
    "sh", "sk", "sl", "sm", "sn", "sp", "st", "sw", "th", "tr", "tw", "wh", "wr"};
    String temp = s.toLowerCase();
    char initial = temp.charAt(0);
    if ((((initial == 'a')||(initial == 'e')) || ((initial == 'i')||(initial == 'o'))) || (initial == 'u')){
      return (temp + "hay");
    }
    else if ((temp.length() > 1) && (Arrays.asList(d).contains(temp.substring(0,2)))) {
      return (temp.substring(2) + temp.substring(0, 2) + "ay");
    }
    else{
      return (temp.substring(1) + temp.substring(0, 1) + "ay");
    }
  }

  public static String pigLatinBest(String s){
    String temp = s.toLowerCase();
    char initial = temp.charAt(0);
    char finale = temp.charAt(temp.length() - 1);
    if (!(Character.isLetter(initial))) {
      return temp;
    }
    else if (!(Character.isLetter(finale))) {
      return (pigLatin(temp.substring(0, temp.length() - 1)) + finale);
    }
    else{
      return pigLatin(temp);
    }
  }

}
