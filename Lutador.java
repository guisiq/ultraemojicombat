
package ultraemojicombat;

/**
 *
 * @author eolui
 */
public class Lutador {
     //ATRIBUTOS
     private Empresa Patrocinador;
     private String nome;
     private String nacionalidade;
     private int idade;
     private float peso ;
     private float altura;
     private String categoria;
     private int vitorias ,derrotas,empates;
      
    //METODOS PUBLICOS
     public void apresentar(){
         System.out.println("CHEGOU A HORA !Apresentamos o lutador " +this.getNome());
         System.out.println("Diretamente  de " +this.getNacionalidade());
         System.out.println("com " +this.getIdade() + " anos e " + this.getAltura());
         System.out.println("pesando " + this.getPeso() + " KG");
         System.out.println(this.getVitorias() + " vitórias");
         System.out.println(this.getDerrotas() + " derrotas e");
         System.out.println(this.getEmpates() + " empartes.");
     }
     
    public void status(){
        System.out.println(this.getNome()+" é um peso " + this.getCategoria());
         System.out.println("Ganhou "+this.getVitorias()+ " vezes" );
         System.out.println("Perdeu "+this.getDerrotas()+ " vezes" );
         System.out.println("Empatou "+this.getEmpates()+ " vezes" );
     }
    public void ganharLuta(){
        this.setVitorias(this.getVitorias()+1);
    } 
    public void perderLuta(){
        this.setDerrotas(this.getDerrotas()+1);
    }
    public void empatarLuta(){
        this.setEmpates(this.getEmpates()+1);
    }
             
    //METODO ESPECIAIS

    public Lutador(String nome, String nacionalidade, int idade,float altura,float peso, int vitorias, int derrotas, int empates) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.idade = idade;
        this.setPeso(peso);
        this.altura = altura;
        this.vitorias = vitorias;
        this.derrotas = derrotas;
        this.empates = empates;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
        this.setCategoria();
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public String getCategoria() {
        return categoria;
    }

    private void setCategoria() {
        if(this.peso < 52.2f){
            this.categoria ="Invalido";
        }else if( this.peso <= 70.3f){
            this.categoria ="Leve";
        }else if( this.peso <=83.9f){
            this.categoria= "Médio";
        }else if(this.peso <=120.2f){
            this.categoria="Pesado";
        } else{
            this.categoria="Invalido";
        }
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }
       
}
