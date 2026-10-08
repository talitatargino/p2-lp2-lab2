package lab2;

public class Resumo {
    private String tema;
    private String conteudo;
    public Resumo(String tema, String conteudo){
        this.tema = tema;
        this.conteudo = conteudo;
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
