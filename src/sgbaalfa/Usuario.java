/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sgbaalfa;

/**
 *
 * @author joffr
 */
public abstract class Usuario {
    private int id;
    private String nome, cpf, email, senha, telefone;
    private char tipoUser;

    public Usuario(String nome, String cpf, String email, String senha, String telefone, char tipoUser) {
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.senha = senha;
        this.telefone = telefone;
        this.tipoUser = tipoUser;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
 
    public char getTipoUser() {
        return tipoUser;
    }

    public void setTipoUser(char tipoUser) {
        this.tipoUser = tipoUser;
    }
    
    public void consultarAtividades(){
        
    }
    public void criarOcorrencia(){
        
    }
    public void consultarOcorrencias(){
        
    }
}
