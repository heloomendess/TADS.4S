package principal;
import modelo.TanqueRobo;
import modelo.CoresRGB;

public class Arena {
    public static void main(String[] args) {

        TanqueRobo robo = new TanqueRobo(0, 0, CoresRGB.BLUE, CoresRGB.GREEN);
        try {
            robo.atirar(5);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        robo.movOeste();
        robo.movOeste();
        robo.movNorte();

        System.out.println(robo);
    }
}
