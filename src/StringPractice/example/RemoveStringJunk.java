package StringPractice.example;

public class RemoveStringJunk {
    public static void main(String[] args) {

        String s = "w@#e%*l$----come";

        // [^a-zA-Z0-9]
      s = s.replaceAll("[^a-zA-Z0-9]","");
        System.out.println(s); // welcome
    }
}
