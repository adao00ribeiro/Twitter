/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author adao-
 */
public class ConexaoBD {
    public Statement stm;
    public ResultSet rs;
    private String driver="com.mysql.jdbc.Driver";
    private String caminho="jdbc:mysql://localhost/projeto";
    private String usuario = "root";
    private String senha = "adao123";
    public Connection con;
    
    public void conexao(){
        try{
            System.setProperty("jbdc.Drivers",driver);
             con=DriverManager.getConnection(caminho,usuario,senha);
             System.out.println("Conexão aberta!"); 
        }
        catch(SQLException excecao) {
            System.out.println("erro!"+excecao.getMessage()); 
            throw new RuntimeException(excecao);
        }
    }
    public void execultaSql(String sql){
   try{    
    stm = con.createStatement(rs.TYPE_SCROLL_INSENSITIVE,rs.CONCUR_READ_ONLY);
   rs = stm.executeQuery(sql);
   }catch (SQLException excecao){
   System.out.println("erro!"+excecao.getMessage());
   
   }
 
    }
    public void desconecta(){
       
        try{
         System.out.println("Conexão desconectada!"); 
             con.close();
       
        }
        catch(SQLException excecao) {
            System.out.println("erro!"+excecao.getMessage()); 
            throw new RuntimeException(excecao);
        }
       
    }
    
    
}
