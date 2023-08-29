import smartphone.Iphone;

public class Main {
    public static void main(String[] args) {
       Iphone iphone = new Iphone("Aquarela", "Joao");

       iphone.tocarMusica();
       iphone.selecionarMusica("Outra");
       iphone.pausarMusica();
       iphone.aumentarVolume();
       iphone.diminuirVolume();
       iphone.ligar();
       iphone.atender(12345);
       iphone.iniciarCorreioVoz();
       iphone.conectarInternet();
       iphone.exibirPagina();
       iphone.novaAba();
       iphone.atualizarPagina();
    }
}