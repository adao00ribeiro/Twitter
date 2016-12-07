/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import conexao.ConexaoBD;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import modelo.Tweets;
import modelo.Usuario;

/**
 *
 * @author adao-
 */
public class controleusuario {
    ConexaoBD conecta = new ConexaoBD();
    Usuario mode = new Usuario();
     controltweets controltweets = new  controltweets();
    public void salvar(Usuario usuario,Tweets statu) throws SQLException{
    conecta.conexao();
    try {
           PreparedStatement pst = conecta.con.prepareStatement("INSERT INTO User (codigo,iduser,UsuarioName,ScreenName,local) VALUES(?,?,?,?,?)");
            pst.setInt(1, usuario.getCodigo());
            pst.setLong(2, usuario.getIduser());
            pst.setString(3, usuario.getNome());
            pst.setString(4, usuario.getScreenName());
            pst.setString(5, usuario.getLocal());
            pst.execute();
            
       //    JOptionPane.showMessageDialog(null, usuario.getCodigo()+"Usuario:"+usuario.getNome()+"USUARIO inseridos com Sucesso");
           
            controltweets.salvar(statu);
            }catch (SQLException u ){
            PreparedStatement pst = conecta.con.prepareStatement("INSERT INTO User (codigo,iduser,UsuarioName,ScreenName,local) VALUES(?,?,?,?,?)");
            pst.setInt(1, usuario.getCodigo());
            pst.setLong(2, usuario.getIduser());
            pst.setString(3, usuario.getScreenName());
            pst.setString(4, usuario.getScreenName());
            pst.setString(5, usuario.getLocal());
            pst.execute();
            
       //    JOptionPane.showMessageDialog(null, usuario.getCodigo()+"Usuario:"+usuario.getNome()+"USUARIO inseridos com Sucesso");
           
            controltweets.salvar(statu);
            }
    conecta.desconecta();
    }
    /*
    public Jogador buscajogador(Jogador mod) throws SQLException{
    conecta.conexao();
     conecta.execultaSql("select *from jogador where nome_jogador like'%"+mod.getPesquisa()+"%'");
        try {
            Object o=conecta.rs.first();
            if(o!=null){
           
            mod.setCodjogador(conecta.rs.getInt("cod_jogador"));  
            mod.setCodequipe(conecta.rs.getInt("cod_equipe"));
            mod.setNomejogador(conecta.rs.getString("nome_jogador"));
            mod.setNumerocamisa(conecta.rs.getInt("numerocamiseta"));
            }
        } catch (SQLException ex) {
            
        }
    conecta.desconecta();
    return mod;
    }
 public void excluir(Jogador mod) throws SQLException{
    conecta.conexao();
    
        try {
            PreparedStatement pst=conecta.con.prepareStatement("delete from jogador where cod_jogador=?");
            pst.setInt(1, mod.getCodjogador());
            pst.execute();
           JOptionPane.showMessageDialog(null, "Dados Excluidos com Sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Excluir Dados"+ex.getMessage());
        }
    conecta.desconecta();
    }
    public void editar(Jogador mod) throws SQLException{
    conecta.conexao();
    try{
    PreparedStatement pst = conecta.con.prepareStatement("update jogador set cod_equipe=?,nome_jogador=?,numerocamiseta=? where cod_jogador=?");
   
    pst.setInt(1, mod.getCodequipe());
    pst.setString(2, mod.getNomejogador());
    pst.setInt(3, mod.getNumerocamisa());
    pst.setInt(4, mod.getCodjogador());
    pst.execute();
     JOptionPane.showMessageDialog(null, "Alterado com sucesso ");
    }catch(SQLException ex){
     JOptionPane.showMessageDialog(null, "Erro na alteração"+ex.getMessage());
    }
     conecta.desconecta();
    }
*/
}
