package Resposta03;

public class ContaCorrente {
    String agencia = "057";
    String numeroDaConta = "256";
    double saldo ;
    double limiteDeCredito;

    public ContaCorrente(){
        this.agencia = agencia;
        this.numeroDaConta = numeroDaConta;
        this.saldo = saldo;
        this.limiteDeCredito = limiteDeCredito;
        this.agenciaNumeroConta = agenciaNumeroConta;
    }
    String agenciaNumeroConta= "";

    public String agenciaNumeroConta(){
        agenciaNumeroConta = agencia + numeroDaConta;
        return agenciaNumeroConta;
    }
    public double saldoTotalConta(double saldo,double limiteDeCredito){
        double totalValor = 0;
        totalValor = saldo + limiteDeCredito;
        return totalValor;
    }
}

