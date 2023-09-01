import java.security.SecureRandom;

public class GerarCodigo {
    private final SecureRandom random = new SecureRandom();

    public String gerarCodigo(int tamanho){
        String characters = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789"; 
        char[] charArray = characters.toCharArray();
        
        char[] codigo = new char[tamanho];        
        for (int c = 0; c < tamanho; c++){
            codigo[c] = charArray[random.nextInt(characters.length())];
        }

        return new String(codigo);
    }
}
