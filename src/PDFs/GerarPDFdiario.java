/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PDFs;

import Entidade.Pedido;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author AndrheiHenrique
 */
public class GerarPDFdiario {
    
    private static Font fonteCabecalho = new Font(Font.FontFamily.TIMES_ROMAN, 15,  Font.BOLD | Font.BOLDITALIC);
    private static Font fonteCabecalho1 = new Font(Font.FontFamily.TIMES_ROMAN, 13,  Font.BOLD | Font.BOLDITALIC);
    private static Font fontePadrao = new Font(Font.FontFamily.TIMES_ROMAN, 10);
    private static Font fontePequena = new Font(Font.FontFamily.TIMES_ROMAN, 6);
    
    private NumberFormat formatter = new DecimalFormat("0.00");
    
    private static GerarPDFdiario instance;
    public static GerarPDFdiario getInstance(){
        if(instance == null){
            instance = new GerarPDFdiario();
        }
        return instance;
    }
    
    public void GeraPDF (ArrayList<Pedido> gerar, String url, float total){
        int qtdGerar = gerar.size(); 

        Document document = new Document();
        
        
          try{
              
              PdfWriter.getInstance(document, new FileOutputStream(url+".pdf"));
              document.open();
              
              PdfPTable tabela0 = new PdfPTable(3);
              Image imagem = Image.getInstance("C:\\Users\\Andrh\\Desktop\\Curso\\TCC - FusionFood\\F_A_FusionFood\\src\\Imagens\\logopreta.png");
              PdfPCell celulaLogo = new PdfPCell(imagem);
              celulaLogo.setBorder(0);
              tabela0.addCell(celulaLogo);
              
              PdfPCell celulaI = new PdfPCell(new Paragraph("\n \n \nAv.Programação Extrema, 0100011001000001\nCentro - Vale do Silício",fonteCabecalho1));
              celulaI.setHorizontalAlignment(Element.ALIGN_CENTER);
              celulaI.setColspan(2);
              celulaI.setBorder(0);
              tabela0.addCell(celulaI);
                            
              PdfPCell celulaC1 = new PdfPCell(new Paragraph("Pedido",fonteCabecalho));
              celulaC1.setBorderWidth(2);
              celulaC1.setBorderWidthBottom(0);
              tabela0.addCell(celulaC1);

              PdfPCell celulaC2 = new PdfPCell(new Paragraph("Nome Garçom",fonteCabecalho));
              celulaC2.setHorizontalAlignment(Element.ALIGN_CENTER);
              celulaC2.setBorderWidth(2);
              celulaC2.setBorderWidthBottom(0);
              tabela0.addCell(celulaC2);
              
              PdfPCell celulaC3 = new PdfPCell(new Paragraph("Preço Pedido",fonteCabecalho));
              celulaC3.setHorizontalAlignment(Element.ALIGN_RIGHT);              
              celulaC3.setBorderWidth(2);
              celulaC3.setBorderWidthBottom(0);
              tabela0.addCell(celulaC3);
              
              document.add(tabela0);
              
              for(int i = 0;qtdGerar > i;i++){
                  
              Pedido p = gerar.get(i);
              PdfPTable tabela = new PdfPTable(3);
              
              PdfPCell celula0 = new PdfPCell(new Paragraph(" "+p.getNomePedido(),fontePadrao));
              celula0.setBorder(0);
              if(i == 0){
              celula0.setBorderWidthTop(2);
              }
              if(qtdGerar-1 == i){
              celula0.setBorderWidthBottom(2);
              }
              celula0.setBorderWidthLeft(2);
              celula0.setHorizontalAlignment(Element.ALIGN_LEFT);
              tabela.addCell(celula0);
              
              PdfPCell celula1 = new PdfPCell(new Paragraph(p.getNomeGarcomPedido(),fontePadrao));
              celula1.setBorder(0);
              if(i == 0){
              celula1.setBorderWidthTop(2);
              }
              if(qtdGerar-1 == i){
              celula1.setBorderWidthBottom(2);
              }
              celula1.setHorizontalAlignment(Element.ALIGN_CENTER);
              tabela.addCell(celula1);
              
              PdfPCell celula2 = new PdfPCell(new Paragraph("R$ "+String.valueOf(formatter.format(p.getPrecoPedido()))+"  ",fontePadrao));
              celula2.setBorder(0);
              celula2.setBorderWidthRight(2);
              if(i == 0){
              celula2.setBorderWidthTop(2);
              }
              if(qtdGerar-1 == i){
              celula2.setBorderWidthBottom(2);
              }
              celula2.setHorizontalAlignment(Element.ALIGN_RIGHT);
              tabela.addCell(celula2);
             
              document.add(tabela);

              }
              PdfPTable tabelaTotal = new PdfPTable(3);
              PdfPCell celula = new PdfPCell(new Paragraph(String.valueOf("\nTotal: R$ "+formatter.format(total))));
              celula.setBorder(0);
              celula.setColspan(3);
              celula.setHorizontalAlignment(Element.ALIGN_RIGHT);
              tabelaTotal.addCell(celula);
              document.add(tabelaTotal);
              
              PdfPTable tabela1 = new PdfPTable(3);
              Image imagem1 = Image.getInstance("C:\\Users\\AndrheiHenriqueQueir\\Desktop\\curso\\TCC - FusionFood\\F_A_FusionFood\\src\\Imagens\\QR.jpg");
              PdfPCell celulaQRCode = new PdfPCell(imagem1);
              celulaQRCode.setHorizontalAlignment(Element.ALIGN_CENTER);              
              celulaQRCode.setBorder(0);
              celulaQRCode.setRowspan(3);
              celulaQRCode.setColspan(3);
              tabela1.addCell(celulaQRCode);
              
              PdfPCell celulaT = new PdfPCell(new Paragraph("Acesse o site da Fusion Apps através do QRcode.",fontePequena));
              celulaT.setHorizontalAlignment(Element.ALIGN_CENTER);   
              celulaT.setBorder(0);
              celulaT.setRowspan(3);
              celulaT.setColspan(3);
              tabela1.addCell(celulaT);
              
              document.add(tabela1);
              
              JOptionPane.showMessageDialog(null, "PDF gerado com sucesso!");
             
        }catch(DocumentException de) {
              System.err.println(de.getMessage());
        }catch(IOException ioe) {
              System.err.println(ioe.getMessage());
    }
    document.close();
    }   
}