public sealed interface PlayTeste permits Statico, VideoTeste {
    /*
    dentro de uma interface por padrão as variavei são "public final static" de forma implícita.
    String var = "teste"; modo não aceito
    public final static String var = "teste"; modo aceito, porém redundant, pois tem implícito.
     */
     String varCorreto = "teste";

     /*
     mesma coisa para metodos.
        DEFAULT
      */
     default int metodoInterface(int var){
         return var;
     };

}
