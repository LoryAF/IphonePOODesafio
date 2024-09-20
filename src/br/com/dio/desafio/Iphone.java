package br.com.dio.desafio;

public class Iphone {
    private ReprodutorMusical reprodutorMusical;
    private AparelhoTelefonico aparelhoTelefonico;
    private NavegadorInternet navegadorInternet;

    public Iphone() {
        this.reprodutorMusical = new ReprodutorMusical();
        this.aparelhoTelefonico = new AparelhoTelefonico();
        this.navegadorInternet = new NavegadorInternet();
    }

    public static void main(String[] args) {
        // Criando uma instância do iPhone
        Iphone meuIphone = new Iphone();

        // Usando o Reprodutor Musical
        System.out.println("Reprodutor Musical");
        meuIphone.reprodutorMusical.selecionarMusica("Minha Música Favorita");
        meuIphone.reprodutorMusical.tocar();
        meuIphone.reprodutorMusical.pausar();

        // Usando o Aparelho Telefônico
        System.out.println("\nAparelho Telefônico");
        meuIphone.aparelhoTelefonico.ligar("123456789");
        meuIphone.aparelhoTelefonico.atender();
        meuIphone.aparelhoTelefonico.iniciarCorreioVoz();

        // Usando o Navegador Internet
        System.out.println("\nNavegador na Internet");
        meuIphone.navegadorInternet.exibirPagina("https://www.example.com");
        meuIphone.navegadorInternet.adicionarNovaAba();
        meuIphone.navegadorInternet.atualizarPagina();
    }
}