public class StringpracticeMain{
    public static void main(String[] args) {
     Stringpractice p = new Stringpractice();
     String a = p.createusername("Lucas", "Quan");
     System.out.println(a);
     Stringpractice d = new Stringpractice();
     String b = d.undoLatin("atcay");
     System.out.println(b);
     Stringpractice e = new Stringpractice();
     String c = e.textify("l3t", "3", "e");
     System.out.println(c);
    }
}