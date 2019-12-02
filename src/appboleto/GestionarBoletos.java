/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appboleto;

/**
 *
 * @author daniel2402
 */
public class GestionarBoletos {
  
    private Boleto[] boletos= new Boleto[20];
    private int autoId=0;
    public String adicionarBoleto(String nombre, String pelicula, int asiento, int sala, String localidad, String dia){
        
        double precio=0;
        switch(localidad){
            case "general":
                precio=7000;
                break;
            case "vip":
                precio=9450;
                break;
            case "segundopiso":
                precio=8400;
                break;    
        }
        if(dia=="viernes" || dia=="sabado"||dia=="domingo"){
            precio=precio+(precio*0.25);
        }
        
        
        Boleto bol= new Boleto(nombre, this.autoId,pelicula,asiento,sala,localidad,precio,dia);
        boletos[this.autoId]=bol;
        this.autoId= this.autoId+1;
        return "exito";
    }
    public String eliminarBoleto(int id){
        for(int i=0;i<boletos.length;i++){
            if(boletos[i].getAtrId()==id){
                boletos[i]=null;
                return "exito";
            } 
        }
        return "fracaso";
        
    }
    public Boleto[] buscarLocalidad(String localidad){
        Boleto[] bol= new Boleto[this.boletos.length];
        for(int i=0;i<boletos.length;i++){
            if(this.boletos[i].getAtrLocalidad()==localidad){
                
                bol[i]=this.boletos[i];
            } 
        }
        return bol;
        
    }
    
     public Boleto buscarAsiento(int asiento){
        for(int i=0;i<boletos.length;i++){
            if(boletos[i].getAtrAsiento()==asiento){
                
                return boletos[i];
            } 
        }
        return null;
        
    }
     
      public int numeroBoletosVendidos(){
          int total=0;
        for(int i=0;i<boletos.length;i++){
            if(boletos[i]!=null){
                total=total+1;
            }
        }
        return total;
        
    }
      
       public int numeroBoletosVendidosVip(){
          int total=0;
        for(int i=0;i<boletos.length;i++){
            if(boletos[i]!=null && boletos[i].getAtrLocalidad()=="vip"){
                total=total+1;
            }
        }
        return total;
        
    }
       
        public double totalDinero(){
          double total=0;
        for(int i=0;i<boletos.length;i++){
            if(boletos[i]!=null){
                
                total=total+boletos[i].getAtrTotal();
            }
        }
        return total;
        
    }
       
       
       
       
      
      
    
    
}
