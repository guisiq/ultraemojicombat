package ultraemojicombat;

import java.util.Scanner;

/*IDEIA  PRINCIPLA:
 * INSANCIAR E FORMATAR PATROCINADORES , LUTAS E LUTADORES;
 * 
 */
public class Evento {
    // #region declarando atributos
    private static Lutador lutadores[] = { new Lutador("Prety Boy", "França", 31, 1.75f, 68.9f, 11, 2, 1),
            new Lutador("Putscript", "Brasil", 29, 1.68f, 57.8f, 14, 2, 3),
            new Lutador("Snapshadow", "EUA", 35, 1.65f, 80.9f, 13, 2, 1),
            new Lutador("Drea Code", "Australia", 28, 1.93f, 81.6f, 13, 0, 2),
            new Lutador("UFOCobol", "Brasil", 37, 1.70f, 119.3f, 5, 4, 3),
            new Lutador("Nerdaart", "EUA", 30, 1.81f, 105.7f, 12, 2, 4) };
    // private static Empresa listapatrocinadores[];
    private Empresa patrocinadores;
    private Luta[] lutas;
    private String nome;
    private String diaInicio;
    private String diaFim;
    private String endereco;
    // #endregion

    public Evento(String diaInicio, String diaFim, String nome) {
        this.nome = nome;
        this.diaFim = diaFim;
        this.diaInicio = diaInicio;
    }

    public void apresentarLutadores() {
        for (int i = 0; i < this.lutadores.length; i++) {
            System.out.println(i + "-" + this.lutadores[i].getNome());
        }
    }

    // INSTANCIA E DEFINE A QUANTIDADE DE LUTAS
    public void instanciarLutas(int quantidadeLutas) {
        this.lutas = new Luta[quantidadeLutas];
    }

    public void imprimirEvento(boolean conpleto, int indice) {
        if (conpleto) {
            System.out.println("===" + indice + "-" + this.nome + "===");
            System.out.println("-" + this.diaInicio);
            System.out.println("-" + this.diaFim);
            System.out.println("-" + this.endereco);
            for (Luta luta : this.lutas) {
                luta.imprimirLuta();
            }

        } else {
            System.err.println(indice + "-" + this.nome);
        }
    }

    public static void main(String[] args) {
        Empresa[] patrocinadores = {
            new Empresa("artirgos esportivos","85612423436564","DF esports","mei"),
            new Empresa("suprementos ","85614426436664","palmas suprementos ","copetiva"),
            new Empresa("academia","866146426436665","fit smart","eirele")
        };
        
        int funcao;
        int indice = 0;
        
        Scanner leitor = new Scanner(System.in);
        System.out.println("qual o numero maximo de eventos ?");
        Evento[] eventos = new Evento[leitor.nextInt()];
        leitor.nextLine();
        do{

            System.out.println("selecione uma opcao ");
            System.out.println("1- criar evento");
            System.out.println("2- gerenciar eventos");
            funcao = leitor.nextInt();
            leitor.nextLine();
            switch (funcao) {
                case 1: {
                    if ((indice) >= eventos.length) {
                        System.err.println("nao e posivel cadrastar mais eventos voce ");
                    } else {

                        System.out.println("qual o nome do evento ");
                        String nome = leitor.nextLine();
                        System.out.println("qual o dia de inicio do evento ");
                        String diaInicio = leitor.nextLine();
                        System.out.println("qual o dia de fim do evento ");
                        String diaFim = leitor.nextLine();
                        eventos[indice] = new Evento(diaInicio, diaFim, nome);
                        indice++;
                    }
                    break;
                }
                case 2: {
                   
                    System.out.println("=========GERENCIADOR DE EVENTOS========== ");
                    for (int i = 0; i < eventos.length; i++) {
                        if ( eventos[i] != null){
                        eventos[i].imprimirEvento(false, i);
                        }
                    }
                    System.out.println("== digite o indice do evento  ==");
                    int eventoindice = leitor.nextInt();
                    leitor.nextLine();

                    // VARIAVEL QUE IRÁ RECEBER OS ENDEREÇO DO EVENTO ESCOLHIDO PARA GERENCIAMENTO
                    Evento eventoG = eventos[eventoindice];
                    for (String c = "S"; c == "S" || c == "s" || c == "sim";) {
                        System.out.println("=========OPÇÕES DE GERENCIAMENTO========== ");
                        System.out.println("0- DEFINIR QUANTIDADE DE LUTAS E SEUS PARTCIPANTES");
                        System.out.println("1- GERENCIAR PATROCINADORES");
                        System.out.println("2-LUTAR");
                        System.out.println("");
                        System.out.println("Digite o numero da opção desejada:");
                        int opcao = leitor.nextInt();

                        switch (opcao) {
                            case 0: {

                                System.out.println("Digite a quantidade de lutas que o evento " + eventoG.getNome() + " terá:");
                                int qtg = leitor.nextInt() ;
                                eventoG.instanciarLutas(qtg);
                                for (int i = 0; i < eventoG.lutas.length; i++) {
                                    eventoG.apresentarLutadores();
                                    System.out.println("Digite o indice do lutador Desafiante:");
                                    int desafianteIndice = leitor.nextInt();
                                    System.out.println("Digite o indice do lutador Desafiado:");
                                    int desafiadoIndice = leitor.nextInt();

                                    eventoG.lutas[i] = new Luta(Evento.lutadores[desafiadoIndice],Evento.lutadores[desafianteIndice]);
                                }
                                        break;
                            }
                            case 1:{
                                int g = 0 ;
                                for(Empresa patrocinador    : patrocinadores){
                                    System.out.println(g+ "-" + patrocinador.getNome());
                                    g++;
                                }
                                System.out.println("Digite o numero do patrocinador do evento " +eventoG.nome);
                                int patrocinadorIndice= leitor.nextInt();
                                if(patrocinadores[patrocinadorIndice] != null){
                                    eventoG.setPatrocinadores(patrocinadores[patrocinadorIndice]);
                                    System.out.println("PATROCINADOR ALTERADO COM SUCESSO ");
                                }else{
                                    System.out.println("O VALOR INFORMADO NÃO É UM PATROCINADOR ");
                                }
                                break;
                            }
                            case 2:{
                                
                                int a=0;
                                for (Luta lutas : eventoG.lutas) {
                                    System.out.println(a + " - "+lutas.getNome());
                                    a++; 
                                }           
                                System.out.println("Digite o numero da luta que irá acontecer AGORAAAA!");   
                                int indiceLuta= leitor.nextInt();
                                eventoG.lutas[indiceLuta].lutar();
                                break;
                            }
                        }
                        System.out.println("Deseja ir ao Gerenciador de Opções novamente:");
                        c = leitor.next();
                    }
                }
            }            
        }while(funcao!=0);
    }

    // #region metodos gets e seters
    // BUSCA O VALOR DE UMA LUTA DE FORMA INDIVIDUAL
    public Luta[] getLuta() {
        return lutas;
    }

    // ALTERA O VALOR DE UMA LUTA DE FORMA INDIVIDUAL
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

    public Empresa getPatrocinadores() {
        return patrocinadores;
    }

    public void setPatrocinadores(Empresa patrocinadores) {
        this.patrocinadores = patrocinadores;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    // #endregion

}