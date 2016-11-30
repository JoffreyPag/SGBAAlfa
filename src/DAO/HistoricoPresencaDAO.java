package DAO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import utilitarios.conexao;

/**
 *
 * @author joffr
 */
public class HistoricoPresencaDAO {
    private final String BUSCA = "SELECT id FROM USUARIO WHERE matricula = ? ";
    private final String INSERT = "INSERT INTO HISTORICOFUNCIONARIO(id_Func, dataEntrada, horaEntrada) VALUES ((SELECT id FROM usuario WHERE matricula = ? ), CURRENT_DATE, CURRENT_TIME);";
    private final String UPDATE = "UPDATE HISTORICOFUNCIONARICO SET horaSaida = CURRENT_TIME WHERE dataEntrada = CURRENT_DATE, id_Func=?";
    private conexao con = new conexao();
    
    public void inserirEntrada(String matricula){
        try{
            con.conectar();

            /*PreparedStatement preparaInstrucao;
            preparaInstrucao = con.getConexao().prepareStatement(BUSCA);
            preparaInstrucao.setString(1, matricula);
            preparaInstrucao.execute();
            ResultSet rs = preparaInstrucao.executeQuery(); // EXECUTA A INSTRUCAO

            String x = rs.getString("id");
            System.out.println(x);*/
            PreparedStatement preparaInstrucao;
            preparaInstrucao = con.getConexao().prepareStatement(INSERT);
            preparaInstrucao.setString(1, matricula);
            preparaInstrucao.execute();
            
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
