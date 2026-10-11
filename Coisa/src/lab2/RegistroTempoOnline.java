package lab2;
import java.util.Objects;
/**
 * Representação do registro de tempo online.
 * Todo registro de tempo online está associado ao nome de alguma disciplina.
 *
 * @author Talita Lima Targino Forte
 */
public class RegistroTempoOnline {
    /**
     * O nome da disciplina associada ao registro.
     */
    private String nomeDisciplina;
    /**
     * O tempo online esperado para o registro dessa disciplina.
     */
    private int tempoOnlineEsperado;
    /**
     * O real tempo online registrado.
     */
    private int tempoOnline;

    /**
     * Constrói um Registro de Tempo Online, a partir do nome da disciplina.
     * Inicializa o tempo online e o tempo online esperado como nulos.
     * @param nomeDisciplina o nome da disciplina.
     */
    public RegistroTempoOnline (String nomeDisciplina){
        this.nomeDisciplina = nomeDisciplina;
        this.tempoOnline = 0;
        this.tempoOnlineEsperado = 120;
    }

    /**
     * Constrói um Registro de Tempo Online, a partir do nome da disciplina e do tempo online esperado.
     * Inicializa o tempo online como nulo.
     * @param nomeDisciplina
     * @param tempoOnlineEsperado
     */
    public RegistroTempoOnline (String nomeDisciplina, int tempoOnlineEsperado){
        this.nomeDisciplina = nomeDisciplina;
        this.tempoOnline = 0;
        this.tempoOnlineEsperado =tempoOnlineEsperado;
    }

    /**
     * Soma ao tempo online o tempo recebido no parâmetro.
     * @param tempo o tempo adicional
     */
    public void adicionaTempoOnline(int tempo){
        this.tempoOnline += tempo;
    }

    /**
     * Verifica se o tempo online esperado foi atingido.
     * @return true se o tempo online esperado foi atingido e false se não foi.
     */
    public boolean atingiuMetaTempoOnline(){
        if (tempoOnline>= tempoOnlineEsperado){
            return true;
        }
        else{
            return false;
        }
    }

    /**
     * Retorna a String que representa o nome da disciplina , o real tempo online gasto nela e o tempo online que era esperado.
     * @return a representação em String do registro de tempo online na disciplina.
     */
    @Override
    public String toString(){
        return nomeDisciplina+ " "+ tempoOnline+"/"+tempoOnlineEsperado;
    }

    /**
     * Compara se dois objetos Registro de Tempo Online são iguais em nome de disciplina, tempo online e tempo online esperado.
     * @param o   objeto a ser comparado.
     * @return true se forem iguais e false se forem diferentes.
     */
    @Override
    public boolean equals(Object o){
        if (this == o){
            return true;
        }
        if (!(o instanceof RegistroTempoOnline)){
            return false;
        }
        RegistroTempoOnline novo = (RegistroTempoOnline) o;
        return Objects.equals(nomeDisciplina, novo.nomeDisciplina) && tempoOnlineEsperado== novo.tempoOnlineEsperado && tempoOnline== novo.tempoOnline;
    }

    /**
     * Gera o código hash para o registro, baseado no nome da dsiciplina, no tempo online e no tempo online esperado.
     * @return o código hash gerado.
     */
    @Override
    public int hashCode(){
        return Objects.hash(nomeDisciplina, tempoOnline, tempoOnlineEsperado);
    }
}
