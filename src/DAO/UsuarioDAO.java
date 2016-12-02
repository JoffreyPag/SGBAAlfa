
package DAO;
//import sgbaalfa.Usuario;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
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
    private final String BUSCASENHA = "SELECT senha FROM usuario WHERE matricula = ?";
    private final String LIST = "SELECT * FROM USUARIO WHERE tipo = '(?)'";
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

    public void inserirGerente(Gerente u){
        try{
            con.conectar();
            PreparedStatement preparaInstrucao;
            preparaInstrucao = con.getConexao().prepareStatement(INSERT);
            
            preparaInstrucao.setString(1, u.getNome());
            preparaInstrucao.setString(2, u.getCpf());
            preparaInstrucao.setString(3, u.getEmail());
            preparaInstrucao.setString(4, null);
            preparaInstrucao.setString(5, u.getTelefone());
            preparaInstrucao.setString(6, u.getSenha());
            preparaInstrucao.setString(7, "g");
            preparaInstrucao.execute();
            JOptionPane.showMessageDialog(null, "Gerente cadastrado com sucesso");

            // DESCONECTA
            con.desconecta();
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Erro ao inserir cliente no banco de dados " + e.getMessage());
        }
        
        
    }

    public ArrayList<Bolsista> listarBolsista(){
        ArrayList<Bolsista> listaBolsista = new ArrayList<>(); //cria uma lista de objetos

		try {
			// CONECTA
			con.conectar();
                        
                        PreparedStatement preparaInstrucao;
                        preparaInstrucao = con.getConexao().prepareStatement(LIST);
                        preparaInstrucao.setString(1, "b");
                        preparaInstrucao.execute();
                        
			ResultSet rs = preparaInstrucao.executeQuery(); // EXECUTA A INSTRUCAO
			
			while (rs.next()) { //enquanto houver registro
				Bolsista b = new Bolsista(rs.getString("nome"), rs.getString("cpf"),
                                                          rs.getString("email"), rs.getString("senha"), 
                                                          rs.getString("telefone"), 'g', 
                                                          rs.getString("matricula"));
                                
				listaBolsista.add(b); //adiciona o objeto a lista
                                
			}
			// DESCONECTA
			con.desconecta();
                        
                        /*for(int i = 0; i<lista.size(); i++){
                            System.out.println(lista.get(i).getNome());
                        }*/
		} catch (SQLException e) {
			e.printStackTrace();
		}
                return listaBolsista;
    }
    
    public void listarGerente(){
        ArrayList<Gerente> lista = new ArrayList<>(); //cria uma lista de objetos Gerente

		try {
			// CONECTA
			con.conectar();
			PreparedStatement preparaInstrucao;
                        preparaInstrucao = con.getConexao().prepareStatement(LIST);
                        preparaInstrucao.setString(1, "g");
                        preparaInstrucao.execute();
                        
			ResultSet rs = preparaInstrucao.executeQuery(); // EXECUTA A INSTRUCAO
			
			while (rs.next()) { //enquanto houver registro
				Gerente g = new Gerente(rs.getString("nome"), rs.getString("cpf"), 
                                                        rs.getString("email"), rs.getString("senha"), 
                                                        rs.getString("telefone"), 'g');
				lista.add(g); //adiciona o objeto a lista
			}
			// DESCONECTA
			con.desconecta();
                        
                        /*for(int i = 0; i<lista.size(); i++){
                            System.out.println(lista.get(i).getNome());
                        }*/
		} catch (SQLException e) {
			e.printStackTrace();
		}
    }
    public boolean autenticaSenha(String matricula, String senha){
        String senhaBD = "";
        try{
            con.conectar();
            PreparedStatement preparaInstrucao;
            preparaInstrucao = con.getConexao().prepareStatement(BUSCASENHA);
            preparaInstrucao.setString(1, matricula);
            preparaInstrucao.execute();
            ResultSet rs = preparaInstrucao.executeQuery();

            while(rs.next()){
                //resposta = rs.getString("idHistFunc");
                senhaBD = rs.getString("senha");
            }
            con.desconecta();
            
        }catch(Exception e){
            e.printStackTrace();
        }
        
        return senha.equals(senhaBD); //se for vdd a senha ta correta
        
    }
}
