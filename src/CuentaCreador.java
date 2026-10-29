public class CuentaCreador extends CuentaSocial{
    private double ingresosPublicidad;
    private int visualizaciones;

    public CuentaCreador(String username, String email, int seguidores, double ingresosPublicidad, int visualizaciones) {
        super(username, email, seguidores);
        this.ingresosPublicidad = ingresosPublicidad;
        this.visualizaciones = visualizaciones;
    }

    @Override
    public double calcularImpacto() {
        return seguidores + visualizaciones * 0.1;
    }

    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Ingresos por publicidad: $" + ingresosPublicidad);
        System.out.println("Visualizaciones: " + visualizaciones);
    }
}
