package edu.dyllan.primeirasemana;
public class MinhaClasse{

    public static void main (String [] args){
        String nome = "Vitoria";
        String sobrenome = "Teixeira";
        String nomeCompleto = nomeCompleto(nome, sobrenome);
        System.out.println(nomeCompleto);
    }

    public static String nomeCompleto(String nome, String sobrenome){
        return nome.concat(" ").concat(sobrenome);
    }

}