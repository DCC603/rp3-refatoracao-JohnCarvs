public class Operacao {

    private TipoOperacao tipo;
    private double valor;

    public Operacao(char tipo, double valor) {
        this.tipo = TipoOperacao.fromCodigo(tipo);
        this.valor = valor;
    }

    public TipoOperacao getTipo() {
        return this.tipo;
    }

    public double getValor() {
        return this.valor;
    }

    @Override
    public String toString() {
        return this.tipo.getDescricao() + ":\t" + this.valor;
    }
}
