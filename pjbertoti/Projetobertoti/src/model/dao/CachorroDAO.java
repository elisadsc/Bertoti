/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.dao;

import connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import model.bean.Cachorro;


public class CachorroDAO {
    
    public void create(Cachorro a) {
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement("INSERT INTO funcionario (cli_nome, cli_raca, cli_peso, cli_telefone) VALUES(?,?,?,?)");
            stmt.setString(1, a.getNome());
            stmt.setString(2, a.getRaca());
            stmt.setDouble(3, a.getPeso());
            stmt.setString(4,a.getTelefone());
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Salvo com secesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar: "+ex);
        }finally {
            ConnectionFactory.closeConnection(con, stmt);
            
        }
    }
}
