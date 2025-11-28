public class Agencia {

    private int numero;
    private int numeroConta;
    private String gerente;

    public Agencia(int numero, int numeroConta, String gerente) {
        this.numero = numero;
        this.numeroConta = numeroConta;
        this.gerente = gerente;
    }

    public int getNumero() {
        return numero;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public String getGerente() {
        return gerente;
    }

    @Override
    public String toString() {
        return String.format("Ag.: %d\nConta: %d\nGerente: %s",
                this.numero, this.numeroConta, this.gerente);
    }
}
