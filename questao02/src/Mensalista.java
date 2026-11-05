public class Mensalista implements PerfilTarifa {
    private static final double VALOR_FIXO = 250.0;

    @Override
    public double calcularValor(int tempoEmMinutos) {
        return VALOR_FIXO;
    }
}