package StringPractice;

public class WordsCount {

    public static void main(String[] args) {

        String str = "welcome to Java Selenium world";

        str = str.trim();

        if (str.isEmpty()){
            System.out.println("Number of words string is: 0");
            return;
        }

        int wordCount = 1;

        for (int i=0; i<str.length();i++){
            if (str.charAt(i) == ' ' && str.charAt(i+1) != ' '){
                wordCount++;
            }

        }
        System.out.println("Number of words in String :" +wordCount);
    }
}
