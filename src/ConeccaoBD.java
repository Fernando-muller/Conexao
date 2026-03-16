import java.sql.*;

public class ConeccaoBD {
    public static void main(String[] args) {

      AcessoDB conector = new AcessoDB();
        
        conector.conectar();
    }
}
