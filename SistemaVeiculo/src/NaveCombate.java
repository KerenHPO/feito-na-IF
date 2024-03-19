public class NaveCombate extends NaveEspacial {
	
    private String armamento;

    public NaveCombate(String nome, double velocidadeMaxima, int numeroTripulantes, double combustivel, String armamento) {
        super(nome, velocidadeMaxima, numeroTripulantes, combustivel);
        this.armamento = armamento;
    }

    public void atacar() {
        // Implementação do ataque
    }

    @Override
    public String toString() {
        // Implementação do método toString() para NaveCombate
        return null;  // substitua isso pela implementação adequada
    }
}