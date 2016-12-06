package DAO;

import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import sgbaalfa.Ocorrencia;
import utilitarios.conexao;

/**
 *
 * @author joffr
 */
public class OcorrenciaDAO {
    //desc, nomeAutor, data, setor
    private final String INSERT = "INSERT INTO HISTORICOOCORRENCIA (descricaoOcorrencia, dataOcorrencia, setor, idFuncO ) VALUES (?,CURRENT_DATE, ?, (SELECT id FROM usuario WHERE matricula = ? ))";
    private conexao con = new conexao();
    
    public void registarOcorrencia(Ocorrencia oc, String matricula){
        try{
            con.conectar();
            PreparedStatement preparaInstrucao;
            preparaInstrucao = con.getConexao().prepareStatement(INSERT);
            
            preparaInstrucao.setString(1, oc.getDescricao());
            preparaInstrucao.setString(2, oc.getSetor());
            preparaInstrucao.setString(3, matricula);
            
            preparaInstrucao.execute();
            JOptionPane.showMessageDialog(null, "Ocorrencia cadastrada com sucesso");

            // DESCONECTA
            con.desconecta();
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Erro ao enviar a ocorrencia no banco de dados " + e.getMessage());
        }
    }
    
    
    
    
    
    
}
