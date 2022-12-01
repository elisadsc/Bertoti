package dao;

import java.sql.PreparedStatement;
import factory.ConnectionFactory;
import java.sql.Connection;
import java.sql.ResultSet;
import modelo.Login;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.JOptionPane;
import modelo.petsDTO;

public class petsDAO {

    Connection conn;
    PreparedStatement pstm;
    ResultSet rs;
    ArrayList<petsDTO> lista = new ArrayList<>();
        
    
    public ResultSet autenticacao(Login objlogin) {
        conn = new ConnectionFactory().getConnection();

        try {
            String sql = "select * from login where senha = ? and usuario = ?";

            java.sql.PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setString(1, objlogin.getSenha());
            pstm.setString(2, objlogin.getUsuario());

            ResultSet rs = pstm.executeQuery();
            return rs;

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "UsuarioDAO: " + erro);
            return null;
        }

    }

    public void NovoPet(petsDTO objpetsDTO) {

        String sql = "INSERT INTO `pets` (`nomepet`, `raca`, `nomedono`, `saida`, `entrada`, `contato` ) VALUES (?, ?, ?, ?, ?, ?)";

        conn = new ConnectionFactory().getConnection();

        try {

            pstm = (PreparedStatement) conn.prepareStatement(sql);
            pstm.setString(1, objpetsDTO.getNomepet());
            pstm.setString(2, objpetsDTO.getRaca());
            pstm.setString(3, objpetsDTO.getNomedono());
            pstm.setString(4, objpetsDTO.getSaida());
            pstm.setString(5, objpetsDTO.getEntrada());
            pstm.setString(6, objpetsDTO.getContato());
         

            pstm.execute();
            pstm.close();

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "NovoPet" + erro);
        }

    }
    
    
    

    public ArrayList<petsDTO> listarPets() {

        String sql = "select * from pets ";
        conn = new ConnectionFactory().getConnection();

        try {
            pstm = (PreparedStatement) conn.prepareStatement(sql);
            rs = pstm.executeQuery();

            while (rs.next()) {
                petsDTO objpets = new petsDTO();
                objpets.setId(rs.getInt("id"));
                objpets.setNomepet(rs.getString("nomepet"));
                objpets.setNomedono(rs.getString("nomedono"));
                objpets.setRaca(rs.getString("raca"));
                objpets.setEntrada(rs.getString("entrada"));
                objpets.setSaida(rs.getString("saida"));
                objpets.setContato(rs.getString("contato"));
                


                lista.add(objpets);

            }

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "ListarPetsDAO" + erro);
        }
        return lista;
    }
    
    
 public void excluirCadastros(petsDTO objpets){
      String sql = "delete from pets where id = ?";
      conn = new ConnectionFactory().getConnection();
      
      
      try {

            pstm = (PreparedStatement) conn.prepareStatement(sql);
            pstm.setInt(1, objpets.getId());

            pstm.execute();
            pstm.close();

        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "cadastrarCanal" + erro);
        }

    }
 
 
 public void alterarCadastro(petsDTO objmedsDTO){
    String sql = "UPDATE `pets` SET nomepet = ?, raca = ?, nomedono = ?, saida = ?, entrada = ?, contato = ? WHERE id = ?";     
   
    conn = new ConnectionFactory().getConnection();
    
    
      try {

           pstm = (PreparedStatement) conn.prepareStatement(sql);
           pstm.setString(1, objmedsDTO.getNomepet());
           pstm.setString(2, objmedsDTO.getRaca());
           pstm.setString(3, objmedsDTO.getNomedono());
           pstm.setString(4, objmedsDTO.getSaida());
           pstm.setString(5, objmedsDTO.getEntrada());
           pstm.setString(6, objmedsDTO.getContato());         
           pstm.setInt(7, objmedsDTO.getId());
            

           pstm.execute();
           pstm.close();

        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "AlterarMed" + erro);
        }
 
 }


public Vector  pesquisar(String pesq) throws Exception {
     Vector  tb = new Vector ();
     
     conn = new ConnectionFactory().getConnection();
     String sql = "select * from pets where nome like '" + pesq + "%'";
     PreparedStatement ps = (PreparedStatement) conn.prepareStatement(sql);
     
     
     ResultSet rs = ps.executeQuery();
     while(rs.next()){
         Vector nl = new Vector();
         nl.add(rs.getInt("id"));
         nl.add(rs.getString("nomepet"));
         nl.add(rs.getString("raca"));
         nl.add(rs.getString("nomedono"));
         nl.add(rs.getString("saida"));
         nl.add(rs.getString("entrada"));
         nl.add(rs.getString("contato"));
        
         
         
         tb.add(nl);
         
     }
     return tb;
 }
   


}