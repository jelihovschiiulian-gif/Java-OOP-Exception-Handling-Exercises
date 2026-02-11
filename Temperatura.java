public class Temperatura {
    int temperatura;
    String optiune;

    void Converteste(int temperatura, String optiune) {
        this.temperatura = temperatura;
        this.optiune = optiune;

        if(!optiune.equals("C") || !optiune.equals("F")){
            throw new IllegalArgumentException("Trebuie sa alegi 'C' sau 'F'");
        }
        else {
            System.out.println("Gradele in celsius sunt  "+temperatura + "Iar in Farenheit sunt " + temperatura+217);
        }

    }


}
