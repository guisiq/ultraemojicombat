package ultraemojicombat;

public class Empresa {

    private String Atuacao; 
    private String CNPJ; 
    private String nome; 
    private String naturezaJuridca;

    public String getAtuacao() {
        return Atuacao;
    }

    public void setAtuacao(String atuacao) {
        Atuacao = atuacao;
    }

    public String getCNPJ() {
        return CNPJ;
    }

    public void setCNPJ(String cNPJ) {
        CNPJ = cNPJ;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNaturezaJuridca() {
        return naturezaJuridca;
    }

    public void setNaturezaJuridca(String naturezaJuridca) {
        this.naturezaJuridca = naturezaJuridca;
    }
/**
 * @param atuacao
 * @param cNPJ
 * @param nome
 * @param naturezaJuridca "mei""ei""eirele""coperativa""binacionais"
 */
    public Empresa(String atuacao, String cNPJ, String nome, String naturezaJuridca) {
        this.Atuacao = atuacao;
        this.CNPJ = cNPJ;
        this.nome = nome;
        this.naturezaJuridca = naturezaJuridca;
    }
     

}
 