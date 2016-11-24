package utilitarios;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author joffr
 */
public class conexao {
    public Statement stm;
    public ResultSet rs;
    public String driver;
    public String caminho;
    public String usuario;
    public String senha;
    public Connection conn;

    public conexao() {
        this.driver  = "com.mysql.jdbc.Driver";
        this.caminho = "jdbc:mysql://localhost:3306/aquicultura";
        this.usuario = "root";
        this.senha = "";
    }
    
    
    
    public void conectar(){
        System.setProperty("jdbc.Drivers", driver);
        try {
            conn = DriverManager.getConnection(caminho, usuario, senha);
            JOptionPane.showMessageDialog(null, "Conectado!");
            
            
        } catch (SQLException ex) {
            Logger.getLogger(conexao.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Falha na conexão\nErro:"+ex.getMessage());
        }
    }
    
    public void desconecta(){
        try {
            conn.close();
            JOptionPane.showMessageDialog(null, "Desconectado");
        } catch (SQLException ex) {
            Logger.getLogger(conexao.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro:"+ex.getMessage());
        }
        
    }
    
    public Connection getConexao() {
		return conn;
	}
}
