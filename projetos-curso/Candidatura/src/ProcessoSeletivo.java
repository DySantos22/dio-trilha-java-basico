import java.util.concurrent.ThreadLocalRandom;
import java.util.Random;

public class ProcessoSeletivo {
    public static void main(String[] args){
        String [] candidatos = {"FELIPE","DYLLAN","JULIA","ROBERTO","VITORIA"};

        for (String candidato: candidatos){
            EntrandoContato(candidato);
        }
    }

    static void EntrandoContato(String candidato){
        int tentativasRealizadas =1;
        boolean continuartentando = true;
        boolean atendeu = false;

        do{
            //precisarao sofrer alterações
            atendeu = atender();
            continuartentando = !atendeu;

            if(continuartentando){
                tentativasRealizadas++;
            }else{
                System.out.println("CONTATO REALIZADO COM SUCESSO!");
                System.out.println("--------------------------------");
            }

        }while(continuartentando && tentativasRealizadas < 3);

        if(atendeu){
            System.out.println("CONSEGUIMOS CONTATO COM O CANDIDATO: "+candidato+" NA "+tentativasRealizadas+"º TENTATIVA");
            System.out.println("------------------------------------------------------------------------------------------");
        }else{
            System.out.println("O CANDIDATO "+candidato+" NÃO ATENDEU.");
            System.out.println("--------------------------------------");
        }
    }

    static boolean atender(){
        return new Random().nextInt(3)==1;
    }

    static void imprimirSelecionados(){
       String [] candidatos = {"FELIPE","DYLLAN","JULIA","ROBERTO","VITORIA"};
        System.out.println("Imprimindo a lista de candidatos");

       for(int indice = 0; indice < candidatos.length; indice++){
            System.out.println((indice +1) +": "+candidatos[indice]);
       }

       //MÉTODO ABREVIADO E ALTERNATIVO 
       System.out.println("Forma abreviada de interação");
       for(String candidato: candidatos){
         System.out.println("O candidato selecionado foi: "+candidato);
       }
    }

    static void selecionarCandidatos(){
        String [] candidatos = {"FELIPE","DYLLAN","JULIA","ROBERTO","VITORIA","CARLOS","RONALDO","ROSANE","PAULO"};

        int candidatosSelecionados = 0;
        int candidatoAtual = 0;
        double salariobase = 2000.0;

        while(candidatosSelecionados < 5 && candidatoAtual < candidatos.length){
            String candidato = candidatos[candidatoAtual];
            double salariopretendido = valorPretendido();

            System.out.println("O candidato: "+candidato+" solicitou este valor de salário pretendido: "+salariopretendido);

            if(salariobase >= salariopretendido){
                System.out.println("O candidato "+candidato+" foi selecionado para a vaga");
                System.out.println("-------------------------------------------------------");
                candidatosSelecionados++;
            }
            candidatoAtual++;
        }
    }

    static void AnalisarCandidato(String nome, double salariopretendido){
        double salariobase = 2000.0;

        String decisao = salariobase < salariopretendido ? "LIGAR PARA O CANDIDATO" : salariobase == salariopretendido ? "LIGAR CANDIDATO COM CONTRA PROPOSTA" : "AGUARDANDO RESULTADO DEMAIS CANDIDATOS";
        System.out.println(nome+" "+decisao);
    }

    static double valorPretendido(){
        return ThreadLocalRandom.current().nextDouble(1800,2200);
    }
}

