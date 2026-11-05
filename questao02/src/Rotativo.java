public class Rotativo implements PerfilTarifa {
    private static final double VALOR_HORA = 10.0;

    @Override
    public double calcularValor(int tempoEmMinutos) {
        if (tempoEmMinutos <= 0) {
            return 0.0;
        }
        int horas = (tempoEmMinutos + 59) / 60;
        return horas * VALOR_HORA;
    }
}