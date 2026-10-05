public class RenderizadorDirectX extends  MotorGrafico{
    private boolean inicializado = false;

    @Override
    public void inicializarContexto() {
        this.inicializado = true;
        System.out.println(" Dispositivo y contexto creados correctamente.");
    }

    @Override
    public void dibujarMalla(String nombreMalla) {
        if (!inicializado) {
            throw new IllegalStateException(" Error: Intento de dibujo sin un contexto DirectX activo.");
        }
        System.out.println(" Dibujando geometría: " + nombreMalla);
    }

    @Override
    public void liberarRecursos() {
        if (!inicializado) {
            System.out.println(" Aviso: El dispositivo ya estaba liberado.");
            return;
        }
        this.inicializado = false;
        System.out.println(" Interfaz gráfica y buffers liberados.");
    }
}
