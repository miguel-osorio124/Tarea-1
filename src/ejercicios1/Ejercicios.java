/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios1;

/**
 *
 * @author turupawn
 */
public class Ejercicios {

    static int sumar(int x, int y) {
        int r1 = x + y;
        return r1;
    }

    static int restar(int x, int y) {
        int r2 = x - y;
        return r2;
    }

    static int multiplicar(int x, int y) {
        int r3 = x * y;
        return r3;
    }

    static int residuo(int x, int y) {
        int r4 = x % y;
        return r4;
    }

    static boolean esPar(int x) {
        boolean r5;
        if (x % 2 == 0) {
            r5 = true;
        } else {
            r5 = false;
        }
        return r5;
        /*
        if(x%2==0)
        return true;
        return false;
         */

    }

    static boolean esMultiploDe3(int x) {
        boolean r6;
        if (x % 3 == 0) {
            r6 = true;
        } else {
            r6 = false;
        }
        return r6;

    }

    static int getMayor(int x, int y) {
        if (x > y) {
            return x;
        } else {
            return y;
        }
    }

    static boolean esMayorDeEdad(int edad) {
        boolean r7;
        if (edad >= 18) {
            r7 = true;
        } else {
            r7 = false;
        }
        return r7;
    }

    static boolean sonPares(int x, int y, int z) {
        boolean r8;
        if (x % 2 == 0 & y % 2 == 0 & z % 2 == 0) {
            r8 = true;
        } else {
            r8 = false;
        }
        return r8;
        /*
        boolean respuesta= true;
        if(x%2!=0)
        respuesta=false;
        if(y%2!=0)
        respuesta=false;
        if(z%2!=0)
        respuesta=false;
        return respuesta;
         */
    }

    static int getMayorDe3(int x, int y, int z) {
        /*
        if(x>y&x>z)
            return x;
        if(y>x&y>z)
            return y;
        if(z>x&z>y)
            return z;
        return -1;
         */
        int r9;
        if (x > y && x > z) {
            r9 = x;
        } else if (y > z) {
            r9 = y;
        } else {
            r9 = z;
        }
        return r9;

    }

}
