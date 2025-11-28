public enum TipoOperacao {
    DEPOSITO('d', "Depósito"),
    SAQUE('s', "Saque");

    private char codigo;
    private String descricao;

    TipoOperacao(char codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }

    public char getCodigo() {
        return codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public static TipoOperacao fromCodigo(char codigo) {
        for (TipoOperacao tipo : TipoOperacao.values()) {
            if (tipo.codigo == codigo) {
                return tipo;
            }
        }
        throw new IllegalArgumentException("Código de operação inválido: " + codigo);
    }
}
