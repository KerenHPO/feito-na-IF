public class Principal {
	
    public static void main(String[] args) {
    	
    	NaveEspacial[] vetorNaveEspacial = new NaveEspacial[50];
    	
        while (true) {
        	
        System.out.println("Escolha o tipo de nave:");
        System.out.println("1 - Nave de combate");
        System.out.println("2 - Nave de carga");
        System.out.println("3 - Nave de passageiros");
        System.out.println("4 - Sair do sistema");


        	
        int escolha = Teclado.lerInteiro("Digite o número correspondente:");

        switch (escolha) {
            case 1:
           	 for(int i = 0; i < vetorNaveEspacial.length; i++) {
                String nomeNaveCombate = Teclado.lerString("Criando uma Nave de combate: \nNome: ");            
                double velocidadeMaximaNaveCombate = Teclado.lerDouble("Velocidade Máxima (km/h): ");     
                int tripulantesNaveCombate = Teclado.lerInteiro("Número de Tripulantes: ");
                double combustivelNaveCombate = Teclado.lerDouble("Combustível (litros): ");
                double capacidadeCargaNaveCombate = Teclado.lerDouble("Capacidade de Carga (toneladas): ");
                
                NaveCombate criarNaveCombate = new NaveCombate(nomeNaveCombate, velocidadeMaximaNaveCombate, tripulantesNaveCombate,
                        combustivelNaveCombate);
           	 }
                break;
            case 2:
            	 
                String nomeNaveCarga = Teclado.lerString("Criando uma Nave de Carga: \nNome: ");            
                double velocidadeMaximaNaveCarga = Teclado.lerDouble("Velocidade Máxima (km/h): ");     
                int tripulantesNaveCarga = Teclado.lerInteiro("Número de Tripulantes: ");
                double combustivelNaveCarga = Teclado.lerDouble("Combustível (litros): ");
                double capacidadeCargaNaveCarga = Teclado.lerDouble("Capacidade de Carga (toneladas): ");
                
                NaveCarga criarNaveCarga = new NaveCarga(nomeNaveCarga, velocidadeMaximaNaveCarga, tripulantesNaveCarga,
                        combustivelNaveCarga, capacidadeCargaNaveCarga);
                break;
            case 3:
           	 
                String nomeNavePassageiros = Teclado.lerString("Criando uma Nave de Passageiros: \nNome: ");            
                double velocidadeMaximaNavePassageiros = Teclado.lerDouble("Velocidade Máxima (km/h): ");     
                int tripulantesNavePassageiros = Teclado.lerInteiro("Número de Tripulantes: ");
                double combustivelNavePassageiros = Teclado.lerDouble("Combustível (litros): ");
                double capacidadeCargaNavePassageiros = Teclado.lerDouble("Capacidade de Carga (toneladas): ");
                
                NavePassageiros criarNavePassageiros = new NavePassageiros(nomeNavePassageiros, velocidadeMaximaNavePassageiros, tripulantesNavePassageiros,
                        combustivelNavePassageiros);
                
                break;
            case 4:
            	System.exit(escolha);
            	break;
            	
            default:
                System.out.println("Opção inválida. Encerrando o programa.");
                return;
        }
        
    }
    

    private static NaveEspacial criarNaveEspacial() {
        // Implemente aqui a lógica para obter informações da NaveEspacial do usuário
    	System.out.println("Nave combate Padrão");
        return new NaveCombate();
    }

    private static NaveEspacial criarNaveCarga() {
        // Implemente aqui a lógica para obter informações da NaveCarga do usuário
        return new NaveCarga("Nave de Carga Padrão", 4000, 8, 800, 2000);
    }

    private static NaveEspacial criarNavePassageiros() {
        // Implemente aqui a lógica para obter informações da NavePassageiros do usuário
        return new NavePassageiros("Nave de Passageiros Padrão", 6000, 12, 1200, 50);
    }

    private static void interagirComNave(NaveEspacial nave) {
        // Implemente aqui a lógica de interação com a nave escolhida
        System.out.println("Interagindo com a nave:");
        System.out.println(nave.toString());

        // Exemplo de interação:
        nave.abastecer(200);
        nave.acelerar(50);
        nave.viajar(500);
        
      
            // Implemente aqui a interação do usuário para criar e interagir com as naves espaciais.

            // Exemplo de criação de uma NaveCarga
            

            // Implemente a interação do usuário para realizar ações na nave, como abastecer, viajar, carregar, embarcar passageiros e atacar (dependendo do tipo de nave).
            // ...
        }
    }
}
