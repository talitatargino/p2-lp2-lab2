package lab2;
import java.util.Arrays;
public class Disciplina {
    private String nomeDisciplina;
    private double[] notas;
    private int horas;
    private int [] pesos;
    private boolean temPesos;
    private double media;
    public Disciplina (String nomeDisciplina){
        this.nomeDisciplina = nomeDisciplina;
        this.notas = new double[4];
        this.temPesos = false;
    }
    public Disciplina(String nomeDisciplina, int numeroDeNotas){
        this.nomeDisciplina = nomeDisciplina;
        this.notas = new double[numeroDeNotas];
        this.temPesos = false;
    }
    public Disciplina(String nomeDisciplina, int numeroDeNotas, int [] pesos){
        this.nomeDisciplina = nomeDisciplina;
        this.notas = new double[numeroDeNotas];
        this.pesos = new int[numeroDeNotas];
        this.temPesos = true;
    }
    public void cadastraHoras (int hora){
        this.horas = hora;
    }
    public void cadastraNota (int nota, double valorNota){
        notas[nota-1]= valorNota;
    }
    public boolean aprovado(){
        if (!temPesos){
            for(int i=0; i<notas.length;i++){
            media+= notas[i];
            }
            media = media/ notas.length;
        }
        else{
            int contaPesos = 0;
            double somaNotas = 0;
            for (int i =0; i<notas.length; i++){
                somaNotas+= (notas[i]*pesos[i]);
                contaPesos+= pesos[i];
            }
            media = somaNotas/contaPesos;
        }
        if (media>=7.0){
            return true;
        }
        else {
            return false;
        }
    }
    @Override
    public String toString(){
        return nomeDisciplina + " " + horas + " " + media + " " + Arrays.toString(notas);
    }
}
