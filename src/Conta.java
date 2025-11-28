import java.util.ArrayList;
import java.util.List;

public class Conta {

    private Cliente cliente;
    private Agencia agencia;
    private double saldo;
    private List<Operacao> operacoes;

    public Conta(String nomeCliente, String cpfCliente, String telefoneCliente, int numAgencia, int numConta, String gerente, double saldoInicial) {
        this.cliente = new Cliente(nomeCliente, cpfCliente, telefoneCliente);
        this.agencia = new Agencia(numAgencia, numConta, gerente);
        this.saldo = saldoInicial;
        this.operacoes = new ArrayList<>();
    }

    public Conta() {
        this(null, null, null, 0, 0, null, 0);
    }

    public void realizarOperacao(char tipo, int valor) {
        Operacao op = new Operacao(tipo, valor);
        this.operacoes.add(op);
        atualizarSaldo(tipo, valor);
    }

    private void atualizarSaldo(char tipo, int valor) {
        if (tipo == 'd')
            this.saldo += valor;
        else if(tipo == 's')
            this.saldo -= valor;
    }

    private String obterDadosCliente() {
        return this.cliente.toString();
    }

    private String obterDadosAgencia() {
        return this.agencia.toString() + String.format("\nSaldo: %.2f", this.saldo);
    }

    private String obterExtrato() {
        String dadosExtrato = "";
        for(Operacao op : this.operacoes) {
            dadosExtrato += op.toString() + "\n";
        }
        return dadosExtrato;
    }

    @Override
    public String toString() {
        return "-----CLIENTE-----\n" +
                obterDadosCliente() +
                "\n\n" +
                "-----CONTA-----\n" +
                obterDadosAgencia() +
                "\n\n" +
                "-----EXTRATO-----\n" +
                obterExtrato() +
                "\n";
    }
}
