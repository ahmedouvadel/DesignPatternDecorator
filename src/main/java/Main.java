import voiture.option.Gps;
import voiture.option.ToitOuvrant;
import voiture.voiture.Corsa;
import voiture.voiture.Voiture;

public class Main {
    public static void main(String[] args) {
        Voiture c1 = new Corsa("Corsa", 25000, 500);
        System.out.println(c1);

        c1 = new Gps(c1);
        System.out.println(c1);

    }
}
