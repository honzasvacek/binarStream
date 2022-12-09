import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class WriteToFile {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        //soubor pro ukládání lidí
        File file = new File("data.dat");

        //pole lidí
        ArrayList<Clovek> arr;

        //nacteni lidi do arraylistu
        if (file.exists()) {
            FileInputStream in = new FileInputStream(file);
            ObjectInputStream obIn = new ObjectInputStream(in);
            arr = (ArrayList<Clovek>)obIn.readObject();
        } else {
            arr = new ArrayList<Clovek>();
        }


        //vytvoření člověka ze vstupu z klávesnice
        Scanner sc = new Scanner(System.in);
        Clovek c = new Clovek(sc);
        arr.add(c);

        //deklaruju zapis dat do souboru
        FileOutputStream out = new FileOutputStream(file);
        ObjectOutputStream obOut = new ObjectOutputStream(out);

        //zapisu pole lidí do souboru
        obOut.writeObject(arr);

        out.close();
    }
}