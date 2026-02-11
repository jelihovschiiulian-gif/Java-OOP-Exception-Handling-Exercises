public class Parcare {
    private int numarulLoc;
    private int locuriOcupate = 20;

     void ocupaLoc(int numarulLoc) {
        this.numarulLoc = numarulLoc;
        if (numarulLoc >= 1 && numarulLoc <= 20) {
            throw new IllegalStateException("Locul pe care doresti sa te asezi este ocupat!");
        }
    }

     void elibereazaLoc(int lcouriOcupate) {
        if (lcouriOcupate == 0) {
            throw new IllegalStateException("Locurile deja sunt goale !,");
        }
        else {
            System.out.println("Te poti aseza pe locul dorit !");
        }

    }


}