package lab2;

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
        this.horas =horas;
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
            this.nota4 = nota4;
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
        return "Disciplina: "+nomeDisciplina+". Número de horas de estudo: "+horas+ ". Média do aluno: "+ (nota1+nota2+nota3+nota4)/4+ ". Nota 1: "+nota1+". Nota 2: "+nota2+". Nota 3: "+nota3+". Nota 4: "+nota4;
    }
}
