import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) {
        selecaoCandidatos();
    }

    static void selecaoCandidatos() {
        String[] candidatos = {"Felipe", "Marcia", "Julia", "Paulo", "Augusto", "Monica", "Fabricio", "Mirela", "Daniela"};
        int candidatosSelecionados = 0;
        double salarioBase = 2000.0;

        while (candidatosSelecionados < 5 && candidatosSelecionados < candidatos.length) {
            String candidato = candidatos[candidatosSelecionados];
            double salarioPretendido = valorPretendido();

            System.out.println("O candidato " + candidato + " solicitou este valor de salário " + salarioPretendido);

            if (salarioBase >= salarioPretendido) {
                System.out.println("Ligar candidato");
            } else {
                System.out.println("Aguardando demais candidatos");
            }

            candidatosSelecionados++;
        }
    }

    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }
}
