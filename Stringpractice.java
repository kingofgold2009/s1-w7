public class Stringpractice{

    public String createusername(String first, String last){
        String a = last.substring(0);
        int b = first.length();
        String c = first.substring(first.length()/2);
        String d = first.substring(0, first.length()/2); //first code if the last name is 3 or less letters
        String e = last.substring(0,3);

        if (last.length() <= 3){
            return a + b + c + d; 
        } 
        return e + b + c + d;
       
    }
    
}