/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fusionfood;

import Entidade.Pedido;
import java.util.ArrayList;
import javax.swing.JFileChooser;

/**
 *
 * @author AndrheiHenrique
 */
public class FusionFood {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        /** TESTA O PDF!!!
        * ArrayList<Pedido> gerarPDF =  new ArrayList();
        * float Total = (float) 5.00;
        * Pedido p = new Pedido("Bolo de Cenoura", 4, "Andrhei", (float) 5.00, "null", false, true);
        * gerarPDF.add(p);
        * 
        * String url = null;
        * JFileChooser menu = new JFileChooser();
        * Menu.showOpenDialog(menu);
        * url=Menu.getSelectedFile().getPath();
        * PDFs.gerarPDFdiario.getInstance().geraPDF(gerarPDF,URL,Total);
        **/
        new Telas.TelaLogin().setVisible(true);
    }
    
}
