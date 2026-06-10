public abstract sealed class Abstrata permits Statico{
    //abstract não pode ser instanciada
    //sealed apenas as classe que forem marcadas no permits podem estanciar dessa classe.

    public String testePublic;
    private String testePrivate;
    protected String testeProtect;

    public void metodoNormal(){
    }

    //metodos abstratos na classe pai não poem conter corpo, classe filhas que conteram corpo do metodo
    public abstract int metodoAbstract(int i);

    public static void metodoStatic(){
    }
}
