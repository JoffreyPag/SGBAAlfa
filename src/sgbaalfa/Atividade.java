package sgbaalfa;

import java.util.ArrayList;

/**
 *
 * @author joffr
 */
public class Atividade {
    ArrayList<Bolsista> usuarios;
    String descricao, titulo;

    public Atividade(String descricao, String titulo) {
        this.descricao = descricao;
        this.titulo = titulo;
    }
    
    
    public ArrayList<Bolsista> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(ArrayList<Bolsista> usuarios) {
        this.usuarios = usuarios;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    
    
    
}
