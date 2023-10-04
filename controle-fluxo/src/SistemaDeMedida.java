public class SistemaDeMedida {
    public static void main(String[] args) {
        
        /* String tamanho = "p";

        if(tamanho == "P" || tamanho == "p"){
            System.out.println("PEQUENO");
        }else if (tamanho == "M" || tamanho == "m"){
            System.out.println("MEDIO");
        }else if(tamanho == "G" || tamanho == "g"){
            System.out.println("GRANDE");
        }else{
            System.out.println("Inexistente");
        }
        */

        String sigla = "P";

        switch (sigla){
            case "P":{
                System.out.println("PEQUENO");
                break;
            }case "M":{
            System.out.println("MEDIO");
            break;
            }case "G":{
            System.out.println("GRANDE");
            break;
            } default:{
                System.out.println("INDEFINIDO");
            }
        }
    }
}
