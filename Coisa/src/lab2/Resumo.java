package lab2;
import java.util.Objects;
public class Resumo {
    private String tema;
    private String conteudo;
    public Resumo(){
        this.tema = "";
        this.conteudo = "";
    }
    public String getTema(){
        return tema;
    }
    public String getConteudo(){
        return conteudo;
    }
    public void setTema(String novoTema){
        tema = novoTema;
    }
    public void setConteudo(String novoConteudo){
        conteudo = novoConteudo;
    }

}
