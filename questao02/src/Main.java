public class Main {
    public static void main(String[] args) {
        int tempoPermanencia = 120;

        PerfilTarifa rotativo = new Rotativo();
        PerfilTarifa mensalista = new Mensalista();
        PerfilTarifa conveniado = new Conveniado();

        Ticket ticket = new Ticket("XYZ-9876", tempoPermanencia, rotativo);

        System.out.println("Veículo: " + ticket.getPlaca() + " | Tempo: " + tempoPermanencia + " minutos");
        
        System.out.println("Cálculo com Perfil Rotativo: R$ " + ticket.calcularValor());

        ticket.setPerfil(mensalista);
        System.out.println("Cálculo com Perfil Mensalista: R$ " + ticket.calcularValor());

        ticket.setPerfil(conveniado);
        System.out.println("Cálculo com Perfil Conveniado: R$ " + ticket.calcularValor());
    }
}