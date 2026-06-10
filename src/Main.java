public class Main {
    public static void main(String[] args) {
        //metodo de acesso

        /*
        O Java precisa iniciar o programa sem criar nenhum objeto.
        Por isso o main é static.
        O Java executa diretamente:
        Programa.main(args);
     ============================================================================================================
        * Static ele faz com que o metodo seja da classe e não do objeto.
        * quando algo é do objeto? quando precisamos instaciar um novo objeto para acessar algo daquela classe.
        * aqui nesse explo vimos que não precisamos instaciar um novo objeto para usarmos o soma1Mais1().
        */

        System.out.println(Statico.soma1Mais1());

        /*
        "final" significa:
        "Não pode ser alterado."
        Dependendo do contexto, o significado muda um pouco.
        exemplo na classe statico.
        */

        Statico teste = new Statico();
        System.out.println(teste.getSaldo());

        /*
        * public e private.
        * quando algo de "public" ele pode ser acessado de qualquer lugar, sem restrinções, como acontece no
        * soma1mais1().
        * Nessa linha abaixo é retornado um erro, pois metodos/váriaveis "private" só podem ser acessados pela mesma classe.
        */
        //System.out.println(Statico.soma2Mais1());

        /* Extends
        classes abstratas não podem se instanciadas!!!!

        Abstrata abstrata = new Abstrata();

        essa linha gera erro.
        */
        Abstrata abstrataStatic = new Statico();
        /* seald
        é um modificador que permite controlar quem pode herdar de uma classe ou implementar uma interface.
        a classe que herdar de uma classe sealed tem que conter um dos 3 modificadores, sealed, final(ninguém mais herda), non-sealed.
        final = fecha totalmente.
        sealed = abre só para convidados.
        non-sealed = volta a abrir para todos.
        */

        //instaceof

        //Record

        //public, protected e private
        abstrataStatic.testeProtect = "Esta no mesmo pacote da classe, por isso eu tenho acesso!!";
        abstrataStatic.testePublic = "É publico, posso acessar de qual quer lugar que tenho instancia da minha classe";
        // abstrataStatic.testePrivate = "Não pode ser acessado fora da classe!";
        //essa linha gera erro por se tratar de uma variavel privada.

        //metodo abstrato dentro do metodo pai para forçar todos os outros a implemetarem aquele metodo

        //sobreescrita

        //sobrecarga de metodo
    }
}