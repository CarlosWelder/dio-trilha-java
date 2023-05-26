public class ResultadoEscolar2 {
    public static void main(String[] args) throws Exception {
          int nota = 5 ;

      String resultado = nota >=7 ? "Aprovado" : "Reprovado";

      System.out.println(resultado);

      
      String resultado1 = nota >=7 ? "Aprovado" : nota >= 5 && nota < 7 ? "Prova Recuperação" : "Reprovado";
     
      System.out.println(resultado1);
   }
}
