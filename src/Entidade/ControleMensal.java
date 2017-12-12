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
public class ControleMensal {
    
    private Long codigoContmensal;
    private String dataDiaria;
    private float valorVendido;
    private int itensVendidos;

    public ControleMensal(String dataDiaria, float valorVendido, int itensVendidos) {
        this.dataDiaria = dataDiaria;
        this.valorVendido = valorVendido;
        this.itensVendidos = itensVendidos;
    }

    public Long getCodigoContmensal() {
        return codigoContmensal;
    }

    public void setCodigoContmensal(Long codigoContmensal) {
        this.codigoContmensal = codigoContmensal;
    }

    public String getDataDiaria() {
        return dataDiaria;
    }

    public void setDataDiaria(String dataDiaria) {
        this.dataDiaria = dataDiaria;
    }

    public float getValorVendido() {
        return valorVendido;
    }

    public void setValorVendido(float valorVendido) {
        this.valorVendido = valorVendido;
    }

    public int getItensVendidos() {
        return itensVendidos;
    }

    public void setItensVendidos(int itensVendidos) {
        this.itensVendidos = itensVendidos;
    }
}
