import java.util.InputMismatchException;
import java.util.Scanner;
public class Prob1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Elev elev = new Elev();

        elev.setnota(2);
        System.out.println("Nota elevului care respecta cerintele este "+elev.getnota());

        Parcare loc = new Parcare();
        loc.ocupaLoc(0);
        loc.elibereazaLoc(5);

        Temperatura temperatura = new Temperatura();


        scanner.close();
    }
}
