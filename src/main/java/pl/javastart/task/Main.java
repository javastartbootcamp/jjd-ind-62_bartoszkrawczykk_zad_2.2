package pl.javastart.task;

public class Main {

    public static void main(String[] args) {

            String name1 = "Mleko";
            String name2 = "Czekolada";
            String producer1 = "Mlekowita";
            String producer2 = "Wedel";
            double price1 = 2.5;
            double price2 = 2.19;

        System.out.printf("%s %s %.1fzł%n", name1, producer1, price1);
        System.out.printf("%s %s %.2fzł", name2, producer2, price2);
    }
}
