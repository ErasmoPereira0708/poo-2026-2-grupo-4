package atividades;

public class Musculacao extends Atividade {

    private static final double MULTIPLICADOR = 1.0;

    public Musculacao(int codigo, String nome, double valorBase) {
        super(codigo, nome, valorBase);
    }

    @Override
    public double calcularMensalidade() {
        return super.valorBase * MULTIPLICADOR;
    }
}
