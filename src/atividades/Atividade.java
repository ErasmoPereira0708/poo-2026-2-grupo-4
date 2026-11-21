package atividades;

public abstract class Atividade {

    private int codigo;
    private String nome;
    protected final double valorBase;

    protected Atividade(int codigo, String nome, double valorBase) {
        this.codigo = codigo;
        this.nome = nome;
        this.valorBase = valorBase;
    }

    public int getCodigo() {
        return this.codigo;
    }

    public String getNome() {
        return this.nome;
    }

    public abstract double calcularMensalidade();
}
