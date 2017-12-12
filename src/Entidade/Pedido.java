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
public class Pedido {
    
    private Long codigoPedido;
    private String nomePedido;
    private int mesaPedido;
    private String nomeGarcomPedido;
    private float precoPedido;
    private String tamanhoPedido;
    private boolean andamentoPedido;
    private boolean pgtPedido;

    public Pedido(String nomePedido, int mesaPedido, String nomeGarcomPedido, float precoPedido, String tamanhoPedido, boolean andamentoPedido, boolean pgtPedido) {
        this.nomePedido = nomePedido;
        this.mesaPedido = mesaPedido;
        this.nomeGarcomPedido = nomeGarcomPedido;
        this.precoPedido = precoPedido;
        this.tamanhoPedido = tamanhoPedido;
        this.andamentoPedido = andamentoPedido;
        this.pgtPedido = pgtPedido;
    }

    public Pedido(Long codigoPedido, String nomePedido, int mesaPedido, String nomeGarcomPedido, float precoPedido, String tamanhoPedido, boolean andamentoPedido, boolean pgtPedido) {
        this.codigoPedido = codigoPedido;
        this.nomePedido = nomePedido;
        this.mesaPedido = mesaPedido;
        this.nomeGarcomPedido = nomeGarcomPedido;
        this.precoPedido = precoPedido;
        this.tamanhoPedido = tamanhoPedido;
        this.andamentoPedido = andamentoPedido;
        this.pgtPedido = pgtPedido;
    }
    
    

    public Long getCodigoPedido() {
        return codigoPedido;
    }

    public void setCodigoPedido(Long codigoPedido) {
        this.codigoPedido = codigoPedido;
    }

    public String getNomePedido() {
        return nomePedido;
    }

    public void setNomePedido(String nomePedido) {
        this.nomePedido = nomePedido;
    }

    public int getMesaPedido() {
        return mesaPedido;
    }

    public void setMesaPedido(int mesaPedido) {
        this.mesaPedido = mesaPedido;
    }

    public String getNomeGarcomPedido() {
        return nomeGarcomPedido;
    }

    public void setNomeGarcomPedido(String nomeGarcomPedido) {
        this.nomeGarcomPedido = nomeGarcomPedido;
    }

    public float getPrecoPedido() {
        return precoPedido;
    }

    public void setPrecoPedido(float precoPedido) {
        this.precoPedido = precoPedido;
    }

    public String getTamanhoPedido() {
        return tamanhoPedido;
    }

    public void setTamanhoPedido(String tamanhoPedido) {
        this.tamanhoPedido = tamanhoPedido;
    }

    public boolean isAndamentoPedido() {
        return andamentoPedido;
    }

    public void setAndamentoPedido(boolean andamentoPedido) {
        this.andamentoPedido = andamentoPedido;
    }
    public boolean isPgtPedido() {
        return pgtPedido;
    }

    public void setPgtPedido(boolean pgtPedido) {
        this.pgtPedido = pgtPedido;
    }
    
}
