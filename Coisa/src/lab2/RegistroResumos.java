package lab2;

public class RegistroResumos {
    /*
    Array que armazena os objetos Resumo
     */
    private Resumo [] resumos;
    /*
    conta a quantidade de resumos
     */
    private int contaResumo;
    /*
    faz o controle do apontador de índices no qual vou adicionar o próximo resumo
     */
    private int controlaIndice;
    /*
    o construtor da minha classe 'RegistroResumos' que recebe como parâmetro a quantidade de resumos
     */
    public RegistroResumos(int numeroDeResumos){
        /*
        Cria um array de objetos com a capacidade indicada como parâmetro
         */
        this.resumos = new Resumo[numeroDeResumos];
        /*
        percorre todas as posições do array criando um objeto resumo para cada uma dela
         */
        for (int i = 0; i < resumos.length; i++) {
            resumos[i] = new Resumo();
        }
        /*
        Inicializa o 'contaResumo' e 'controlaIndice' como 0 , pois ainda não adicionei nenhum resumo
         */
        this.contaResumo = 0;
        this.controlaIndice = 0;
    }
    /*
    crio a classe 'adiciona' que tem 'temaRecebido' e 'conteudoRecebido' como parâmetros, e vai, através do set, adicionar um resumo ao registo
     */

    public void adiciona(String temaRecebido, String conteudoRecebido){
        /*
        primeiro verifico se existe alguém com o mesmo tema do array
         */
        for (int i =0; i<contaResumo;i++){
            if(resumos[i].getTema().equals(temaRecebido))
                return;
        }
        /*
        se não houver, significa que posso adicionar no meu array, faço 2 sets para isso
         */
        resumos[controlaIndice].setTema(temaRecebido);
        resumos[controlaIndice].setConteudo(conteudoRecebido);
        /*
        atualizo meu controle de índice
         */
        controlaIndice++;
        /*
        se o array for preenchido totalmente, o meu controle de índice passa a apontar para o começo
         */
        if (controlaIndice== resumos.length){
            controlaIndice = 0;
        }
        /*
        atualizo a minha variável que contabiliza os resumos
         */
        if (contaResumo<resumos.length){
            contaResumo++;
        }
    }
    /*
    crio a classe conta que retorna o meu contador de resumos
     */
    public int conta(){
        return contaResumo;
    }
    /*
    crio a classe pegaResumos, que retorna um array contendo tema e conteúdo de cada um deles
     */
    public String[] pegaResumos(){
        String [] saida = new String [contaResumo];
        for (int i = 0; i<contaResumo; i++){
            saida [i]= resumos[i].getTema() + ": " + resumos[i].getConteudo();
        }
        return saida;
    }
    /*
    crio a classe imprimeResumos que retorna uma String dizendo quantos resumos eu tenho cadastrados, e seus temas
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
    /*
    crio a classe 'temResumo' que percorre o array e verifica se existe nele algum resumo com o mesmo tema recebido como parâmetro, se houver retorno 'true' e se não houver retorno 'false'
     */
    public boolean temResumo(String temarecebido){
        for (int i =0 ;i<contaResumo;i++){
            if(temarecebido.equals(resumos[i].getTema())){
                return true;
            }
        }
        return false;
    }
    }

