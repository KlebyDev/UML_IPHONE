package smartphone;

import navegador.NavegadorInternet;
import reprodutor.ReprodutorMusical;
import telefone.AparelhoTelefonico;

public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {

    private String nomeMusica;
    private String nomeContato;
    private int volumeMusica = 20;
    private boolean pausar = false;
    private boolean conectado = false;

    public Iphone(String nomeMusica, String nomeContato) {
        this.nomeMusica = nomeMusica;
        this.nomeContato = nomeContato;
    }

    //métodos do reprodutor musical
    public void tocarMusica() {
        this.pausar = false;
        this.conectado = false;
        System.out.println("Reproduzindo a música: "+ this.nomeMusica);
    }

    public void selecionarMusica(String nomeMusica) {
        this.nomeMusica = nomeMusica;
        System.out.println("Musica "+ this.nomeMusica +" Selecionada");
        tocarMusica();
    }


    public void aumentarVolume() {
        this.volumeMusica += 1;
        System.out.printf("Volume: %d.\n", this.volumeMusica);
    }


    public void diminuirVolume() {
        this.volumeMusica -= 1;
        System.out.printf("Volume: %d.\n", this.volumeMusica);
    }


    public void pausarMusica() {
        this.pausar = true;
        System.out.println("Música pausada.");
    }
    //FIm dos métodos reprodutor musical


    //Métodos aparelho telefonico
    public void ligar() {
        pausarMusica();
        this.conectado = false;
        System.out.println("Ligando para "+ this.nomeContato);
    }

    public void atender(int numeroTelefonico) {
        System.out.println("Recebendo ligação de " + numeroTelefonico);
    }

    public void iniciarCorreioVoz() {
        System.out.println("Ouvindo correio de voz");
    }
    //Fim dos métodos de Aparelho telefonico

    //Métodos de Navegador de Internet
    public void conectarInternet() {
        if(this.conectado) System.out.println("Já está Conectado a Internet");
        else conectado = true;
    }


    public void exibirPagina() {
        System.out.println("Página exibindo");
    }


    public void novaAba() {
        System.out.println("Nova Aba Aberto");
    }


    public void atualizarPagina() {
        System.out.println("Página atualizada");
    }

}
