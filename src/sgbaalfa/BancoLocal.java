/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sgbaalfa;

import java.util.ArrayList;

/**
 *
 * @author Washington
 */
public class BancoLocal {
    private ArrayList<Bolsista> bolsistas;
    
    public BancoLocal() {
        this.bolsistas = new ArrayList<Bolsista>();
        //Bolsista(String nome, String cpf, String email, String senha, char tipoUser, String matricula)
        bolsistas.add(new Bolsista("Joffrey","000.000.000.00","joffrey@gmail.com","123","1234567890",'n',"0000"));
        bolsistas.add(new Bolsista("Washington","111.111.111.11","washington@gmail.com","123","1234567890",'n',"1111"));
        bolsistas.add(new Bolsista("Eric","222.222.222.22","eric@gmail.com","123","1234567890",'n',"2222"));
        bolsistas.add(new Bolsista("Laercio","333.333.333.333","laercio@gmail.com","123","1234567890",'n',"3333"));
        bolsistas.add(new Bolsista("Larysse","4444.4444.4444.44","larysse@gmail.com","123","1234567890",'n',"4444"));
        bolsistas.add(new Bolsista("João Pedro","555.555.555.55","joao_pedro@gmail.com","123","1234567890",'n',"5555"));
        bolsistas.add(new Bolsista("Sarah","666.666.666.66","sarah@gmail.com","123","1234567890",'n',"6666"));
        bolsistas.add(new Bolsista("Taniro","777.777.777.77","taniro@gmail.com","123","1234567890",'n',"7777"));
        bolsistas.add(new Bolsista("Isaac","888.888.888.88","isaac@gmail.com","123","1234567890",'n',"8888"));
        bolsistas.add(new Bolsista("Laura","999.999.999.99","laura@gmail.com","123","1234567890",'n',"9999"));
        bolsistas.add(new Bolsista("Josenalde","101.010.101.01","josenalde@gmail.com","123","1234567890",'n',"1010"));
        bolsistas.add(new Bolsista("Alessandra","011.011.011.11","alessandra@gmail.com","123","1234567890",'n',"0011"));
        bolsistas.add(new Bolsista("Leonardo","012.012.012.12","leonardo@gmail.com","123","1234567890",'n',"0012"));
    }
    //Getters and Setters
    public ArrayList<Bolsista> getBolsistas() {
        return bolsistas;
    }

    public void setBolsistas(ArrayList<Bolsista> bolsistas) {
        this.bolsistas = bolsistas;
    }
}
