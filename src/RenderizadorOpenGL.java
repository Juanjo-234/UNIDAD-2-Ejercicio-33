public class RenderizadorOpenGL extends MotorGrafico{
    private boolean inicializado = false;

    @Override
    public void inicializarContexto() {
        this.inicializado = true;
        System.out.println("Contexto grafico iniciado con exito");
    }

    @Override
    public void dibujarMalla(String nombreMalla) {
        if(!inicializado){
            System.out.println("ERROR. El contexto no esta inicializado.");
        }
        System.out.println("Renderizado de contexto en pantalla: " + nombreMalla);
    }

    @Override
    public void liberarRecursos() {
        if(!inicializado){
            System.out.println("ERROR. No hay recursos activos para liberar espacios");
            return;
        }
        this.inicializado = false;
        System.out.println("Recursos de video liberados correctamente");
    }
}
