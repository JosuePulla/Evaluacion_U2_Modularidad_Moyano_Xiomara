
package com.mycompany.evaluacion_u2_modularidad_moyano_xiomara;

public class Moyano_PA_3 {
  static void m(int a, int[] v) { 

a++; v[1] += a; }

public static void main(String[] arg) {
    
    int a = 5; 
    int[] v = {1, 2, 3}; 
    m (a, v); 
    System.out.println(a + " " + v[1]);

}
 }

// ¿Qué imprime? Explica por qué a no cambia y v[1] sí.
//  5 8 -  no cambia a porque es la variable y se mantiene . v[1] este cambia porque le suma 3
    
