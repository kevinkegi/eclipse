package modelo;

import java.sql.*;
import javax.swing.*;

public class Conexao 
{

	public void Conecta()

{
    try
    {
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/banco", "root","");	
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery("SELECT * FROM login");	
        if(rs!=null)
    {
        	JOptionPane.showMessageDialog(null, "Conectou!");
        	rs.close();
       }
        con.close();
    }
    
    catch(SQLException e)
    {
       JOptionPane.showMessageDialog(null, "Erro:" + e);
    }
    
  }
}