import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Classe Pergunta
class Pergunta {
    private String pergunta;
    private String resposta;

    public Pergunta(String pergunta, String resposta) {
        this.pergunta = pergunta;
        this.resposta = resposta;
    }

    public String getPergunta() {
        return pergunta;
    }

    public String getResposta() {
        return resposta;
    }

    public boolean verificarResposta(String respostaUsuario) {
        return respostaUsuario.equalsIgnoreCase(resposta);
    }
}

// Classe Jogo
public class Jogo {
    private List<Pergunta> perguntas;
    private int acertos;
    private int erros;

    public Jogo() {
        this.perguntas = new ArrayList<>();
        this.acertos = 0;
        this.erros = 0;
        adicionarPerguntas();
    }

    // Método para adicionar perguntas
    private void adicionarPerguntas() {
        perguntas.add(new Pergunta("Quem foi o primeiro homem?", "Adão"));
        perguntas.add(new Pergunta("Quem foi o líder dos israelitas durante a saída do Egito?", "Moisés"));
        perguntas.add(new Pergunta("Qual é o nome do livro que narra a criação do mundo?", "Gênesis"));
        perguntas.add(new Pergunta("Quem foi o rei que construiu o Templo de Jerusalém?", "Salomão"));
        perguntas.add(new Pergunta("Qual é o nome da montanha onde Moisés recebeu os Dez Mandamentos?", "Monte Sinai"));
        perguntas.add(new Pergunta("Quem foi o profeta que foi engolido por um grande peixe?", "Jonas"));
        perguntas.add(new Pergunta("Qual é o nome do livro que contém as profecias sobre o Messias?", "Isaías"));
        perguntas.add(new Pergunta("Quem foi a mulher que ajudou os israelitas a escapar dos midianitas?", "Débora"));
        perguntas.add(new Pergunta("Qual é o nome do rei que derrotou os filisteus e matou Golias?", "Davi"));
        perguntas.add(new Pergunta("Quem foi o apóstolo que traiu Jesus?", "Judas"));
        perguntas.add(new Pergunta("Quem foi o patriarca que teve 12 filhos?", "Jacó"));
        perguntas.add(new Pergunta("Qual é o nome da cidade que foi destruída por causa da maldade de seus habitantes?", "Sodoma"));
        perguntas.add(new Pergunta("Quem foi o profeta que foi levado ao céu em um carro de fogo?", "Elias"));
        perguntas.add(new Pergunta("Qual é o nome do livro que narra a história dos reis de Israel?", "1 Reis"));
        perguntas.add(new Pergunta("Quem foi o rei que foi castigado por Deus por causa de seu orgulho?", "Nabucodonosor"));
        perguntas.add(new Pergunta("Qual é o nome da mulher que foi a mãe de Jesus?", "Maria"));
        perguntas.add(new Pergunta("Quem foi o apóstolo que negou Jesus três vezes?", "Pedro"));
        perguntas.add(new Pergunta("Qual é o nome do livro que contém as cartas de Paulo?", "Romanos"));
        perguntas.add(new Pergunta("Quem foi o homem que foi justificado pela fé?", "Abraão"));
        perguntas.add(new Pergunta("Qual é o nome da cidade que é considerada a cidade santa?", "Jerusalém"));
    }

    // Método para jogar
    public void jogar() {
        Scanner scanner = new Scanner(System.in);
        for (Pergunta pergunta : perguntas) {
            System.out.println(pergunta.getPergunta());
            String respostaUsuario = scanner.nextLine();
            if (pergunta.verificarResposta(respostaUsuario)) {
                System.out.println("Resposta certa!");
                acertos++;
            } else {
                System.out.println("Resposta errada! A resposta certa é " + pergunta.getResposta());
                erros++;
            }
        }
        System.out.println("Jogo finalizado. Acertos: " + acertos + ", Erros: " + erros);
    }

    // Método main
    public static void main(String[] args) {
        Jogo jogo = new Jogo();
        jogo.jogar();
    }
}
