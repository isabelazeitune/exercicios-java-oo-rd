package exercicio02;

public abstract class Funcionario {

    // TODO: implemente o código desta classe
    private String nome;
    private float salarioMensal;

    public Funcionario(String nome, float salarioMensal) {
        this.nome = nome;
        this.salarioMensal = salarioMensal;
    }

    public float salarioAnual(float salarioMensal) {
        return salarioMensal * 13;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getSalarioMensal() {
        return salarioMensal;
    }

    public void setSalarioMensal(float salarioMensal) {
        this.salarioMensal = salarioMensal;
    }
}
