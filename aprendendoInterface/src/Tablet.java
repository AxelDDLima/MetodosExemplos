public class Tablet implements Music, Video{
    @Override
    public void tocarMusica() {
        System.out.println("Tablet tocarMusica");
    }

    @Override
    public void pausarMusica() {
        System.out.println("Tablet pausarMusica");
    }

    @Override
    public void passarMusica() {
        System.out.println("Tablet passarMusica");
    }
    @Override
    public void reproduzirVideo() {
        System.out.println("Tablet reproduzVideo");
    }

    @Override
    public void pausarVideo() {
        System.out.println("Tablet pausarVideo");
    }

    @Override
    public void passarVideo() {
        System.out.println("Tablet passarVideo");
    }
}
