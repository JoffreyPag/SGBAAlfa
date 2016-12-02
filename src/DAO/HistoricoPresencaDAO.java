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
        //String resposta = "";
        String idHist = "", horaSaida = "";
        
        try{
            con.conectar();
            PreparedStatement preparaInstrucao;
            preparaInstrucao = con.getConexao().prepareStatement(BUSCA);
            preparaInstrucao.setString(1, matricula);
            preparaInstrucao.execute();
            ResultSet rs = preparaInstrucao.executeQuery();
            
            while(rs.next()){
                //resposta = rs.getString("idHistFunc");
                idHist = rs.getString("idHistFunc");
                horaSaida = rs.getString("horaSaida");
            }
            
            con.desconecta();   
            //apenas pra mostrar no console que achou
            //System.out.println(resposta);
            System.out.println("idHist = "+idHist+" horaSaida = "+horaSaida);
            
        }catch(Exception e){
            e.printStackTrace();
        }
           // System.out.println(resposta.isEmpty()? "não deu entrada -> registra entrada" : "deu entrada -> registra saida");
           //true = saida, false = entrada
            if(!idHist.isEmpty()){ //se existir registro
                if(horaSaida == null) //se não houver hora de saida nesse registro
                    return true;
                else    //se houver
                    return false;
            } else{ //se nao existir registro
                return false;
            }
            
        /* if(resposta.isEmpty())
            return false;
        else
            return true; */
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
