public class Celular implements Music, Video{
    @Override
    public void tocarMusica() {
        System.out.println("Celular tocarMusica");
    }

    @Override
    public void pausarMusica() {
        System.out.println("Celular pausarMusica");
    }

    @Override
    public void passarMusica() {
        System.out.println("Celular passarMusica");
    }
    @Override
    public void reproduzirVideo() {
        System.out.println("Celular reproduzVideo");
    }

    @Override
    public void pausarVideo() {
        System.out.println("Celular pausarVideo");
    }

    @Override
    public void passarVideo() {
        System.out.println("Celular passarVideo");
    }
}
