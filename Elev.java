public class Elev {
    private String nume;
    private String prenume;
    int notanoua;

    public void setnota(int notanoua) {
        this.notanoua = notanoua;

        if(notanoua<=0|| notanoua>10){
            throw  new IllegalArgumentException("Nota trebuie sa fi intre 1 si 10");
        }
    }

    public int getnota(){
        return notanoua;
    }



}
