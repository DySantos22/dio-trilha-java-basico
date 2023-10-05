public class ExemploForArray {
    public static void main(String[] args) {
        
        String alunos[] = {"DYLLAN", "FELIPE", "MARCOS", "LUCIANA", "JULIA"};

        /* for (int i = 0; i<alunos.length; i++){
            System.out.println("O aluno no indice "+i+ " é: "+alunos[i]);
        } */

        // for each
        for (String aluno : alunos){
            System.out.println(aluno);
        }
    }
}
