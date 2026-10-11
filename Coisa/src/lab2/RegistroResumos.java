package lab2;
import java.util.Arrays;

/**
 * Essa classe representa o registro dos resumos
 * Todo Registro de Resumos precisa ter um array de resumos.
 * @author Talita Lima Targino Forte
 */
public class RegistroResumos {
    /**
    *Array que armazena os objetos Resumo
     */
    private Resumo [] resumos;
    /**
    *Contador para a quantidade de resumos
     */
    private int contaResumo;
    /**
    *Variável que funciona como apontador de índices
     */
    private int controlaIndice;
    /**
    *Constrói um registro de resumos a partir do número de resumos.
     * Também inicializa as variáveis 'contaResumo' e 'controlaIndice'
     */
    public RegistroResumos(int numeroDeResumos){
        this.resumos = new Resumo[numeroDeResumos];
        for (int i = 0; i < resumos.length; i++) {
            resumos[i] = new Resumo();
        }
        this.contaResumo = 0;
        this.controlaIndice = 0;
    }

    /**
     * Recebo um resumo e, se não existir outro de mesmo tema, o adiciono no registro
     * Também atualizo o controle de índice e o contador, se o ressumo for adicionado.
     * @param temaRecebido o novo tema
     * @param conteudoRecebido o novo conteudo
     */
    public void adiciona(String temaRecebido, String conteudoRecebido){
        for (int i =0; i<contaResumo;i++){
            if(resumos[i].getTema().equals(temaRecebido))
                return;
        }
        resumos[controlaIndice].setTema(temaRecebido);
        resumos[controlaIndice].setConteudo(conteudoRecebido);
        controlaIndice++;
        if (controlaIndice== resumos.length){
            controlaIndice = 0;
        }
        if (contaResumo<resumos.length){
            contaResumo++;
        }
    }

    /**
     *Retorna o número de resumos.
     * @return a variável que conta resumos.
     */
    public int conta(){
        return contaResumo;
    }

    /**
     * Retorna um array que, para cada resumo, informa índice e conteúdo.
     * @return o array com as informações de todos os resumos do registro.
     */
    public String[] pegaResumos(){
        String [] saida = new String [contaResumo];
        for (int i = 0; i<contaResumo; i++){
            saida [i]= resumos[i].getTema() + ": " + resumos[i].getConteudo();
        }
        return saida;
    }

    /**
     * Imprime a quantidade de resumos registrados e os seus temas.
     * @return uma representação em String dos temas e do número de resumos.
     */
    public String imprimeResumos(){
        String retorno = "- Tem "+ conta()+ " resumo (s) cadastrado (s)\n";
        for (int i = 0; i<contaResumo; i++){
            if (i ==0){
                retorno+="- ";
            retorno+=resumos[i].getTema();
            }
            else{
            retorno += " | "+ resumos[i].getTema();
            }
        }
        return retorno;
    }

    /**
     * Verifica se oo resumo de tema recebido no parâmetro já está registrado ou não.
     * @param temarecebido o tema que vou procurar no registro.
     * @return true ou false, dependendo se achar ou não esse tema no registro.
     */
    public boolean temResumo(String temarecebido){
        for (int i =0 ;i<contaResumo;i++){
            if(temarecebido.equals(resumos[i].getTema())){
                return true;
            }
        }
        return false;
    }

    /**
     * Procura uma palavra no conteúdo dos resumos do registro.
     * @param chaveDeBusca String que estou buscando.
     * @return um array de String ordenado, contendo os temas dos resumos em que a palavra existe.
     */
    public String [] busca(String chaveDeBusca){
        String [] retorno = new String[resumos.length];
        int aponta = 0;
        String chaveMinuscula = chaveDeBusca.toLowerCase();
        for (int i=0 ; i<contaResumo;i++){
            String [] palavras = resumos[i].getConteudo().split("\\s+");
            for (String palavra: palavras){
              if (palavra.toLowerCase().equals(chaveMinuscula)){
                  retorno[aponta]= resumos[i].getTema();
                  aponta ++;
                  break;
              }
            }
        }
        String[] resultadoFinal = Arrays.copyOf(retorno, aponta);
        Arrays.sort(resultadoFinal);
        return resultadoFinal;
    }
}

