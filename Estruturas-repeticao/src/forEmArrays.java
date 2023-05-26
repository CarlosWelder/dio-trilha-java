public class forEmArrays {
    
public static void main(String[] args) {
    String alunos [] = {"Welder", "Carlos", "Silva","Teixeira"};

      for(int x = 0; x<alunos.length; x++){
        System.out.println("O aluno no indice x=" + x + " é " + alunos [x]);
      }
        //ou

        for(String aluno : alunos){
            System.out.println("Nome do aluno é: " + aluno);
        }
}

}
