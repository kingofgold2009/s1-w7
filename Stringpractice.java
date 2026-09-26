public class Stringpractice{

    public String createusername(String first, String last){
        String a = last.substring(0,3);
        int b = first.length();
        String c = first.substring(first.length()/2);
        String d = first.substring(0, first.length()/2); //first code if the last name is 3 or less letters
        String e = last;

        if (last.length() >= 3){
            return a + b + c + d; 
        } 
        return e + b + c + d;
       
    }
    public String undoLatin(String word){
        if(word.length() < 2){
            return word.substring(0,2);
        }
        return word.substring(2,3) + word.substring(0,2);
    }
        
    public String textify (String word, String targetLetter, String replacementCharacter){
    int a = word.indexOf(targetLetter);
return word.substring(0, a) +  replacementCharacter + word.substring(a+1);
    }
}