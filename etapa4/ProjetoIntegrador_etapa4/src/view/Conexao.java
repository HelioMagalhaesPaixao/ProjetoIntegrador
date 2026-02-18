package view;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexao {

    public static Connection conectar() {
        try {
            // Ajuste nome do banco, usuário e senha conforme seu MySQL
            String url = "jdbc:mysql://localhost:3306/ProjetoIntegrador?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC";
            String user = "root";
            String password = "Helio85295360@"; // troque pela sua senha

            Connection con = DriverManager.getConnection(url, user, password);
            return con;
        } catch (Exception e) {
            System.out.println("Erro ao conectar: " + e.getMessage());
            return null;
        }
    }
}
