public class FormatadorCepExemplo {
    public static void main(String[] args) {
        try{
        String cepformatado = formatarCep("23015658");
        System.out.println(cepformatado);
        }catch (CepInvalidoException e){
            System.out.println("O cep não está certo");
        }
    }
    static String formatarCep(String cep) throws CepInvalidoException{
        if(cep.length() != 8){
            throw new CepInvalidoException();
        }
        //Simulando um cep formatado
        return "23.546-040";
    }
}
