public class Main {
    public static void main(String[] args) {
        /**
         * lembrar de estudar sobre Enum
         * (Function<String, T> conversor) -> Integer::parseInt arryfuction
         * (T...) varargs
         * API de Streams e Generics - praticar!
         * Data ISO 8601
         * mult thred
         * */
        //Runnable r = () -> System.out.println("Hello World");

        Thread tipo = new Thread("Thread");

        tipo.run();
    }
}