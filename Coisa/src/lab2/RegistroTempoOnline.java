package lab2;

public class RegistroTempoOnline {
    private String nomeDisciplina;
    private int tempoOnlineEsperado;
    private int tempoOnline;

    public RegistroTempoOnline (String nomeDisciplina){
        this.nomeDisciplina = nomeDisciplina;
        this.tempoOnline = 0;
        this.tempoOnlineEsperado = 120;
    }
    public RegistroTempoOnline (String nomeDisciplina, int tempoOnlineEsperado){
        this.nomeDisciplina = nomeDisciplina;
        this.tempoOnline = 0;
        this.tempoOnlineEsperado =tempoOnlineEsperado;
    }
    public void adicionaTempoOnline(int tempo){
        this.tempoOnline += tempo;
    }

    public boolean atingiuMetaTempoOnline(){
        if (tempoOnline>= tempoOnlineEsperado){
            return true;
        }
        else{
            return false;
        }
    }
    @Override
    public String toString(){
        return "Disciplina: "+nomeDisciplina+ " .Tempo online usado: "+ tempoOnline+".Tempo online esperado: "+tempoOnlineEsperado;
    }
}
