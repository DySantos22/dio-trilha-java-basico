public class ResultadoEscolar {
    public static void main(String[] args) {
        // Controle de Fluxo condicionais
        /* int nota = 6;

        if(nota >=7){
            System.out.println("Aprovado");
        }else if(nota >= 5 && nota <7){
            System.out.println("Em recuperação");
        }else{
            System.out.println("Reprovado");
        } */
        
        //Controle de fluxo com ternários


       /*  int nota = 2;

        String resultado = nota >= 6 ? "Aprovado" : "Reprovado";
        System.out.println(resultado); */

        int nota = 7;

        String resultado = nota >=7 ? "Aprovado" : nota >= 5 && nota < 7 ? "Recuperação" : "Reprovado";
        System.out.println(resultado); 
    }
}

