package lab2;

public class Descanso {
    private int horasDeDescanso= 0;
    private int numeroDeSemanas = 0;

    public void defineHorasDescanso(int valor){
        this.horasDeDescanso = valor;
    }
    public void defineNumeroSemanas(int valor){
        this.numeroDeSemanas = valor;
    }
    public String getStatusGeral(){
        if (horasDeDescanso ==0 || numeroDeSemanas ==0){
            return "Cansado";
        }
        int tempo = horasDeDescanso/numeroDeSemanas;
        if (tempo>=26){
            return "Descansado";
        }
        else{
            return "Cansado";
        }
    }
}

