    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import conexao.ConexaoBD;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import modelo.Tweets;

public class controltweets {
    ConexaoBD conecta = new ConexaoBD();
    Tweets mode = new Tweets();
    
    public void salvar(Tweets tweets) throws SQLException{
    conecta.conexao();
    try {
           PreparedStatement pst = conecta.con.prepareStatement("insert into tweets(codigotweets,idtweets,status,data,hashtag,codigouser) VALUES(?,?,?,?,?,?)");
            pst.setInt(1, tweets.getCodigotweets());
            pst.setLong(2, tweets.getIdtweet());
            pst.setString(3, tweets.getStatus());
            pst.setString(4, tweets.getData());
            pst.setString(5, tweets.getHashtag());
            pst.setInt(6, tweets.getCodigouser());
            pst.execute();
           
       //    JOptionPane.showMessageDialog(null,tweets.getCodigouser()+ "Dados inseridos com Sucesso");
            }catch (SQLException u ){
            
          PreparedStatement pst = conecta.con.prepareStatement("insert into tweets(codigotweets,idtweets,status,data,hashtag,codigouser) VALUES(?,?,?,?,?,?)");
            pst.setInt(1, tweets.getCodigotweets());
            pst.setLong(2, tweets.getIdtweet());
            pst.setString(3, "ERRO DE CARACTERES ");
            pst.setString(4, tweets.getData());
            pst.setString(5, tweets.getHashtag());
            pst.setInt(6, tweets.getCodigouser());
            pst.execute();
           
            }
    conecta.desconecta();
    }
    /*
    public Tweets buscaequipe(Tweets  mod) throws SQLException{
    conecta.conexao();
   conecta.execultaSql("select *from tweets where hashtag like'%"+mod.getPesquisa()+"%'");
        try {
            Object o =conecta.rs.first();
            if(o!=null){
            mod.setCod_equipe(conecta.rs.getInt("cod_equipe"));
            mod.setNome_equipe(conecta.rs.getString("nome_equipe"));
            mod.setTreinador(conecta.rs.getString("treinador"));
            mod.setCidade(conecta.rs.getString("cidade"));
            mod.setPais(conecta.rs.getString("pais"));
            }else{
             JOptionPane.showMessageDialog(null, "Tabela Vazia");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar"+ex.getMessage());
        }
    conecta.desconecta();
    return mod;
    }
    public void excluir(Equipe mod) throws SQLException{
    conecta.conexao();
    
        try {
            PreparedStatement pst=conecta.con.prepareStatement("delete from equipe where cod_equipe=?");
            pst.setInt(1, mod.getCod_equipe());
            pst.execute();
           JOptionPane.showMessageDialog(null, "Dados Excluidos com Sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Excluir Dados"+ex.getMessage());
        }
    conecta.desconecta();
    }
    public void editar(Equipe mod) throws SQLException{
    conecta.conexao();
    try{
    PreparedStatement pst = conecta.con.prepareStatement("update equipe set nome_equipe=?,treinador=?,cidade=?,pais=? where cod_equipe=?");
    
    pst.setString(1, mod.getNome_equipe());
    pst.setString(2, mod.getTreinador());
    pst.setString(3, mod.getCidade());
    pst.setString(4, mod.getPais());
    pst.setInt(5,mod.getCod_equipe());
    pst.execute();
     JOptionPane.showMessageDialog(null, "Alterado com sucesso ");
    }catch(SQLException ex){
     JOptionPane.showMessageDialog(null, "Erro na alteração"+ex.getMessage());
    
    
    
    }
     conecta.desconecta();
    
    
    }
*/
}
