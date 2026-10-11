package lab2;
import java.util.Objects;
/**
 * Essa classe representa o descanso de um aluno.
 *
 * @author Talita Lima Targino Forte.
 */
public class Descanso {
    /**
    *Horas de descanso sendo um inteiro que representa as horas totais de descanso.
     */
    private int horasDeDescanso;
    /**
     * Numero de semanas sendo o total de semanas também no formato inteiro.
     */
    private int numeroDeSemanas;
    /**
    *Constrói o descanso, e inicializa as horas de descanso e o número de semanas como 0.
     */
    public Descanso(){
        this.horasDeDescanso = 0;
        this.numeroDeSemanas = 0;
    }

    /**
     * Define as horas totais de descanso a partir do parâmetro 'valor' recebido.
     * @param valor o tempo em horas que o aluno passou descansando.
     */
    public void defineHorasDescanso(int valor){
        this.horasDeDescanso = valor;
    }

    /**
     * Define o número de semanas a partir do parâmetro 'valor' recebido.
     * @param valor o número de semanas
     */
    public void defineNumeroSemanas(int valor){
        this.numeroDeSemanas = valor;
    }

    /**
     * Retorna a String que representa o status de descanso do aluno, podendo ser 'cansado' ou 'descansado'.
     * @return uma representação em String do status de descanso do aluno.
     */
    public String getStatusGeral(){
        if (horasDeDescanso ==0 || numeroDeSemanas ==0){
            return "cansado";
        }
        int tempo = horasDeDescanso/numeroDeSemanas;
        if (tempo>=26){
            return "descansado";
        }
        else{
            return "cansado";
        }
    }

    /**
     * Retorna a representação em String dos atributos do objeto descanso e do método getStatus.
     * @return String contendo as horas de descanso, o número de semanas e o status geral.
     */
    @Override
    public String toString(){
        return "Horas de descanso: "+ this.horasDeDescanso+ ", Semanas: "+ this.numeroDeSemanas+ ", Status: "+getStatusGeral();
    }

    /**
     * Compara se dois objetos Descanso são iguais em horas de descanso e número de semanas.
     * @param o  o objeto a ser comparado.
     * @return true se forem iguais, false se forem diferentes.
     */
    @Override
    public boolean equals(Object o){
        if(this == o) {
            return true;
        }
        if (!(o instanceof Descanso)){
            return false;
        }
        Descanso novo = (Descanso) o;
        return horasDeDescanso == novo.horasDeDescanso && numeroDeSemanas == novo.numeroDeSemanas;
    }

    /**
     * Gera o código hash para o objeto Descanso baseado nas horas de descanso e no número de semanas.
     * @return o código hash
     */
    @Override
    public int hashCode(){
        return Objects.hash(horasDeDescanso, numeroDeSemanas);
    }
}

