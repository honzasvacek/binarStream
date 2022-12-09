import java.io.*;
import java.util.ArrayList;

public class ReadFromFile {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        File file = new File("data.dat");

        //deklaruju cteni ze souboru
        FileInputStream in = new FileInputStream(file);
        ObjectInputStream obIn = new ObjectInputStream(in);

        //vytvorim promenou typu object, ktera ulozi objekt  souboru a pak ho vypisu
        /*Object o = obIn.readObject();
        Clovek c = (Clovek)o;*/

        //Clovek c = (arr.)obIn.readObject(); //zkrácený zápis toho nahore

        ArrayList<Clovek> arr = (ArrayList<Clovek>)obIn.readObject();
        System.out.println(arr);

        in.close();
    }
}
