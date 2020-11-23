package ExamenU3;

public class Nodo {
    
    String cliente;
    Nodo Siguiente;
    int num;
    public  Nodo (String cliente, int numero){
        this.num=numero;
        this.cliente=cliente;
        Siguiente=null;
}
}
