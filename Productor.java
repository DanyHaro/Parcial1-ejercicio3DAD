package ejercicio3;

public class Productor implements Runnable {
	
	Cola colaCompartida;
	Utilidades utilidades;
	
	
    public Productor(Cola cola){
            this.colaCompartida=cola;
    }
    public void run() {
       while (true){
               int num=utilidades.numAzar(10);
               while (colaCompartida.encolar(num)==false){
                       //Utilidades.esperarTiempoAzar(3000);
            	   		System.out.println("HOLAAAA");
               } /*Fin del while*/

               System.out.println("Productor encoló el numero:"+num);
       } /*Fin del while externo*/
    } /*Fin de run()*/
}
