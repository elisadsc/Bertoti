/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package connection;

import static connection.ConnectionFactory.getConnection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Vector;


public class PesqFuncionario {
    
    public PesqFuncionario() throws Exception {
        
    }
    
    public Vector Pesquisar (String pesq) throws Exception {
      Vector tb = new Vector ();
      String url = "select * from funcionario where nome like '" + pesq + "%'";
      PreparedStatement stmt = getConnection().prepareStatement(url);
      ResultSet rs = stmt.executeQuery();
      while(rs.next()) {
          Vector nl = new Vector();
          nl.add(rs.getInt("Id"));
          nl.add(rs.getString("nome"));
          nl.add(rs.getString("cpf"));
          nl.add(rs.getString("salario"));
          nl.add(rs.getString("telefone"));
          tb.add(nl);
      }
      return tb;
    }
}
