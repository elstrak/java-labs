// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.

public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        System.out.println("AP 2004. Problem 2 (a,b,c) Solution:");
        Kennel kennel = new Kennel();
        kennel.add(new Cat("Tom"));
        kennel.add(new Dog("Rex"));
        kennel.add(new LoudDog("T-Rex"));
        kennel.allSpeak();
    }
}