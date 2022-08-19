import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        int i = rand.nextInt(1, 11);
        int b = rand.nextInt(1, 11);
        int c = rand.nextInt(1, 11);
        System.out.println("i=" + i + "\n" + "b=" + b + "\n" + "c=" + c);

    }
}




