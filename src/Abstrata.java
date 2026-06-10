public abstract sealed class Abstrata permits Statico{
    //abstract não pode ser instanciada
    //sealed apenas as classe que forem marcadas no permits podem estanciar dessa classe.

    public String testePublic;
    private String testePrivate;
    protected String testeProtect;

}
