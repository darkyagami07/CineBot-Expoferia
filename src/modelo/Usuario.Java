package modelo;

public class Usuario {

    private String nombre;
    private String genero;
    private int añoNacimiento;
    private String peliculaRecomendada;

    public Usuario(String nombre, String genero, int añoNacimiento) {
        this.nombre = nombre;
        this.genero = genero;
        this.añoNacimiento = añoNacimiento;
        this.peliculaRecomendada = "";
    }

    public String getNombre() { return nombre; }
    public String getGenero() { return genero; }
    public int getAñoNacimiento() { return añoNacimiento; }
    public String getPeliculaRecomendada() { return peliculaRecomendada; }
    
    public void setPeliculaRecomendada(String peliculaRecomendada) {
        this.peliculaRecomendada = peliculaRecomendada;
    }

    public int getEdad(int añoActual) {
        return añoActual - this.añoNacimiento;
    }

}
