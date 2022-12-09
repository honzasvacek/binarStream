import java.io.Serializable;
import java.util.Scanner;

public class Clovek implements Serializable {
    String krestniJmeno;
    int vaha;

    public Clovek(String krestniJmenp, int vaha) {
        this.krestniJmeno = krestniJmenp;
        this.vaha = vaha;
    }

    @Override
    public String toString() {
        return "Clovek{" +
                "krestniJmeno='" + krestniJmeno + '\'' +
                ", vaha=" + vaha +
                '}';
    }

    //konstruktor ktery vvytvori cloveka ze vstupu z klavesnice
    public Clovek(Scanner sc) {
        krestniJmeno = sc.next();
        vaha = sc.nextInt();
    }
}
