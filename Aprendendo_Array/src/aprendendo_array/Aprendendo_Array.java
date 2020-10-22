package aprendendo_array;

public class Aprendendo_Array{
    
    public static void main(String[] args){
        
        int[] nota = {
            10,
            8,
            10,
            7
        };
        
      int  media = (nota[0] + nota[1] + nota[2] + nota[3]) / 4;
      int limite = 0;
      
    
      /*
      do{
        limite = limite + 1;
        System.out.println("Numero "+limite);   
      }while(limite < nota.length);
      */
      int n = 1;
      
     for (int nn = 1; n < 5; n = n+1){
         System.out.println("For "+n);  
     }
      
      
      while(limite < nota.length){
          limite = limite + 1;
        System.out.println("Numero "+limite);  
      }  
        
    }
    
    
}


