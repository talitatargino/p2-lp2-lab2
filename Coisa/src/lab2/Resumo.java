package lab2;
import java.util.Objects;
/**
 * Representação de um resumo.
 * Todo resumo precisa ter um tema e um conteúdo.
 *
 * @author Talita Lima Targino Forte
 */
public class Resumo {
    /**
     * Tema do resumo
     */
    private String tema;
    /**
     * Conteúdo do resumo
     */
    private String conteudo;
    /**
     * Constrói o resumo, inicializando tema e conteúdo.
     */
    public Resumo(){
        this.tema = "";
        this.conteudo = "";
    }

    /**
     *Retorna o tema do resumo
     *
     * @return o tema do resumo
     */
    public String getTema(){
        return tema;
    }

    /**
     * Retorna o conteúdo do resumo
     *
     * @return o conteúdo do resumo
     */
    public String getConteudo(){
        return conteudo;
    }

    /**
     * Define o tema do resumo
     *
     * @param novoTema novo tema do resumo
     */
    public void setTema(String novoTema){
        tema = novoTema;
    }

    /**
     * Define o conteúdo do resumo
     * @param novoConteudo novo conteúdo do resumo
     */
    public void setConteudo(String novoConteudo) {
        conteudo = novoConteudo;
    }

    /**
     * Retorna uma String com as informações do resumo
     * @return representação em String do tema e do conteúdo do resumo.
     */
    @Override
    public String toString(){
        return getTema() +" : "+ getConteudo();
    }

    /**
     * Compara se dois objetos resumo são iguais em tema e conteúdo.
     * @param o   objeto a ser comparado.
     * @return true se forem iguais e false se forem diferentes.
     */
    @Override
    public boolean equals(Object o){
        if (this == o){
            return true;
        }
        if (!(o instanceof Resumo)){
            return false;
        }
        Resumo novo = (Resumo) o;
        return Objects.equals(tema, novo.tema) && Objects.equals(conteudo, novo.conteudo);
    }

    /**
     * Gera o código hash para resumo, baseado no tema e no conteúdo.
     * @return o código hash.
     */
    @Override
    public int hashCode(){
        return Objects.hash(tema, conteudo);
    }

}
