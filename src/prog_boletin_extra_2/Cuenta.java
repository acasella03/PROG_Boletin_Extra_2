package prog_boletin_extra_2;

public class Cuenta {

    private String nombreCliente;
    private String numeroCuenta;
    private double tipoInteres;
    private double saldo;

    public Cuenta() {
    }

    public Cuenta(String nomCliente, String numCuenta, double tipoInteres, double saldo) {
        nombreCliente = nomCliente;
        numeroCuenta = numCuenta;
        this.tipoInteres = tipoInteres;
        this.saldo = saldo;
    }

    public void setNombre(String nomCliente) {
        nombreCliente = nomCliente;
    }

    public String getNombre() {
        return nombreCliente;
    }

    public void setCuenta(String numCuenta) {
        numeroCuenta = numCuenta;
    }

    public String getCuenta() {
        return numeroCuenta;
    }

    public void setInteres(double interes) {
        tipoInteres = interes;
    }

    public double getInteres() {
        return tipoInteres;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void ingreso(double ingreso) {
        saldo = saldo + ingreso;
    }

    public void reintegro(double reintegro) {
        saldo = saldo - Math.max(0, reintegro);
            }
    
    public void transferencia(Cuenta cuentaDestino, double importe){
        this.reintegro(importe);
        cuentaDestino.ingreso(importe);        
    }
}
