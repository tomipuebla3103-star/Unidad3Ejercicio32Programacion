//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    CuentaCreador creador = new CuentaCreador(
            "Creador123", "creador@gmail.com", 1000, 50000, 20000
    );

    CuentaCorporativa empresa = new CuentaCorporativa(
            "EmpresaTech", "empresa@gmail.com", 5000, 5, "www.empresatech.com"
    );

    System.out.println("=== CUENTA CREADOR ===");
    creador.publicarContenido();
    creador.seguirUsuario();
    creador.mostrarDatos();

    System.out.println("\n=== CUENTA CORPORATIVA ===");
    empresa.publicarContenido();
    empresa.seguirUsuario();
    empresa.mostrarDatos();
}
