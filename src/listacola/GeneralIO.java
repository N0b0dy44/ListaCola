package listacola;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GeneralIO {
    public static void imp(String mensaje){
        System.out.println(mensaje);
    }
    
    public static String lea(String mensaje){
        String dato = "";
        InputStreamReader objF = new InputStreamReader(System.in);
        BufferedReader objLeer = new BufferedReader(objF);
        try{
            imp(mensaje);
            dato = objLeer.readLine();
        }catch(IOException e){
            imp("Error de lectura" + e.getMessage());
        }
        return dato;
    }
}
