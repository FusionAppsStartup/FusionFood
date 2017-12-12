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
public class Prato {
    
    private Long codigoPrato;
    private String nomePrato;    
    private String categoriaPrato;    
    private String descricaoPrato;    
    private float precoPrato;    

    public Prato(Long codigoPrato, String nomePrato, String categoriaPrato, String descricaoPrato, float precoPrato) {
        this.codigoPrato = codigoPrato;
        this.nomePrato = nomePrato;
        this.categoriaPrato = categoriaPrato;
        this.descricaoPrato = descricaoPrato;
        this.precoPrato = precoPrato;
    }

    public Prato(String nomePrato, String categoriaPrato, String descricaoPrato, float precoPrato) {
        this.nomePrato = nomePrato;
        this.categoriaPrato = categoriaPrato;
        this.descricaoPrato = descricaoPrato;
        this.precoPrato = precoPrato;
    }
    
    public Long getCodigoPrato() {
        return codigoPrato;
    }

    public void setCodigoPrato(Long codigoPrato) {
        this.codigoPrato = codigoPrato;
    }

    public String getNomePrato() {
        return nomePrato;
    }

    public void setNomePrato(String nomePrato) {
        this.nomePrato = nomePrato;
    }

    public String getCategoriaPrato() {
        return categoriaPrato;
    }

    public void setCategoriaPrato(String categoriaPrato) {
        this.categoriaPrato = categoriaPrato;
    }

    public String getDescricaoPrato() {
        return descricaoPrato;
    }

    public void setDescricaoPrato(String descricaoPrato) {
        this.descricaoPrato = descricaoPrato;
    }

    public float getPrecoPrato() {
        return precoPrato;
    }

    public void setPrecoPrato(float precoPrato) {
        this.precoPrato = precoPrato;
    }

    @Override
    public String toString() {
        return "Prato{" + "codigoPrato=" + codigoPrato + ", nomePrato=" + nomePrato + ", categoriaPrato=" + categoriaPrato + ", descricaoPrato=" + descricaoPrato + ", precoPrato=" + precoPrato + '}';
    }
    
}
