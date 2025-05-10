package listacola;

public class ListaCola {

    public static void main(String[] args) {
        int op = 0;
        do {
            op = Integer.parseInt(GeneralIO.lea("Menú\n"
                    + "1. Ingresar estudiante\n"
                    + "2. Eliminar estudiante\n"
                    + "3. Imprimir estudiantes\n"
                    + "0. Salir del programa"));
            switch (op) {
                case 1:
                    int cod = Integer.parseInt(GeneralIO.lea("Digite el código: "));
                    String nom = GeneralIO.lea("Digite el nombre: ");
                    String prog = GeneralIO.lea("Ingrese el programa: ");
                    nodoEstudiante objNuevo = new nodoEstudiante(cod, nom, prog);
                    ManejoCola.encolar(objNuevo);
                    break;
                case 2:
                    ManejoCola.desencolar();
                    break;
                case 3:
                    ManejoCola.imp();
                    break;
                case 0:
                    GeneralIO.imp("Saliendo...");
                    break;
                default:
                    GeneralIO.imp("Error de lectura...");
            }
        } while (op != 0);

    }

}
