package listacola;

public class nodoEstudiante {
    private int codigo;
    private String nombre;
    private String programa;
    public nodoEstudiante liga;

    public nodoEstudiante(int codigo, String nombre, String programa) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.programa = programa;
        liga = null;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPrograma() {
        return programa;
    }

    public void setPrograma(String programa) {
        this.programa = programa;
    }
    
    
}
