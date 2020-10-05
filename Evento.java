package ultraemojicombat;

import java.util.List;
import java.util.Scanner;
/*IDEIA  PRINCIPLA:
 * INSANCIAR E FORMATAR PATROCINADORES , LUTAS E LUTADORES;
 * 
 */
public class Evento {
    //#region declarando atributos 
	private Empresa patrocinadores[];
	private Lutador lutador[];
    private Luta[] lutas;
    private String nome;
	private String diaInicio;
	private String diaFim;
    private String endereco;
    //#endregion
	 
	
	public Evento(int quantidadePatrocinadores, String diaInicio, String diaFim) {
		
		patrocinadores= new Empresa[quantidadePatrocinadores];
        
        this.diaFim= diaFim;
		this.diaInicio= diaInicio;
	}
	
	
	//INSTANCIA E DEFINE A QUANTIDADE DE LUTAS
	public void instanciarLutas(int quantidadeLutas) {
		 lutas = new Luta[ quantidadeLutas];
		
    }
    public void imprimirEvento(boolean conpleto){
        if (conpleto) {
            this.
        } else {
            
        }
    } 
    public static void main(String[] args) {
        int funcao;
        int indice;
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("qual o numero maximo de eventos ?");
        Evento[] eventos = new Evento[leitor.nextInt()];
        leitor.nextLine();
        System.out.println("1- criar evento");
        System.out.println("2- gerenciar eventos");
        funcao = leitor.nextInt();
        leitor.nextLine();
        switch (funcao){
            case 1:{
                System.out.println("qual o dia de inicio do evento ");                
                String diaInicio = leitor.nextLine();
                System.out.println("qual o dia de fim do evento ");                
                String diaFim = leitor.nextLine();
                System.out.println("qual aquantidade de patrovinadores  ");
                int quantPratocinio = leitor.nextInt();
                eventos[indice] = new Evento(quantPratocinio, diaInicio, diaFim)
                break;
            }
			case 2:
			
			
                break;
        
            default:
                break;
        }
    }
    //#region metodos gets e seters
    //BUSCA O VALOR DE UMA LUTA DE FORMA INDIVIDUAL
	public Luta[] getLuta() {
		return lutas;
	}
    //ALTERA O VALOR DE UMA LUTA DE FORMA INDIVIDUAL
	public void setLuta(Luta[] luta) {
		this.lutas = luta;
	}

	public String getDiaInicio() {
		return diaInicio;
	}

	public void setDiaInicio(String diaInicio) {
		this.diaInicio = diaInicio;
	}

	public String getDiaFim() {
		return diaFim;
	}

	public void setDiaFim(String diaFim) {
		this.diaFim = diaFim;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public Empresa[] getPatrocinadores() {
		return patrocinadores;
	}

	public void setPatrocinadores(Empresa[] patrocinadores) {
		this.patrocinadores = patrocinadores;
	}
    //#endregion	
	
	
	
}