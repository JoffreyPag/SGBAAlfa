package DAO;

import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import sgbaalfa.Atividade;
import utilitarios.conexao;

/**
 *
 * @author joffr
 */
public class AtividadeDAO {
    private final String INSERT = "INSERT INTO ATIVIDADES (titulo, descricao) VALUES (?,?)";
    //private final String LIST = "SELECT * FROM USUARIO WHERE tipo = '(?)'";
    private conexao con = new conexao();
    
    public void registarAtividade(Atividade at){
        try{
            con.conectar();
            PreparedStatement preparaInstrucao;
            preparaInstrucao = con.getConexao().prepareStatement(INSERT);
            
            preparaInstrucao.setString(1, at.getTitulo());
            preparaInstrucao.setString(2, at.getDescricao());
            preparaInstrucao.execute();
            JOptionPane.showMessageDialog(null, "Atividade cadastrada com sucesso");

            // DESCONECTA
            con.desconecta();
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Erro ao enviar a atividade no banco de dados " + e.getMessage());
        }
    }
    
}
