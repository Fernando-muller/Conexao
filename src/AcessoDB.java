
import java.sql.Connection;
import java.sql.Statement;
import java.sql.Connection;

import java.sql.Statement;

import java.sql.DriverManager;

import java.sql.SQLException;


public class AcessoDB {
    
        String url = "jdbc:mysql://localhost:3306/exemplo_senac?serverTimezone=UTC";
        String user = "root";
        String pass = "root";

        String sql = "SELECT id, nome FROM usuario";

    Connection conn; //criando um objeto do tipo connection chamado conn

    public boolean conectar(){
          try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/exemplo_senac","root","root");
            System.out.println("Conexão realizada com sucesso");
            return true;
        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println("Falha na conexão com o banco " + ex.getMessage());
            return false;
        }
        
    }
      public void desconectar(){
        try {
            conn.close();
        } catch (SQLException ex) {
        
        }
}}
    