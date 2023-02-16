package podstawy;

public class StringiDemo {
    public static void main(String[] args) {

        String name = "Franciszek";

        int dlugosc = name.length();

        char inicjal = name.charAt(4);

        String male, duze;

        name = name.toLowerCase();
        duze = name.toUpperCase();

        System.out.println(name);

    }
}
