/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sgbaalfa;

import java.util.Date;

/**
 *
 * @author joffr
 */
public class Ocorrencia {
    String descricao, responsavel;
    Date data;
    int idResponsavel;
    String setor;

    public Ocorrencia(String descricao, String responsavel, Date data, int idResponsavel, String setor) {
        this.descricao = descricao;
        this.responsavel = responsavel;
        this.data = data;
        this.idResponsavel = idResponsavel;
        this.setor = setor;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(String responsavel) {
        this.responsavel = responsavel;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public int getIdResponsavel() {
        return idResponsavel;
    }

    public void setIdResponsavel(int idResponsavel) {
        this.idResponsavel = idResponsavel;
    }
    
    
}
