
package miprimeraaplicacionjava;

public class CalculoInteresSimple {
    public static void main(String[] args) {
     
        //Declarando Variable
        double interes, capitalprestado, tiempo,tasadeintereses, tiempoenmeses;
        
        //Inicializar Variables
        
        interes = 144;
        capitalprestado = 1200.00;
        tasadeintereses = 0.08;
        
        // Uso de Variables
        
        tiempo = interes / (capitalprestado * tasadeintereses);
        tiempoenmeses = tiempo *12;
        
        System.out.println("Tiempo:" + tiempo + "años");
        System.out.println("Tiempo:" + tiempoenmeses + "meses");
        
    }
    
}
