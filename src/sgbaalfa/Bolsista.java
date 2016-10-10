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
public class Bolsista extends Usuario{
    private String matricula;

    public Bolsista(String nome, String cpf, String email, String senha, char tipoUser, String matricula) {
        super(nome, cpf, email, senha, tipoUser);
        this.matricula = matricula;
    }  

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    
    public void registrarPresenca(){
        
    }
}
