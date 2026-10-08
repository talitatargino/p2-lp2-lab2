package lab2;

public class RegistroResumos {
    private Resumo [] resumos;
    private int contaResumo;
    private int controlaIndice;
    private String [] saida;
    public RegistroResumos(int numeroDeResumos){
        this.resumos = new Resumo[numeroDeResumos];
        this.contaResumo = 0;
        this.controlaIndice = 0;
        this.saida = saida;
    }
    public void adiciona(String temarecebido, String conteudorecebido){
        /*
        primeiro verifico se existe alguém com o mesmo tema do array
         */
        for (int i =0; i<contaResumo;i++){
            if(resumos[i].getTema().equals(temarecebido) && resumos[i]!=null)
                return;
        }
        /*
        se não houver, eu crio esse resumo
         */
        if (resumos[controlaIndice] == null) {
            resumos[controlaIndice] = new Resumo();
        }
        resumos[controlaIndice].setTema(temarecebido);
        resumos[controlaIndice].setConteudo(conteudorecebido);
        controlaIndice++;
        if (controlaIndice== resumos.length){
            controlaIndice = 0;
        }
        if (contaResumo!= resumos.length){
            contaResumo++;
        }
    }

    public int conta(){
        return contaResumo;
    }
    public String[] pegaResumos(){
        for (int i = 0; i<contaResumo; i++){
            saida [i]= resumos[i].getTema() + ": " + resumos[i].getConteudo();
        }
        return saida;
    }
    public String imprimeResumos(){
        String retorno ="";
        retorno +="- Tem "+ conta()+ " resumo (s) cadastrado (s)\n";
        for (int i = 0; i<controlaIndice; i++){
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
    public boolean temResumo(String temarecebido){
        for (int i =0 ;i<contaResumo;i++){
            if(temarecebido.equals(resumos[i].getTema())){
                return true;
            }
        }
        return false;
    }
    }

