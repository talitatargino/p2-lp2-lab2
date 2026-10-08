package lab2;
import java.util.Arrays;
public class Disciplina {
    private String nomeDisciplina;
    private double[] notas;
    private int horas;
    public Disciplina (String nomeDisciplina){
        this.nomeDisciplina = nomeDisciplina;
        this.notas = new double[4];
    }
    public void cadastraHoras (int hora){
        this.horas = hora;
    }
    public void cadastraNota (int nota, double valorNota){
        notas[nota-1]= valorNota;
    }
    public boolean aprovado(){
        double media = (notas[0]+notas[1]+notas[2]+notas[3])/4;
        if (media>=7.0){
            return true;
        }
        else {
            return false;
        }
    }
    @Override
    public String toString(){
        return nomeDisciplina + " " + horas + " " + (notas[0]+notas[1]+notas[2]+notas[3])/4 + " " + Arrays.toString(notas);
    }
}
