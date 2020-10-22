
package primeiroprograma;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.Date;
import java.util.Locale;




public class PrimeiroPrograma {
 
    public static void main(String[] args){
        System.out.println("A hora do sistema!");
        Date relogio = new Date();
        System.out.print("A hora do sistema é ");
        System.out.println(relogio.toString());
        
        Locale loc = Locale.getDefault();
        System.out.print("Sua linguagem é ");
        System.out.println(loc.getDisplayLanguage());
        
        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension d = tk.getScreenSize();
        System.out.println("A resolução da sua tela é "+d.width+"px e "+ d.height + "px");
        
        int a = 4;
        int soma = 5 + a++;
        System.out.println(soma);
        int b = 20;
        System.out.println(soma += b);
       
    }
    
}
