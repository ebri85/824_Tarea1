/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package brizuelaesau.tarea1;

import java.util.Scanner;

/**
 *
 * @author esau.brizuela
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
         int opcion , cantidad;
         char salir;
        Codorniz codorniz;
        double Total;
        Scanner entrada = new Scanner( System.in);
        try{          
                       
            opcion = OpcionMenu();
            
            do
            {
                switch (opcion)
                {
                    
                }
                
                System.out.println("Desea Salir? -- Digite S(salir) / N (continuar");
                salir = entrada.next().charAt(0);
                
                

            } while(Character.toUpperCase(salir)!='S');
            
            
            
                
            
            
            
            
            
            
        }catch(Exception e)
        {
            System.out.println("Error ==> " + e.getMessage() );
            
        }
    }
    
    public static int OpcionMenu()
            //metodo que imprime el menu y retorna la opcion digitada por el usuario;
    { 
        Scanner entrada = new Scanner(System.in);
        int op = 0;
        String menu = "**********CODORSOFT 1.0\"**********'\n\n";
        
        menu+= "1 -- Ingreso de Cantidades\n";
        menu+= "2 -- Mostrar Resultados\n";
        menu+= "0 -- Salir\n";
        
        System.out.println(menu);
        
        System.out.println("Digite la Opcion que desea Ingresar");
       
        return entrada.nextInt(op);
    }
    
    
    
}
