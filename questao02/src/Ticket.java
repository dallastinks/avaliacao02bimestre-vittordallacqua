public class Ticket {
    private String placa;
    private int tempoEmMinutos;
    private PerfilTarifa perfil;

    public Ticket(String placa, int tempoEmMinutos, PerfilTarifa perfil) {
        this.placa = placa;
        this.tempoEmMinutos = tempoEmMinutos;
        this.perfil = perfil;
    }

    public void setPerfil(PerfilTarifa perfil) {
        this.perfil = perfil;
    }

    public double calcularValor() {
        return perfil.calcularValor(tempoEmMinutos);
    }

    public String getPlaca() {
        return placa;
    }

    public int getTempoEmMinutos() {
        return tempoEmMinutos;
    }

    public void setTempoEmMinutos(int tempoEmMinutos) {
        this.tempoEmMinutos = tempoEmMinutos;
    }
}