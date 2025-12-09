public class skaitamA {
    public static void main(String[] args) {
        String text = "Kad skolēni sabojā git projektu: \"Nu ko… laiks jaunam klonam.\"";

        int count = 0;
        char target = 'a';

        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == target) {
                count++;
            }
        }

        System.out.println("Burtu 'a' skaits tekstā: " + count);
    }
}
