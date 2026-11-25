
package com.mycompany.evaluacion_u2_modularidad_moyano_xiomara;

public class Moyano_PA_2 {
    static int pot(int b, int e) 
    { if (e == 0) return 1;
    
    return b * pot(b, e - 1); }
}


// 2. Haz la traza de pot(3, 4) mostrando la pila de llamadas y el valor que devuelve cada una
// 
