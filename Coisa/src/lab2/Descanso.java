package lab2;

public class Descanso {
    private int horasDeDescanso;
    private int numeroDeSemanas ;
    public Descanso(){
        this.horasDeDescanso=0;
        this.numeroDeSemanas=0;
    }
    public void defineHorasDescanso(int valor){
        this.horasDeDescanso = valor;
    }
    public void defineNumeroSemanas(int valor){
        this.numeroDeSemanas = valor;
    }
    public String getStatusGeral(){
        if (horasDeDescanso ==0 || numeroDeSemanas ==0){
            return "cansado";
        }
        int tempo = horasDeDescanso/numeroDeSemanas;
        if (tempo>=26){
            return "descansado";
        }
        else{
            return "cansado";
        }
    }
}

