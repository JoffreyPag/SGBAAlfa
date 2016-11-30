package DAO;

import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import utilitarios.conexao;

/**
 *
 * @author joffr
 */
public class HistoricoPresencaDAO {
    private final String INSERT = "INSERT INTO HISTORICOFUNCIONARIO(dataEntrada, horaEntrada, id_Bolsista) VALUES(CURRENT-DATE,CURRENT_TIME, ?)";
    private final String UPDATE = "UPDATE historicofuncionario SET horaSaida = CURRENT_TIME WHERE dataEntrada = CURRENT_DATE, id_Func=?";
    private conexao con = new conexao();
    
    public void inserirEntrada(){
        try{
            PreparedStatement preparaInstrucao;
            preparaInstrucao = con.getConexao().prepareStatement(INSERT);
            
           // preparaInstrucao.setString(1, idFunc/idBolsista);
            
           JOptionPane.showMessageDialog(null, "Presença registrada");
           con.desconecta();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "erro ao inserir "+e.getMessage());
        }
    }
    public void inserirSaida(){
        try{
            PreparedStatement preparaInstrucao;
            preparaInstrucao = con.getConexao().prepareStatement(UPDATE);
            
           // preparaInstrucao.setString(1, id_func);
            
           JOptionPane.showMessageDialog(null, "saidaregistrada");
           con.desconecta();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "erro ao sair "+e.getMessage());
        }
    }
    
    
}
