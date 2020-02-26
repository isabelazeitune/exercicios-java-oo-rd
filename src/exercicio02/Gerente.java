package exercicio02;

public class Gerente extends Funcionario {

    // TODO: implemente o código desta classe

    private float percentualDoBonusAnual;

    public Gerente(String nome, float salarioMensal, float percentualDoBonusAnual) {
        super(nome, salarioMensal);
        this.percentualDoBonusAnual = percentualDoBonusAnual;
    }

    public float salarioAnual(float salarioMensal) {
        float bonusAnualVariavel = salarioMensal * percentualDoBonusAnual;
        return salarioMensal * 13 + bonusAnualVariavel;
    }
}