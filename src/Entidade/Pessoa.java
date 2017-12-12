/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidade;

/**
 *
 * @author AndrheiHenrique
 */
public class Pessoa {
    
    private Long idPessoa;
    private String nomePessoa;
    private String loginPessoa;
    private String perfilPessoa;
    private String senhaPessoa;

    public Pessoa(String nomePessoa, String loginPessoa, String perfilPessoa, String senhaPessoa) {
        this.nomePessoa = nomePessoa;
        this.loginPessoa = loginPessoa;
        this.perfilPessoa = perfilPessoa;
        this.senhaPessoa = senhaPessoa;
    }

    public Pessoa(String loginPessoa, String senhaPessoa) {
        this.loginPessoa = loginPessoa;
        this.senhaPessoa = senhaPessoa;
    }

    public Pessoa(Long idPessoa, String nomePessoa, String loginPessoa, String perfilPessoa, String senhaPessoa) {
        this.idPessoa = idPessoa;
        this.nomePessoa = nomePessoa;
        this.loginPessoa = loginPessoa;
        this.perfilPessoa = perfilPessoa;
        this.senhaPessoa = senhaPessoa;
    }
    
    

    public Long getIdPessoa() {
        return idPessoa;
    }

    public void setIdPessoa(Long idPessoa) {
        this.idPessoa = idPessoa;
    }

    public String getNomePessoa() {
        return nomePessoa;
    }

    public void setNomePessoa(String nomePessoa) {
        this.nomePessoa = nomePessoa;
    }

    public String getLoginPessoa() {
        return loginPessoa;
    }

    public void setLoginPessoa(String loginPessoa) {
        this.loginPessoa = loginPessoa;
    }

    public String getPerfilPessoa() {
        return perfilPessoa;
    }

    public void setPerfilPessoa(String perfilPessoa) {
        this.perfilPessoa = perfilPessoa;
    }

    public String getSenhaPessoa() {
        return senhaPessoa;
    }

    public void setSenhaPessoa(String senhaPessoa) {
        this.senhaPessoa = senhaPessoa;
    }

    @Override
    public String toString() {
        return "Pessoa{" + "idPessoa=" + idPessoa + ", nomePessoa=" + nomePessoa + ", loginPessoa=" + loginPessoa + ", perfilPessoa=" + perfilPessoa + ", senhaPessoa=" + senhaPessoa + '}';
    }

    
    
}
