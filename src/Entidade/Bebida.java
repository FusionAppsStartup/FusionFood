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
public class Bebida {
    
    private Long codigoBebida;
    private String nomeBebida;
    private String descricaoBebida;
    private String categoriaBebida;
    private String tamanhoBebida;
    private float precoBebida;
    

    public Bebida(Long codigoBebida, String nomeBebida, String descricaoBebida, String categoriaBebida, String tamanhoBebida, float precoBebida) {
        this.codigoBebida = codigoBebida;
        this.nomeBebida = nomeBebida;
        this.descricaoBebida = descricaoBebida;
        this.categoriaBebida = categoriaBebida;
        this.tamanhoBebida = tamanhoBebida;
        this.precoBebida = precoBebida;
    }

    public Bebida(String nomeBebida, String descricaoBebida, String categoriaBebida, String tamanhoBebida, float precoBebida) {
        this.nomeBebida = nomeBebida;
        this.descricaoBebida = descricaoBebida;
        this.categoriaBebida = categoriaBebida;
        this.tamanhoBebida = tamanhoBebida;
        this.precoBebida = precoBebida;
    }
    
    

    public Long getCodigoBebida() {
        return codigoBebida;
    }

    public void setCodigoBebida(Long codigoBebida) {
        this.codigoBebida = codigoBebida;
    }

    public String getNomeBebida() {
        return nomeBebida;
    }

    public void setNomeBebida(String nomeBebida) {
        this.nomeBebida = nomeBebida;
    }

    public String getDescricaoBebida() {
        return descricaoBebida;
    }

    public void setDescricaoBebida(String descricaoBebida) {
        this.descricaoBebida = descricaoBebida;
    }

    public String getCategoriaBebida() {
        return categoriaBebida;
    }

    public void setCategoriaBebida(String categoriaBebida) {
        this.categoriaBebida = categoriaBebida;
    }

    public String getTamanhoBebida() {
        return tamanhoBebida;
    }

    public void setTamanhoBebida(String tamanhoBebida) {
        this.tamanhoBebida = tamanhoBebida;
    }

    public float getPrecoBebida() {
        return precoBebida;
    }

    public void setPrecoBebida(float precoBebida) {
        this.precoBebida = precoBebida;
    }

    @Override
    public String toString() {
        return "Bebida{" + "codigoBebida=" + codigoBebida + ", nomeBebida=" + nomeBebida + ", descricaoBebida=" + descricaoBebida + ", categoriaBebida=" + categoriaBebida + ", tamanhoBebida=" + tamanhoBebida + ", precoBebida=" + precoBebida + '}';
    }
    
}
