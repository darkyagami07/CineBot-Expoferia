package interfaz;

import datos.GestorCatalogo;
import datos.GestorPersistencia;
import modelo.Usuario;
import reportes.EstadisticasServicio;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== INICIALIZANDO CINEBOT ===");

        // 1. Cargar Catálogo (Singleton)
        GestorCatalogo catalogo = GestorCatalogo.getInstancia();

        // 2. Simulamos registro de prueba con Try-Catch blindado
        try {
            Usuario u1 = new Usuario("Edward", "Masculino", 2004);
            u1.setPeliculaRecomendada("The Office");
            GestorPersistencia.registrarUsuario(u1);
        } catch (Exception e) {
            System.err.println("Error no controlado: " + e.getMessage());
        }

        // 3. Mostrar Reportes Estadísticos
        EstadisticasServicio.mostrarReporteGeneral();
    }
}