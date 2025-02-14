package modeloteste;
import modelo.*;

public class CriarCarro {
    public static void main(String[] args) {
        Tesla modelS = new Tesla(100);
        modelS.definirRota("Zona Norte", "Centro Universitário Senac");

        System.out.println(modelS);

    }
}
