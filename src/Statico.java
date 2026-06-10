public final class Statico extends Abstrata{
    private final double saldo = 1;

    /*
    Final
    Aqui obteremos erro por se tratar de uma var declarada como final, eu não tenho acesso a modificar seu valor.
    pois o valor dela sempre será o inicial.


    public void setSaldo(double saldo) {
        return this.saldo = saldo;
    }
    */

    public double getSaldo() {
        return this.saldo;
    }

    public static int soma1Mais1(){
        return 1 + 1;
    }

    private static int soma2Mais1(){
        return 2 + 1;
    }

    @Override
    public int metodoAbstract(int i) {
        return i;
    }
}
