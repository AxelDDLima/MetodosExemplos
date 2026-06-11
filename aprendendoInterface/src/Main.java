public class Main {
    public static void main(String[] args) {
        /**
         * formas de chamar o metodo tocar do celular.
         */
        Music celular = new Celular();
        /** Cast arguments */
        tocarMusica(celular);
        reproduzirVideo((Video) celular);
        //sem o cast arguments essa linha geraria erro, porque celular está sendo instanciado como music, video espera um video como parametro.

        /** celular herda das duas classes, por isso ambas reconhecem celular como music ou video */
        Celular celular1 = new Celular();
        tocarMusica(celular1);
        reproduzirVideo(celular1);

        /** celular herda das duas classes, por isso ambas reconhecem celular como music ou video */
        tocarMusica(new Celular());
        reproduzirVideo(new Celular());

        celular.tocarMusica();

    }

    private static void tocarMusica(Music music) {
        music.tocarMusica();
    }

    private static void reproduzirVideo(Video video) {
        video.reproduzirVideo();
    }
}