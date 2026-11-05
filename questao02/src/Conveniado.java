public class Conveniado implements PerfilTarifa {
    private static final double VALOR_HORA = 10.0;
    private static final double DESCONTO_PERCENTUAL = 0.20;

    @Override
    public double calcularValor(int tempoEmMinutos) {
        if (tempoEmMinutos <= 30) {
            return 0.0;
        }
        int tempoCobrado = tempoEmMinutos - 30;
        int horas = (tempoCobrado + 59) / 60;
        double valorBruto = horas * VALOR_HORA;
        return valorBruto * (1.0 - DESCONTO_PERCENTUAL);
    }
}