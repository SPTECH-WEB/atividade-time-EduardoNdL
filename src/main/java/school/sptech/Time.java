package school.sptech;

public class Time {
    String nome;
    Integer vitorias, empates, derrotas;

    public Time () {
        vitorias = 0;
        empates = 0;
        derrotas = 0;
    }

    public void registrarVitoria() {
        vitorias++;
    }
    public void registrarEmpate() {
        empates++;
    }
    public void registrarDerrota() {
        derrotas++;
    }
    public Integer getPontos(){
        Integer pontos = 0;
        for(int i = 0; i < vitorias; i++) {
            pontos += 3;
        }
        for(int i = 0; i < empates; i++) {
            pontos ++;
        }
        return pontos;
    }

    public Integer getTotalPartidas(){
        Integer partidas = 0;
        partidas += vitorias;
        partidas += empates;
        partidas += derrotas;

        return partidas;
    }

    public Integer getAproveitamento(){
        Integer partidas = getTotalPartidas();
        double aproveitamento = ((double) vitorias / (partidas) * 100);
        return (int) aproveitamento;
    }

    public void compararAproveitamento (Time adversario){
        String melhorTime = null;
        int partidasAdversario = adversario.getAproveitamento();
        int partidasTime = getAproveitamento();
        if(partidasAdversario > partidasTime) {
            melhorTime = nome;
        } else {
            melhorTime = adversario.nome;
        }
        System.out.println("O time " + melhorTime + " teve o melhor aproveitamento.");
    }

    public void exibirInformacoes(){
        System.out.println("Time: " + nome);
        System.out.println("Vitórias: " + vitorias);
        System.out.println("Empates: " + empates);
        System.out.println("Derrotas: " + derrotas);
    }
}
