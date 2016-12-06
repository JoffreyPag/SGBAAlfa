package DAO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import sgbaalfa.Bolsista;
import utilitarios.conexao;

public class MontaTabelaFuncionario extends AbstractTableModel {
    private final String LIST = "SELECT * FROM USUARIO WHERE tipo = 'b'";
    conexao con = new conexao();
    
    /* Lista de Atividade que representam as linhas. */
    private List<Bolsista> linhas;

    /* Array de Strings com o nome das colunas. */
    private String[] colunas = new String[] {
        //String titulo, String descricao    
        "nome", "matricula", "email", "telefone"};


    /* Cria um BolsistaTableModel vazio. */
    public MontaTabelaFuncionario() {
        ArrayList<Bolsista> listaBolsista = new ArrayList<>();
        //pega banco
        try {
            // CONECTA
            con.conectar();

            PreparedStatement preparaInstrucao;
            preparaInstrucao = con.getConexao().prepareStatement(LIST);
            preparaInstrucao.execute();

            ResultSet rs = preparaInstrucao.executeQuery(); // EXECUTA A INSTRUCAO

            while (rs.next()) { //enquanto houver registro'
                //nome, cpf, email, senha, telefone, char tipoUser, matricul
                   Bolsista bo = new Bolsista(rs.getString("nome"), rs.getString("cpf"), 
                                              rs.getString("email"), rs.getString("senha"),
                                              rs.getString("telefone"),'b',rs.getString("matricula"));

                    listaBolsista.add(bo); //adiciona o objeto a lista

            }
            // DESCONECTA
            con.desconecta();
            
            //teste no console
           /* for(int i = 0; i<listaBolsista.size(); i++){
                System.out.println(listaBolsista.get(i).getNome());
            }*/
        } catch (SQLException e) {
                e.printStackTrace();
        }
        
        linhas = new ArrayList<Bolsista>(listaBolsista);        
        //linhas = new ArrayList<Bolsista>(new BancoLocal().getBolsistas());        
        //linhas = new ArrayList<Bolsista>();
    }

    /* Retorna a quantidade de colunas. */
    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    /* Retorna a quantidade de linhas. */
    @Override
    public int getRowCount() {
        return linhas.size();
    }

    // Retorna o nome da coluna no índice especificado.
    @Override
    public String getColumnName(int columnIndex) {
        // Retorna o conteúdo do Array que possui o nome das colunas
        // no índice especificado.
        return colunas[columnIndex];
    };

    /* Retorna a classe dos elementos da coluna especificada.
     * Este método é usado pela JTable na hora de definir o editor da célula. */
    @Override
    public Class<?> getColumnClass(int columnIndex) {
        // Retorna a classe referente a coluna especificada.
        // Aqui é feito um switch para verificar qual é a coluna
        // e retornar o tipo adequado. As colunas são as mesmas
        // que foram especificadas no array "colunas".
       
        return String.class;
        
        /*
        switch (columnIndex) {

        case 0: // Primeira coluna é o titulo, que é uma String.
            return String.class;
        case 1: // Segunda coluna é a descricao, que também é uma String..
            
            return String.class;
        default:
            // Se o índice da coluna não for válido, lança um
            // IndexOutOfBoundsException (Exceção de índice fora dos limites).
            // Não foi necessário verificar se o índice da linha é inválido,
            // pois o próprio ArrayList lança a exceção caso seja inválido.
                    //MsgBox.INFORMATIVO("O índice informado não existe!");
                    return null;
        }*/
    }

    /* Retorna o valor da célula especificada
     * pelos índices da linha e da coluna. */
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        // Pega a atividade da linha especificada.       
        Bolsista bols = linhas.get(rowIndex);

        // Retorna o campo referente a coluna especificada.
        // Aqui é feito um switch para verificar qual é a coluna
        // e retornar o campo adequado. As colunas são as mesmas
        // que foram especificadas no array "colunas".
       
       /* //COMO TRABALHO COM UMA COLUNA TOQUEI O SWITCH EMBAIXO POR IF
       if(columnIndex == 0){
           return bols.getNome();
       } else{
           return null;
       }*/
        
       //CASO TABALHARMOS COM MAIS DE UMA COLUNA
         switch (columnIndex) {
        case 0: // Primeira coluna é o nome.
            return bols.getNome();
        case 1: // segunda coluna é o cpf.
            return bols.getMatricula();
        case 2:
            return bols.getEmail();
        case 3:
            return bols.getTelefone();
        default:
            // Se o índice da coluna não for válido, lança um
            // IndexOutOfBoundsException (Exceção de índice fora dos limites).
            // Não foi necessário verificar se o índice da linha é inválido,
            // pois o próprio ArrayList lança a exceção caso seja inválido.
                    //MsgBox.INFORMATIVO("O índice informado não existe!");    
                    return null;
        
        }

    }

    /*Metodo que define se a cell é editavel, no caso não é */
    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return false;
    }

}