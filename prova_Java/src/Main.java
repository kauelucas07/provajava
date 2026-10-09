public class Main {

    public static void main(String[] args) {
        Motorista motoristaIniciante = new MotoristaIniciante("Ana Souza", "ABC1D23");
        Motorista motoristaPremium = new MotoristaPremium("Bruno Lima", "EFG4H56");
        Motorista motoristaFrotista = new MotoristaParceiroFrotista("Carlos Mendes", "IJK7L89");

        motoristaIniciante.registrarCorrida(80.0);
        motoristaIniciante.registrarCorrida(95.50);
        motoristaIniciante.registrarCorrida(70.0);

        motoristaPremium.registrarCorrida(120.0);
        motoristaPremium.registrarCorrida(150.0);
        motoristaPremium.registrarCorrida(200.0);
        motoristaPremium.registrarCorrida(90.0);

        motoristaFrotista.registrarCorrida(300.0);
        motoristaFrotista.registrarCorrida(450.0);
        motoristaFrotista.registrarCorrida(280.0);
        motoristaFrotista.registrarCorrida(500.0);
        motoristaFrotista.registrarCorrida(370.0);

        System.out.println("SISTEMA DE PAGAMENTO - UNI DIAS UP MOBILIDADE");
        System.out.println();

        motoristaIniciante.imprimirHolerite();
        motoristaPremium.imprimirHolerite();
        motoristaFrotista.imprimirHolerite();
    }
}
