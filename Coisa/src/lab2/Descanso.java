package lab2;

public class Descanso {
    // ta faltando um construtor Descanso()
    // geralmente a gente inicializa as var e dentro do construtor associa um valor inicial a elas
    // assim:
    // Descanso(...) {
    //  this.horasDescanso = 0;
    //  this.numerosDeSemanas = 0;
    // }
    private int horasDeDescanso;
    private int numeroDeSemanas;

    public Descanso(){
        this.horasDeDescanso = 0;
        this.numeroDeSemanas = 0;
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

