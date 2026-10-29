public class CuentaSocial {
    protected String username;
    protected String email;
    protected int seguidores;

    public CuentaSocial(String username, String email, int seguidores) {
        this.username = username;
        this.email = email;
        this.seguidores = seguidores;
    }

    public void publicarContenido() {
        System.out.println(username + " publico contenido.");
    }

    public void seguirUsuario() {
        seguidores++;
        System.out.println("Nuevo seguidor de " + username);
    }

    public double calcularImpacto() {
        return seguidores * 0.5;
    }

    public void mostrarDatos() {
        System.out.println("Usuario: " + username);
        System.out.println("Email: " + email);
        System.out.println("Seguidores: " + seguidores);
        System.out.println("Impacto: " + calcularImpacto());
    }
}
