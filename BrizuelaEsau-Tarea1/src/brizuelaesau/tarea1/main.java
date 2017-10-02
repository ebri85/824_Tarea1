/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package brizuelaesau.tarea1;

import java.text.NumberFormat;
import java.util.Arrays;
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
        int cant , cantSacosP =0,cantSacosJ =0, cantSacosA=0;
        Scanner entrada = new Scanner( System.in);
        NumberFormat nf = NumberFormat.getInstance();
      
            
        try{          

           GeneraTipoCodornices(codornices);
            
            do
            {
                opcion = OpcionMenu();
                //switch donde se ingresan a las opciones del menu impreso
                switch (opcion)
                {
                    
                    case 1:
                        int i =0;
                        do{
                            System.out.println("Digite la cantidad de Codornices tipo => " + codornices[i].getNombre() + "\n");
                            
                            cant= entrada.nextInt();
                            
                            
                                   //Switch que ayuda para recorrer el Arreglo de Codornices y calcular cada uno de los totales de Sacos con su precio                    
                                switch(tipo)
                                {
                                    case 1:
                                        cantSacosP = (int) ((cant %2 == 0)? (cant * 0.5) : ((cant*0.5)+0.5));
                                        totalP = RealizarCalculo(cant,codornices[i].getPrecioAlimento());
                                        
                                        break;
                                    case 2:
                                        cantSacosJ = (int) ((cant %2 == 0)? (cant * 0.5) : ((cant*0.5)+0.5));
                                        totalJ = RealizarCalculo(cant,codornices[i].getPrecioAlimento());
                                        
                                        break;
                                        
                                    case 3:
                                        cantSacosA = (int) ((cant %2 == 0)? (cant * 0.5) : ((cant*0.5)+0.5));
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
                                 
                                 System.out.println("Alimento para "+codornices[0].getNombre() +"  se deben de Comprar = " + cantSacosP+" Sacos" +"  para un TOTAL DE ¢" + nf.format(totalP));
                                 System.out.println("Alimento para "+codornices[1].getNombre() +"  se deben de Comprar = " + cantSacosJ+" Sacos"  +"  para un TOTAL DE ¢" + nf.format(totalJ));
                                 System.out.println("Alimento para "+codornices[2].getNombre() +"  se deben de Comprar = " + cantSacosA+" Sacos" +"  para un TOTAL DE ¢"+ nf.format(totalA));
                        break;
                        
                    default:
                        
                        
                        break;
                    
                }
                
                System.out.println("\n\nDesea Salir? -- Digite 'S'-(salir) / 'N'-(continuar)");
                salir = entrada.next().charAt(0);
                
                

            } while(Character.toUpperCase(salir)!='S');
            
           
        }catch(Exception e)
        {
            System.err.println("Error ==> " +  e.toString() + "\n\n");
            
        }
    }
    
    public static int OpcionMenu()
            //metodo que imprime el menu y retorna la opcion digitada por el usuario;
    { 
        Scanner entrada = new Scanner(System.in);
        
        int resultado ;
        String menu = "**********CODORSOFT 1.0**********\n\n";
        
        menu+= "1 -- Ingreso de Cantidades\n";
        menu+= "2 -- Mostrar Resultados\n";
        menu+= "0 -- Salir\n";
        
        System.out.println(menu);
 
       resultado = entrada.nextInt();
        
        return resultado;               
        
    }
    
     
       
       public static double RealizarCalculo(int cant, double prec)
               /*realiza el calculo, tomando en cosideracion la cantidad de
               codornices no me fue necesario realizar tres metodos para calcular el costo */
       {
           
           double resultado;
           
           double consumo = 0.5; //cada codorniz consume medio saco.
           
           resultado = (cant%2 ==0)? ((consumo * cant)*prec) : (((consumo*cant)+consumo)*prec);
             
           return resultado;
           
       }
       
        public static void GeneraTipoCodornices(Codorniz[] c)
        {
            //Tabla de Tipo de Codorniz y Alimentos, es utilizada para realizar el calculo de la compra de alimentos
            c[0] = new Codorniz(1, "Polluelo", "Crecimiento", 15840);
            c[1] = new Codorniz(2, "Joven", "Desarrollo", 30045);
            c[2] = new Codorniz(3, "Adulto", "Mantenimiento", 43200);
            
        }
    
    
}
