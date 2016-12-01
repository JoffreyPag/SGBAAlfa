package DAO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
//import javax.swing.SpringLayout;
import utilitarios.conexao;

/**
 *
 * @author joffr
 */
public class HistoricoPresencaDAO {
    private final String BUSCA = "SELECT * FROM historicofuncionario WHERE (dataEntrada = CURRENT_DATE AND id_Func = (SELECT id FROM usuario WHERE matricula = ?))";
    private final String INSERT = "INSERT INTO HISTORICOFUNCIONARIO(id_Func, dataEntrada, horaEntrada) VALUES ((SELECT id FROM usuario WHERE matricula = ? ), CURRENT_DATE, CURRENT_TIME);";
    private final String UPDATE = "UPDATE historicofuncionario SET horaSaida = CURRENT_TIME WHERE dataEntrada = CURRENT_DATE AND id_Func = (SELECT id FROM usuario WHERE matricula = ?)";
    private conexao con = new conexao();

    public boolean verificaSeRegistrou(String matricula){
        //faz pesquisa e retorna algo 
        String resposta = "";
        try{
            con.conectar();
            PreparedStatement preparaInstrucao;
            preparaInstrucao = con.getConexao().prepareStatement(BUSCA);
            preparaInstrucao.setString(1, matricula);
            preparaInstrucao.execute();
            ResultSet rs = preparaInstrucao.executeQuery();
            
            while(rs.next()){
                resposta = rs.getString("idHistFunc");
            }
            //apenas pra mostrar no console que achou
            //System.out.println(resposta);
            
            con.desconecta();   
            
        }catch(Exception e){
            e.printStackTrace();
        }
        //se retornou algo essa pessoa deu entrada e chama saida
            System.out.println(resposta.isEmpty()? "não deu entrada -> registra entrada" : "deu entrada -> registra saida");
            //se nao retornou chama entrada
        if(resposta.isEmpty())
            return false;
        else
            return true;
    }
    
    public void inserirEntrada(String matricula){
        try{
            con.conectar();

            PreparedStatement preparaInstrucao;
            preparaInstrucao = con.getConexao().prepareStatement(INSERT);
            preparaInstrucao.setString(1, matricula);
            preparaInstrucao.execute();
            con.desconecta();
           JOptionPane.showMessageDialog(null, "Presença registrada");
           
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "erro ao inserir "+e.getMessage());
        }
    }
    public void inserirSaida(String matricula){
        try{
            con.conectar();
            PreparedStatement preparaInstrucao;
            preparaInstrucao = con.getConexao().prepareStatement(UPDATE);
            preparaInstrucao.setString(1, matricula);
            preparaInstrucao.execute();
            con.desconecta();
            JOptionPane.showMessageDialog(null, "saidaregistrada");
            
        }catch(Exception e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "erro ao sair "+e.getMessage());
        }
    }
    
    
}
