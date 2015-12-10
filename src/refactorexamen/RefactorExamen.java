/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package refactorexamen;

/**
 *
 * @author epastorizalorenzo
 */
public class RefactorExamen {

    /**
     * @param args the command line arguments
     */
    public static boolean resultado = false;
    public static void main(String[] args) {
        {
        int digitos=introducirNumDigitos();
        if(digitos<=0)
        System.out.println("Ingrese como parámetro, un numero de digitos correcto (mayor que 0): ");
        for(int i = 1; i <= 99999; i++ )
        {
            int auxiliar = i;
 
            int contador=numContador(auxiliar);
        numeroDigitos=contador;
            
            
            if(numeroDigitos==digitos){
                   if (i < 4) resultado = true;
            else
            {
            if (i % 2 == 0) resultado = false; 
                else
                {
                    int contador1 = 0;  
                    int i1 = 1; 
                    int k = (i - 1) / 2; 
                    if  (k % 2 == 0) k--;  
             
                    while(i1 <= k)
                    {
                        if (i % i1 == 0) contador1++;
                            i1 += 2;
                            if (contador1 == 2) i1 = k + 1;
                    }
 
        if (contador1 == 1) resultado = true;
            } 
        } 
     
                    resultado(i);    
            }
        }
        }
 
       
 
}

    public static void resultado(int i) {
        if (resultado == true)
            System.out.println(i);
    }

    public static int numContador(int auxiliar) {
        int contador=0;
        while (auxiliar != 0)
        {
            auxiliar = auxiliar / 10;
            contador++;
        }
        return contador;
    }

    public static int introducirNumDigitos() {
        int digitos=3;
        int numeroDigitos=0;
        return digitos;
    }
    }
    

