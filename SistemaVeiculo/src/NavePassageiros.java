public class NavePassageiros extends NaveEspacial {
	
    private int numeroPassageiros;

    public NavePassageiros(String nome, double velocidadeMaxima, int numeroTripulantes, double combustivel, int numeroPassageiros) {
        super(nome, velocidadeMaxima, numeroTripulantes, combustivel);
        this.numeroPassageiros = numeroPassageiros;
    }

    public void embarcar(int passageiros) {
        // Implementação do embarque de passageiros
    }

    @Override
    public String toString() {
        // Implementação do método toString() para NavePassageiros
        return null;  // substitua isso pela implementação adequada
    }
}