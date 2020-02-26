package exercicio02;

public class TecnicoManutencao extends Funcionario {

    // TODO: implemente o código desta classe

    private float percentualSobreOSalario;

    public TecnicoManutencao(String nome, float salarioMensal, float percentualSobreOSalario) {
        super(nome, salarioMensal);
        this.percentualSobreOSalario = percentualSobreOSalario;
    }

    public float salarioAnual(float salarioMensal, float bonusAnualFixo) {
        float adicionalDeInsalubridade = salarioMensal * this.percentualSobreOSalario;
        return (salarioMensal + adicionalDeInsalubridade) * 13 + bonusAnualFixo;
    }
}