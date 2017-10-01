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
       
        int opcion , cantidad, cont =1, codigo, tipo=1;
        char salir;
        Codorniz c;
        Codorniz[] codornices;
        codornices = new Codorniz[3];
        double totalP =0,totalA = 0,totalJ = 0;
        int cant;
        Scanner entrada = new Scanner( System.in);
        
         
            
        try{          

           GeneraTipoCodornices(codornices);
            
            do
            {
                opcion = OpcionMenu();
                
                switch (opcion)
                {
                    
                    case 1:
                        int i =0;
                        do{
                            System.out.println("Digite la cantidad de Codornices tipo => " + codornices[i].getNombre() + "\n");
                            
                            cant= entrada.nextInt();
                            
                                                       
                                switch(tipo)
                                {
                                    case 1:
                                        totalP = RealizarCalculo(cant,codornices[i].getPrecioAlimento());
                                        
                                        break;
                                    case 2:
                                        totalJ = RealizarCalculo(cant,codornices[i].getPrecioAlimento());
                                        
                                        break;
                                        
                                    case 3:
                                        totalA = RealizarCalculo(cant,codornices[i].getPrecioAlimento());
                                        
                                        break;
                                    
                                        default:
                                            
                                            break;
                                    
                                }
                        tipo++;            
                        i++;                        
                        }while(i<3);
                          break;
                
                    case 2:
                                 System.out.println("***Cantidad de Sacos que se deben de Comprar***\n\n");
                                 
                                 System.out.println(codornices[0].toString() +"Total de Sacos que se deben de Comprar" + totalP);
                                 System.out.println(codornices[1].toString() +"Total de Sacos que se deben de Comprar" + totalJ);
                                 System.out.println(codornices[2].toString() +"Total de Sacos que se deben de Comprar" + totalA);
                        break;
                        
                    default:
                        
                        
                        break;
                    
                }
                
                System.out.println("Desea Salir? -- Digite S-(salir) / N-(continuar)");
                salir = entrada.next().charAt(0);
                
                

            } while(Character.toUpperCase(salir)!='S');
            
           
        }catch(Exception e)
        {
            System.out.println("Error ==> " + e.getMessage());
            
        }
    }
    
    public static int OpcionMenu()
            //metodo que imprime el menu y retorna la opcion digitada por el usuario;
    { 
        Scanner entrada = new Scanner(System.in);
        
        int resultado ;
        String menu = "**********CODORSOFT 1.0\"**********'\n\n";
        
        menu+= "1 -- Ingreso de Cantidades\n";
        menu+= "2 -- Mostrar Resultados\n";
        menu+= "0 -- Salir\n";
        
        System.out.println(menu);
        
      //  System.out.println("Digite la Opcion que desea Ingresar");
        
       resultado = entrada.nextInt();
        
        return resultado;               
        
    }
    
     
       
       public static double RealizarCalculo(int cant, double prec)
               /*realiza el calculo, tomando en cosideracion la cantidad de
               codornices */
       {
           
           double resultado;
           
           double consumo = 0.5; //cada codorniz consume medio saco.
           
           resultado = (cant%2 ==0)? ((consumo * cant)*prec) : (((consumo*cant)+consumo)*prec);
             
           return resultado;
           
       }
       
        public static void GeneraTipoCodornices(Codorniz[] c)
        {
            c[0] = new Codorniz(1, "Polluelo", "Crecimiento", 15840);
            c[1] = new Codorniz(2, "Joven", "Desarrollo", 30045);
            c[2] = new Codorniz(3, "Adulto", "Mantenimiento", 43200);
            
        }
    
    
}
