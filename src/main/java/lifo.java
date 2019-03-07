import java.util.Stack;

public class lifo {
    public static void main(String[] args) {

        Stack<String> vlozit = new Stack<>();

        vlozit.push("Ekonomia");
        vlozit.push("Ekonometria");
        vlozit.push("Operak");

        System.out.println("Predmety => " + vlozit);
        System.out.println();

             String vratit = vlozit.pop();
        System.out.println("Posledne=> " + vratit);
        System.out.println("Vypis bez posledneho => " + vlozit);

        vratit = vlozit.pop();
        System.out.println("Dalsi => " + vratit);
        System.out.println("Vypis bez dalsieho => " + vlozit);

    }
}



