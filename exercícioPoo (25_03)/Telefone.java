public class Telefone {
    private int ddd;
    private String numero;

    public int getDdd() {
        return ddd;
    }

    public void setDdd(int ddd) {
        this.ddd = ddd;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public void alterarNumero(String numero) {
        this.numero = numero;
    }

    public void alterarDdd(int ddd) {
        this.ddd = ddd;
    }
}