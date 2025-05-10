package listacola;

public class ManejoCola {
    static nodoEstudiante cabeza = null;
    
    public static boolean vacio(){
        return cabeza == null;
    }
    public static void encolar(nodoEstudiante objNuevo){
        if (vacio()) {
            cabeza = objNuevo;
            cabeza.liga = null;
        }else{
            nodoEstudiante aux = cabeza;
            while(aux.liga != null){
                aux = aux.liga;
            }
            aux.liga = objNuevo;
            objNuevo.liga = null;
        }
    }
    public static void imp(){
        if (vacio()) {
            GeneralIO.imp("Cola vacía");
        }else{
            nodoEstudiante aux = cabeza;
            while(aux != null){
                GeneralIO.imp("Estudiante: " + aux.getCodigo() + " ," + aux.getNombre()
                        + " ," + aux.getPrograma());
                aux = aux.liga;
            }
        }
    }
    public static void desencolar(){
        if (vacio()) {
            GeneralIO.imp("cola vacía");
        }else{
            cabeza = cabeza.liga;
        }
    }
}
