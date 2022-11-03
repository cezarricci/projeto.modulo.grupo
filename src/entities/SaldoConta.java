package entities;

import java.util.Objects;

public class SaldoConta {

    private double saldo;

    public SaldoConta() {
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        if (saldo > 0) {
            this.saldo = saldo;
        } else {
            System.out.println("Saldo precisa ser maior que zero");
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SaldoConta that = (SaldoConta) o;
        return Double.compare(that.saldo, saldo) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(saldo);
    }

    @Override
    public String toString() {
        return "SaldoConta{" +
                "saldo=" + saldo +
                '}';
    }

    public void deposito(double saldo) {
        this.saldo += saldo;
    }

    public void sacar(double saldo) {
        double novoSaldo = getSaldo() - saldo;
        if (novoSaldo < 0) {
            System.out.println("Operacao nao realizada! Saldo disponivel de: " + getSaldo());
        } else {
            setSaldo(novoSaldo);
        }
    }

}
