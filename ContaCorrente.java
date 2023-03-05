/**
 * ContaCorrente
 */
public class ContaCorrente {

    private double saldo;
    private int agencia;
    private int numeroConta;
    private String cliente;
    private String cpf;
    // Método construtor
    public ContaCorrente(int agencia, int numeroConta, String cliente, String cpf) {
        this.agencia = agencia;
        this.numeroConta = numeroConta;
        this.cliente = cliente;
        this.cpf = cpf;
        this.saldo = 0.0;
    }
    // Consulta saldo
    public double consultaSaldo(){
        return this.saldo;
    }
    // Depósito
    public double deposito(double valor){
        //Não faz sentido depositar valor negativo
        if (valor > 0.0) {
            this.saldo += valor;
        } else {
            System.out.println("Valor inválido para depósito!");
        }
        //depois de fazer um depósito, mostramos o saldo atualizado
        return this.saldo;
    }
    //Saque
    public double saque(double valor){
        //Não faz sentido sacar valor negativo
        if (valor > 0.0) {
            //Não podemos sacar o que não temos...
            if (valor <= this.saldo) {
                this.saldo -= valor;
            } else {
                System.out.println("Saldo insuficiente!");
            }
        } else {
            System.out.println("Valor inválido para saque!");
        }
        return this.saldo;
    }
    //Transferencia
    public double transferencia(double valor, ContaCorrente outraConta){
        //Retira o dinheiro da conta...
        this.saque(valor);
        //Deposita na outra conta
        outraConta.deposito(valor);
        return this.saldo;
    }
    
}