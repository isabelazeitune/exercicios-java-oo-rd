package exercicio02;

public class AuxiliarEscritorio extends Funcionario{

    // TODO: implemente o código desta classe
    private float bonusAnual;

    public AuxiliarEscritorio(String nome, float salarioMensal, float bonusAnual) {
        super(nome, salarioMensal);
        this.bonusAnual = bonusAnual;
    }

    public float salarioAnual(float salarioMensal, float bonusAnual) {
        return salarioMensal*13 + bonusAnual;
    }
}