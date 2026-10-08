package lab2;

public class RegistroResumos {
    private int numeroDeResumos;
    private String [] tema;
    private String [] conteudo;
    private int controlaIndice;
    private String [] resumos;

    public RegistroResumos(int numeroDeResumos){
        this.numeroDeResumos= numeroDeResumos;
        this.tema = new String [numeroDeResumos];
        this.conteudo = new String[numeroDeResumos];
        this.resumos = new String[numeroDeResumos];
        this.controlaIndice = 0;

    }

    //podia ser criado uma classe Resumos
    // nela, teria os atributos tema e conteudo
    // na hora de criar, era so instanciar o objeto
    // mas assim tambem funciona :)
    // so é um pouco mais dificil de ler e entender
    public void adiciona(String temarecebido, String conteudorecebido){
        for (int i =0; i<numeroDeResumos ;i++){
            if (tema[i] == null ) {
                break;
            }
            if(tema[i].equals(temarecebido)){
                return;
            }
        }
        tema[controlaIndice] = temarecebido;
        conteudo[controlaIndice] = conteudorecebido;
        controlaIndice++;
        if (controlaIndice==numeroDeResumos){
            controlaIndice = 0;
        }
    }

    public String[] pegaResumos(){
        for (int i = 0; i<numeroDeResumos; i++){
            if (tema[i] == null){
                return resumos;
            }
            resumos [i]= tema[i] + ": " + conteudo[i];
        }
        return resumos;
    }
    public int conta(){
        int contador = 0;
        for (int i =0; i<numeroDeResumos;i++){
            if (tema[i]== null){
                break;
            }
            contador++;
        }
        return contador;
    }
    public String imprimeResumos(){
        String retorno ="";
        retorno +="- Tem "+ conta()+ " resumo (s) cadastrado (s)\n";
        for (int i = 0; i<numeroDeResumos; i++){
            if (tema[i]==null){
                break;
            }
            if (i ==0){
                retorno+="- ";
            retorno+=tema[i];
            }
            else{
            retorno += " | "+ tema[i];
            }
        }
        return retorno;
    }
    public boolean temResumo(String temarecebido){
        for (int i =0 ;i<numeroDeResumos;i++){
            if (tema[i] == null){
                break;
            }
            if(temarecebido.equals(tema[i])){
                return true;
            }
        }
        return false;
    }
}
