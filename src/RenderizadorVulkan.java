public class RenderizadorVulkan extends  MotorGrafico{
    private boolean inicializado = false;

    @Override
    public void inicializarContexto() {
        this.inicializado = true;
        System.out.println("Instancia y dispositivos logicos creados.");
    }

    @Override
    public void dibujarMalla(String nombreMalla) {
        if (!inicializado) {
            throw new IllegalStateException(" Error: No se pueden enviar comandos a la cola sin inicializar Vulkan.");
        }
        System.out.println("Registrando y ejecutando comandos de dibujo para la malla: " + nombreMalla);
    }

    @Override
    public void liberarRecursos() {
        if (!inicializado) {
            System.out.println("Aviso: No hay dispositivos Vulkan para limpiar.");
            return;
        }
        this.inicializado = false;
        System.out.println("Dispositivos logicos y memoria Vulkan destruidos.");
    }
}
