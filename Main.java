public class Main {
    public static void main(String[] args) {
        ContaEspecial conta1 = new ContaEspecial(1234,142536,"Francisco" , "135.792.468-00",1000.0);
        ContaCorrente conta2 = new ContaCorrente(1234, 142537, "Célia", "864.297.531-00");
        double saldoAtual;
        saldoAtual = conta1.deposito(5000.0);
        System.out.println("Francisco possui "+ saldoAtual + " após o depósito de R$5.000,00");
        saldoAtual = conta2.deposito(10000.0);
        System.out.println("Célia possui "+saldoAtual+" após o depósito de R$10.000,00");
        saldoAtual = conta2.saque(1000.0);
        System.out.println("Célia possui "+saldoAtual+" após o saque de R$1.000,00");
        saldoAtual = conta1.transferencia(2500.0, conta2);
        System.out.println("Francisco possui "+saldoAtual+" após transferir R$2.500,00");
        saldoAtual = conta2.consultaSaldo();
        System.out.println("Célia ficou com "+saldoAtual+" após receber transferencia.");        
        saldoAtual = conta1.saque(2501.0);
        System.out.println("Francisco tentou sacar R$2.501,00 e ficou com "+saldoAtual);
    }
    
}
