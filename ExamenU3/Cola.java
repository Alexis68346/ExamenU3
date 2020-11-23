package ExamenU3;
public class Cola {
    Nodo cimaVIp, RaizVIP;
    Nodo cimacomun, raizComun;
    Nodo[] ventanilla= new Nodo[3];
    
    int VIP, COMUN;
    
    public void Insertar(String cliente,int turno){
        if(cliente=="VIP"){
        Nodo nodoVIP= new Nodo( cliente, turno);
         if(RaizVIP==null){
         RaizVIP=nodoVIP;
         cimaVIp=nodoVIP;
         VIP++;
        }
         else{
        cimaVIp.Siguiente=nodoVIP;
        cimaVIp=nodoVIP;
        VIP++;
         }
    }
        else{
     Nodo nodoComun= new Nodo(cliente, turno);  
           if(raizComun==null){
         raizComun=nodoComun;
         cimacomun=nodoComun;         
         COMUN++;
        }
         else{
        cimacomun.Siguiente=nodoComun;
        cimacomun=nodoComun;
        COMUN++;
         }  
        }
    }
     public boolean VaciarVIP(){
        return RaizVIP==null;
    }
         public boolean VaciarComun(){
        return raizComun==null;
    }
    
 public void MostrarComun(){
      if(VaciarComun()){
            System.out.println("\nFila común:  ");
        }
        else{
        Nodo recorre=raizComun;
        System.out.print("\nFila en espera COMUN: ");
        
        
        while(recorre!=null){
            System.out.print(" "+recorre.cliente+""+recorre.num);
            recorre=recorre.Siguiente;}
        }
    }
 
  public void MostrarVIP(){
      if(VaciarVIP()){
            System.out.println("Fila VIP:  ");
        }
        else{
        Nodo recorre=RaizVIP;
        System.out.print("\nFila en espera VIP: ");
        while(recorre!=null){
            System.out.print(" "+recorre.cliente+""+recorre.num);
            recorre=recorre.Siguiente;}
        }
    }
  
 public void pasarAVentanilla(){
     if(VaciarVIP() && VaciarComun()){
         System.out.println("No hay clientes en espera.");
 }
     
     else{
         
    if(ventanilla[0]==null ||ventanilla[1]==null ||ventanilla[2]==null ) {   
    for(int i=0;i<3;i++){
       if(ventanilla[i]==null){
           
       if(RaizVIP!=null){
           
       ventanilla[i]=RaizVIP;
       int x=i+1;
       System.out.println("La Ventanilla "+x+" Esta ocupada con: "+ventanilla[i].cliente+ventanilla[i].num);
       if (ventanilla[i].Siguiente==null){ 
           RaizVIP=null;  
       }
       else{
       RaizVIP=ventanilla[i].Siguiente;
       }
       }
       
       else{
       if(raizComun!=null){ 
       ventanilla[i]=raizComun;
       int y=i+1;
       System.out.println("La Ventanilla "+y+" ESta ocupada con: "+ventanilla[i].cliente+ventanilla[i].num);
      
       if (ventanilla[i].Siguiente==null){ 
        raizComun=null;
       }
       
       else
       raizComun=ventanilla[i].Siguiente; 
       }       
       }
       
      }
    }
    }
    else{
        System.out.println("Las ventanillas estan ocupadas, desocupe una por favor. ");
    }
   }
 }
  
 public void terminarVentanilla(){
     

     if (ventanilla[0]==null&&ventanilla[1]==null&&ventanilla[2]==null){
         System.out.println("Las ventanillas estan desocupadas");
    }
     
     else{
               int num= (int)(Math.random()*3+0);

     if(ventanilla[num]!=null){
     ventanilla[num]=null;
     int num1=num+1;
     System.out.println("Se desocupo la ventanilla "+ num1);
     }
     else{
  
       terminarVentanilla();
       
     }
     }
     }
 }
