package formacaoJava;

import java.util.Scanner;

import capituloII.string;

public class Escola {
    public static void main(String[] args) {
        
        Aluno felipe = new Aluno();
        felipe.setNome("Welder");
        felipe.setIdade(18);

        System.out.println("O aluno " + felipe.getNome() + " tem "
         + felipe.getIdade());
}

}