public class operadores06 {
    public static void main(String[] args) {
        
        String nomeUm = "Welder";
        String nomeDois = "Welder";

        System.out.println(nomeUm.equals(nomeDois));
        
        
        int numero1 = 1;
        int numero2 = 2;

        boolean simNao = numero1 == numero2;
        
        if(numero1 < numero2){
            System.out.println("A nossa condição é verdadeira");
        }


        System.out.println("NumeroUm é igual a NumeroDois? " + simNao);


        simNao = numero1 != numero2;

        System.out.println("NumeroUm é diferente a NumeroDois? " + simNao);
    
       
        simNao = numero1 > numero2;

       System.out.println("NumeroUm é maior que NumeroDois? " + simNao);
    
    }
    }



