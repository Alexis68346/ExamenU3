package ExamenU3;

import java.util.Scanner;

public class PrincipalMenu {
    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
     Cola cola =new Cola();
     int opc, opc2=0;
     int i=0;
     String []cliente={"VIP","COMUN"};
     
       do{ 
           
        System.out.println("\n-------Menu------"
                + "\n1.- Insertar nuevo cliente"
                + "\n2.- Pasar a ventanilla"
                + "\n3.- Mostrar cola"
                + "\n4.- Terminar una ventanilla"
                + "\n5.- Salir");
        opc=leer.nextInt();
        switch(opc){
            
            case 1:  
            
             if(i==0){
                 i=(int)(Math.random()*10+1);
             }   
             else{
                 i++;
             }
             int numero= (int)(Math.random()*2+0);
             if (numero==0){
                 cola.Insertar(cliente[0] , i);
                 System.out.println("Cliente: "+cliente[0] + i);
             }
             else{
                 cola.Insertar(cliente[1],i);
                 System.out.println("Cliente: "+cliente[1]+i);

             }
            
            break;
            case 2:
            cola.pasarAVentanilla();        
            break;
            case 3:   
            cola.MostrarVIP();
            cola.MostrarComun();
            break;
            case 4:
            cola.terminarVentanilla();
            
            
                break;
            case 5: 
                System.out.println("SALIENDO.....");
                System.exit(0);break;
            default:System.out.println("No existe esa opcion, por favor intente con una del menu");
        }
        
       }while(opc2!=5);

    }
    
}
