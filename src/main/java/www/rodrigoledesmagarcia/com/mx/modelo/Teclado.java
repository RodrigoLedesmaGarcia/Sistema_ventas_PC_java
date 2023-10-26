package www.rodrigoledesmagarcia.com.mx.modelo;

public class Teclado extends DispositivoEntrada{

    private final int idTeclado;
    private static int contadorTeclados;

    public Teclado(String tipoEntrada, String marca) {
        super(tipoEntrada, marca);
        this.idTeclado = ++contadorTeclados;
    }

    @Override
    public String toString() {
        return "Teclados" +
                "\nID Teclado: " + idTeclado +
                "\n"+super.toString();
    }
}
