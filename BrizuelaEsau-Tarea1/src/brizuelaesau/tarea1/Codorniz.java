/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package brizuelaesau.tarea1;

/**
 *
 * @author esau.brizuela
 * 
 * Clase Codorniz General
 */
public class Codorniz {
    
    private int codTipo;
    private String tipo;
    private String tipoAlimento;
    private double precioAlimento;
    
    
       public  enum Nombre
       {
           POLLUELO (1),
           JOVEN (2), 
           ADULTO (3); 
           
           private int valor;
           
           private Nombre (int valor)
           {
               this.valor = valor;
           }
       }  

    
            public Codorniz()
            {
                
            }

            public Codorniz(int codTipo, String tipoAlimento, double precioAlimento) 
                    
            {
                this.codTipo = codTipo;
                this.tipoAlimento = tipoAlimento;
                this.precioAlimento = precioAlimento;                                              
            }   
            
            public void setCodTipo(int codTipo) 
            {
                this.codTipo = codTipo;
            }
            
            public int getCodTipo()
            {
                return codTipo;
            }
            
            
            public void setTipoAlimento(String tipoAlimento)
            {
                this.tipoAlimento =  tipoAlimento;
            }
            
            public String getTipoAlimento()
            {
                return tipoAlimento;
            }
            
            public void setPrecioAlimento(double precioAlimento)
            {
                this.precioAlimento = precioAlimento;
                
            }
            
            public double getPrecioAlimento()
            {
                return precioAlimento;
            }
            

  

    @Override
    public String toString() {
     
        switch(codTipo)
        {
            case 1: 
                 return "Codorniz{" + "NOMBRE=" + Nombre.POLLUELO+ ", tipo=" + tipo + ", tipoAlimento=" + tipoAlimento + ", precioAlimento=" + precioAlimento + '}';
                 
                 
            case 2:
                
                 return "Codorniz{" + "NOMBRE=" + Nombre.JOVEN+ ", tipo=" + tipo + ", tipoAlimento=" + tipoAlimento + ", precioAlimento=" + precioAlimento + '}';
  
            
            case 3:
                
                 return "Codorniz{" + "NOMBRE=" + Nombre.ADULTO+ ", tipo=" + tipo + ", tipoAlimento=" + tipoAlimento + ", precioAlimento=" + precioAlimento + '}';
                 
            default:
                
                System.out.println("Errr");
        }
        
          return null;
       
    }
            
    public double CalculaDescuento(int cant, Codorniz c )
           /*metodo que recibe de parametro un Objeto Codorniz y cantidad
            con la ayuda del switch toma la decision que tipo de desc 
            realizar y con estos retorna el descuento aplicado para restarlo al total. */
          
    { 
        double resultado;
        int tipo = c.getCodTipo();
        double desc;
        
        switch(tipo)
        {
            case 1:         
                
                desc = 0.25;
           return resultado = ( ( cant * c.getPrecioAlimento() ) *desc );

            case 2:
            
                desc = 0.65;
             return resultado = ( ( cant * c.getPrecioAlimento() ) *desc );
           
            case 3:
                
                desc = 015;
                return resultado = ( ( cant * c.getPrecioAlimento() ) *desc );
                
        }       
        
        return 0;
       
    }
            
            
                                   
            
}
