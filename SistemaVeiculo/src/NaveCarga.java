public class NaveCarga extends NaveEspacial {
	
    private double capacidadeCarga;

    public NaveCarga(String nome, double velocidadeMaxima, int numeroTripulantes, double combustivel, double capacidadeCarga) {
        super(nome, velocidadeMaxima, numeroTripulantes, combustivel);
        this.capacidadeCarga = capacidadeCarga;
    }

    public void carregar(double carga) {
        // Implementação do carregamento de carga
    }
    
    
    
    @Override
    public String toString() {
        // Implementação do método toString() para NaveCarga
        return null;  // substitua isso pela implementação adequada
    }
        
        

    }