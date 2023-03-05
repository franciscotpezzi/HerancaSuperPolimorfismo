/**
 * ContaEspecial
 */
class ContaEspecial extends ContaCorrente {
    private double limite;
    private double saldoDevedor;
    //método construtor
    public ContaEspecial(int agencia, int numeroConta, String cliente, String cpf, double limite){
        //invoca construtor da classe mãe:
        super(agencia,numeroConta,cliente,cpf);
        //realiza ações específicas de ContaEspecial:
        this.limite = limite;
        this.saldoDevedor = 0.0;
    }
    //Sobreposição do saque
    public double saque(double valor){
        double diferenca;
        //valor vai usar o limite?
        //então vamos mexer no saldo devedor
        if ((valor > this.consultaSaldo()) && (valor <= this.consultaSaldo()+(this.consultaLimite()))) {
            diferenca = valor - this.consultaSaldo();
            //usa o limite para tirar a diferença:
            this.saldoDevedor += diferenca;
            //atualiza o valor a ser sacado pelo saque normal:
            valor = this.consultaSaldo();
        }
        //chama o saque da conta corrente!
        return super.saque(valor);
    }
    //Consulta limite disponível
    public double consultaLimite(){
        if (this.consultaSaldo() >= 0.0) {
            return this.limite;
        } else {
            return this.limite + this.consultaSaldo();
        }
    }

    
}