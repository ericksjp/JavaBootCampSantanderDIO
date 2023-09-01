public class App {
    public static void main(String[] args) throws Exception {
        
        String nome = args[0];
        short idade = Short.parseShort(args[1]);
        float altura = Float.parseFloat(args[2]);

        System.out.println("Seu nome eh: " + nome);
        System.out.println("Sua idade eh: " + idade);
        System.out.println("Sua altura eh: " + altura);
    }
}
