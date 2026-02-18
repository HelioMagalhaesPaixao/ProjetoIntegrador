package view;

import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class ProdutoDAO {

    // Método para salvar produto no banco
    public void salvar(String nome, double preco) {
        String sql = "INSERT INTO produto (nome, preco) VALUES (?, ?)";
        try {
            Connection con = Conexao.conectar();
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, nome);
            pst.setDouble(2, preco);
            pst.execute();
            con.close();
        } catch (Exception e) {
            System.out.println("Erro ao salvar produto: " + e.getMessage());
        }
    }

    // Método para buscar preço de um produto pelo código
    public double buscarPrecoPorCodigo(String codigo) {
        double preco = -1;
        try {
            Connection con = Conexao.conectar();
            PreparedStatement pst = con.prepareStatement("SELECT preco FROM produto WHERE id = ?");
            pst.setInt(1, Integer.parseInt(codigo));
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                preco = rs.getDouble("preco");
            }
            con.close();
        } catch (Exception e) {
            System.out.println("Erro ao buscar produto: " + e.getMessage());
        }
        return preco;
    }

    // NOVO: listar produtos para comparar preços
    public java.util.List<view.ItenNota> listarProdutosComPrecoNota() {
        java.util.List<view.ItenNota> lista = new java.util.ArrayList<>();
        try {
            Connection con = Conexao.conectar();
            String sql = "SELECT id, nome, preco FROM produto";
            PreparedStatement pst = con.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();

            while(rs.next()) {
                String codigo = String.valueOf(rs.getInt("id"));
                String nome = rs.getString("nome");
                double precoNota = rs.getDouble("preco");
                double precoAnotado = precoNota; // por enquanto, o mesmo valor
                lista.add(new view.ItenNota(codigo, nome, precoNota, precoAnotado));
            }

            con.close();
        } catch (Exception e) {
            System.out.println("Erro ao listar produtos: " + e.getMessage());
        }

        return lista;
    }
}
