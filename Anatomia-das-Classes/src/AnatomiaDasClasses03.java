
    public class AnatomiaDasClasses03 {
    
        public static void main(String[] args) {
        
        // variáveis 

        String meuNome = "Welder";
        
        int anoFabricacao = 2022;
        
        boolean verdadeira = false;
        
        anoFabricacao = 2018;

        //Tipo Retorno NomeObjetivoNoInfinitivo Paramentro(s)
        
        String primeiroNome = "Welder";
        String segundoNome = "Silva";

        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
        System.out.println(nomeCompleto);

        }


        public static String nomeCompleto (String primeiroNome, String segundoNome)
 {
    return primeiroNome.concat("  ").concat( segundoNome); 
}
        
}        
        