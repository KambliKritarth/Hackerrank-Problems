public class Palindrome {
  
  public int palindrome(int n) {
    int rev = 0;
    int a = 0;
    while (n > 0) {
      a = n % 10;
      n = n / 10;
      rev = rev * 10 + a;
    }
    return rev;
  }
  public String palindrome(String s){
    String rev = "";
    while (s.length() > 0) {
      char ch = s.charAt(s.length() - 1);
      s = s.substring(0, s.length() - 1);
      rev = ch + rev;
    }
    System.out.println(rev);
    return rev;
  }
  public static void main(String[] args) {
    Palindrome pal = new Palindrome();
    System.out.println(pal.palindrome(121) == 121);
    String str  = "MADAM";
    System.out.println(str.equals(pal.palindrome("MADAM")));
  }
}
