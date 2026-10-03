package lab2;
import java.util.Arrays;
public class Disciplina {
    private String nomeDisciplina;
    private double nota1;
    private double nota2;
    private double nota3;
    private double nota4;
    private int horas;
    public Disciplina (String nomeDisciplina){
        this.nomeDisciplina = nomeDisciplina;
        this.nota1 = 0;
        this.nota2 = 0;
        this.nota3 = 0;
        this.nota4 = 0;
    }
    public void cadastraHoras (int hora){
        this.horas = hora;
    }
    public void cadastraNota (int nota, double valorNota){
        if (nota == 1){
            this.nota1 = valorNota;
        }
        else if (nota ==2){
            this.nota2 = valorNota;
        }
        else if (nota==3){
            this.nota3 = valorNota;
        }
        else{
            this.nota4 = valorNota;
        }
    }
    public boolean aprovado(){
        double media = (nota1+nota2+nota3+nota4)/4;
        if (media>=7.0){
            return true;
        }
        else {
            return false;
        }
    }
    @Override
    public String toString(){
        double [] notas = {nota1, nota2, nota3, nota4};
        return nomeDisciplina + " " + horas + " " + (nota1+nota2+nota3+nota4)/4 + " " + Arrays.toString(notas);
    }
}
