package lab2;

public class Disciplina {
    private String nomeDisciplina;
    private int nota;
    private double valorNota;
    public Disciplina(String nomeDisciplina){
        this.nomeDisciplina = nomeDisciplina;
    }
    public void cadastraNota(int nota, double valorNota){
        this.nota = nota;
        this.valorNota = valorNota;

    }
    public boolean aprovado(){

    }
    public String toString(){

    }
}
