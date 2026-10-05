//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    MotorGrafico motor = new RenderizadorVulkan();
  try {
      motor.inicializarContexto();
      motor.dibujarMalla("Cubo3D");
      motor.dibujarMalla("Esfera3D");
      motor.liberarRecursos();

      System.out.println("\n--- Probando validación de error ---");

      motor.dibujarMalla("Piramide3D");
  } catch (IllegalStateException e) {
      System.err.println(e.getMessage());
  }
}

