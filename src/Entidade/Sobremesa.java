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
public class Sobremesa {
    
    private Long codigoSobremesa;
    private String nomeSobremesa;
    private String descricaoSobremesa;
    private float precoSobremesa;

    public Sobremesa(Long codigoSobremesa, String nomeSobremesa, String descricaoSobremesa, float precoSobremesa) {
        this.codigoSobremesa = codigoSobremesa;
        this.nomeSobremesa = nomeSobremesa;
        this.descricaoSobremesa = descricaoSobremesa;
        this.precoSobremesa = precoSobremesa;
    }

    public Sobremesa(String nomeSobremesa, String descricaoSobremesa, float precoSobremesa) {
        this.nomeSobremesa = nomeSobremesa;
        this.descricaoSobremesa = descricaoSobremesa;
        this.precoSobremesa = precoSobremesa;
    }
    
    

    public Long getCodigoSobremesa() {
        return codigoSobremesa;
    }

    public void setCodigoSobremesa(Long codigoSobremesa) {
        this.codigoSobremesa = codigoSobremesa;
    }

    public String getNomeSobremesa() {
        return nomeSobremesa;
    }

    public void setNomeSobremesa(String nomeSobremesa) {
        this.nomeSobremesa = nomeSobremesa;
    }

    public String getDescricaoSobremesa() {
        return descricaoSobremesa;
    }

    public void setDescricaoSobremesa(String descricaoSobremesa) {
        this.descricaoSobremesa = descricaoSobremesa;
    }

    public float getPrecoSobremesa() {
        return precoSobremesa;
    }

    public void setPrecoSobremesa(float precoSobremesa) {
        this.precoSobremesa = precoSobremesa;
    }

    @Override
    public String toString() {
        return "Sobremesa{" + "codigoSobremesa=" + codigoSobremesa + ", nomeSobremesa=" + nomeSobremesa + ", descricaoSobremesa=" + descricaoSobremesa + ", precoSobremesa=" + precoSobremesa + '}';
    }
}
