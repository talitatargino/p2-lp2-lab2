package lab2;
import java.util.Arrays;
import java.util.Objects;

/**
 * Representação de uma disciplina.
 * Toda disciplina precisa ter um nome, que é o seu identificador.
 *
 * @author Talita Lima Targino Forte
 */
public class Disciplina {
    /**
     * Nome da disciplina, que a identifica
     */
    private String nomeDisciplina;
    /**
     * Array com as notas do aluno na disciplina
     */
    private double[] notas;
    /**
    * Tempo, em horas, no estudo da disciplina
     */
    private int horas;
    /**
     * Array com os pesos de cada disciplina
     */
    private int [] pesos;

    /**
     * Constrói uma disciplina a partir do parâmetro 'nome' recebido no construtor.
     * @param nomeDisciplina o nome da disciplina
     */
    public Disciplina (String nomeDisciplina){
        this.nomeDisciplina = nomeDisciplina;
        this.notas = new double[4];
        this.pesos = new int[4];
        for (int i=0; i<4; i++){
            pesos[i] = 1;
        }
    }

    /**
     * Constrói uma disciplina a partir do parâmetro 'nome' recebido no construtor.
     * @param nomeDisciplina o nome da disciplina
     * @param numeroDeNotas a quantidade de notas na disciplina (que será o tamanho do array).
     */
    public Disciplina(String nomeDisciplina, int numeroDeNotas){
        this.nomeDisciplina = nomeDisciplina;
        this.notas = new double[numeroDeNotas];
        this.pesos = new int[numeroDeNotas];
        for (int i=0; i<numeroDeNotas; i++){
            pesos[i] = 1;
        }
    }

    /**
     * Constrói uma disciplina a partir do parâmetro 'nome' recebido no construtor.
     * @param nomeDisciplina o nome da disciplina
     * @param numeroDeNotas a quantidade de notas na disciplina (que será o tamanho do array).
     * @param pesos os pesos de cada uma das notas.
     */
    public Disciplina(String nomeDisciplina, int numeroDeNotas, int [] pesos){
        this.nomeDisciplina = nomeDisciplina;
        this.notas = new double[numeroDeNotas];
        this.pesos = pesos;
    }

    /**
     * Cadastra a hora recebida no parâmetro.
     * @param hora a hora
     */
    public void cadastraHoras (int hora){
        this.horas = hora;
    }

    /**
     * Cadastra a nota recebida no parâmetro
     * @param nota o identificador de qual nota é
     * @param valorNota o valor da nota
     */
    public void cadastraNota (int nota, double valorNota){
        notas[nota-1]= valorNota;
    }

    /**
     * Calcula a média e a partir dela retorna 'true' se o aluno for aprovado e 'false' se não for
     * @return true/false referente à situação do aluno na disciplina
     */
    public boolean aprovado(){
        int contaPesos = 0;
        double somaNotas = 0;
        double media = 0;
        for (int i =0; i<notas.length; i++){
            somaNotas+= (notas[i]*pesos[i]);
            contaPesos+= pesos[i];
            }
        media = somaNotas/contaPesos;
        if (media>=7.0){
            return true;
        }
        else {
            return false;
        }
    }

    /**
     * Retorna a String com o nome da disciplina, a quantidade de horas, a média do aluno e as notas.
     * @return a representação em String da situação do aluno na disciplina.
     */
    @Override
    public String toString(){
        double media = 0;
        int contaPesos = 0;
        double somaNotas = 0;
        for (int i =0; i<notas.length; i++){
            somaNotas+= (notas[i]*pesos[i]);
            contaPesos+= pesos[i];
        }
        media = somaNotas/contaPesos;
        return nomeDisciplina + " " + horas + " " + media + " " + Arrays.toString(notas);
    }

    /**
     * Compara se dois objetos Disciplina são iguais em nome e horas de estudo.
     * @param o objeto a ser comparado
     * @return true se forem iguais e false se forem diferentes.
     */
    @Override
    public boolean equals(Object o){
        if(this == o) {
            return true;
        }
        if (!(o instanceof Disciplina)){
            return false;
        }
        Disciplina oDisciplina = (Disciplina) o;
        return (Objects.equals(nomeDisciplina, oDisciplina.nomeDisciplina)  && horas==oDisciplina.horas);
    }

    /**
     * Gera o código hash para o objeto Disciplina, baseado no nome e no número de horas.
     * @return o código hash
     */
    @Override
    public int hashCode(){
        return Objects.hash(nomeDisciplina, horas);
    }
}
