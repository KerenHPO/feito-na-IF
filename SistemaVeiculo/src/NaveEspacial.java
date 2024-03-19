public abstract class NaveEspacial {
    protected String nome;
    protected double velocidadeMaxima;
    protected int numeroTripulantes;
    protected double combustivel;

    public NaveEspacial(String nome, double velocidadeMaxima, int numeroTripulantes, double combustivel) {
        this.nome = nome;
        this.velocidadeMaxima = velocidadeMaxima;
        this.numeroTripulantes = numeroTripulantes;
        this.combustivel = combustivel;
    }

    public void acelerar(double velocidade) {
        // Implementação padrão para acelerar
        this.velocidadeMaxima += velocidade;
    }

    public void desacelerar(double velocidade) {
        // Implementação padrão para desacelerar
        this.velocidadeMaxima -= velocidade;
    }

    public void abastecer(double litros) {
        // Implementação padrão para abastecer
        this.combustivel += litros;
    }

    public void viajar(double distancia) {
        // Implementação padrão para viajar
        double consumo = distancia / 10;  // Ajuste conforme necessário
        this.combustivel -= consumo;
    }

    @Override
    public String toString() {
        // Implementação padrão para toString
        return "NaveEspacial{" +
                "nome='" + nome + '\'' +
                ", velocidadeMaxima=" + velocidadeMaxima +
                ", numeroTripulantes=" + numeroTripulantes +
                ", combustivel=" + combustivel +
                '}';
    }
}
