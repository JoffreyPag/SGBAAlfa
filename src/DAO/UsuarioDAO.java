
package DAO;
//import sgbaalfa.Usuario;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import utilitarios.conexao;
import sgbaalfa.Bolsista;
import sgbaalfa.Gerente;
/**
 *
 * @author joffr
 */
public class UsuarioDAO {
    
    private final String INSERT = "INSERT INTO USUARIO (nome, cpf, email, matricula, telefone, senha, tipo) VALUES (?,?,?,?,?,?,?)";
    private conexao con = new conexao();
    
    public void inserirBolsista(Bolsista u){
        try{
            con.conectar();
            PreparedStatement preparaInstrucao;
            preparaInstrucao = con.getConexao().prepareStatement(INSERT);
            
            preparaInstrucao.setString(1, u.getNome());
            preparaInstrucao.setString(2, u.getCpf());
            preparaInstrucao.setString(3, u.getEmail());
            preparaInstrucao.setString(4, u.getMatricula());
            preparaInstrucao.setString(5, u.getTelefone());
            preparaInstrucao.setString(6, u.getSenha());
            preparaInstrucao.setString(7, "b");
            preparaInstrucao.execute();
            JOptionPane.showMessageDialog(null, "Cliente cadastrado com sucesso");

            // DESCONECTA
            con.desconecta();
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Erro ao inserir cliente no banco de dados " + e.getMessage());
        }
        
        
    }

    
}
