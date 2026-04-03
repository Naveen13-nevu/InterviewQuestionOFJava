
public class CountVowelAndConsonants {
    
    public static void main(String[] args) {
        
        String str = "NaveEn";

        int vowel = 0;
        int consonants = 0;

        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);

            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
               ch =='A'|| ch =='E' || ch=='I' || ch=='O' || ch =='U')
             {
                vowel++;
            }
            else{
                consonants++;
            }
        }
        System.out.println("Total no vowel : "+ vowel);
        System.out.println("Total no consonants : "+ consonants);

    }
}
