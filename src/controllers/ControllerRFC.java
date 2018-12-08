/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;
import views.ViewRFC;
import models.ModelRFC;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import extras.DataValidation;
import javax.swing.JOptionPane;

/**
 *
 * @author galacxter infnity
 */
public class ControllerRFC {
    
    ViewRFC view_rfc;
    ModelRFC model_rfc;
    DataValidation dv;
    MouseListener ml = new MouseListener(){
        @Override
        public void mouseClicked(MouseEvent e) {
            if (e.getSource() == view_rfc.jb_calcular){
                calcular();
            }
        }

        @Override
        public void mousePressed(MouseEvent e) {
            
        }

        @Override
        public void mouseReleased(MouseEvent e) {
            
        }

        @Override
        public void mouseEntered(MouseEvent e) {
            
        }

        @Override
        public void mouseExited(MouseEvent e) {
            
        }
    };
    public void Datos(){
        if(view_rfc.jtf_nombre.getText().isEmpty() || view_rfc.jtf_apep.getText().isEmpty() || view_rfc.jtf_apem.getText().isEmpty() ){
            JOptionPane.showMessageDialog(view_rfc,"Debe agregar valores!");
        }
        else{
            model_rfc.setApep(view_rfc.jtf_apep.getText());
            model_rfc.setApem(view_rfc.jtf_apem.getText());
            model_rfc.setNombre(view_rfc.jtf_nombre.getText());
            model_rfc.setDia_n(view_rfc.jcb_dn.getSelectedItem().toString());
            model_rfc.setMes_n(view_rfc.jcb_mn1.getSelectedItem().toString());
            model_rfc.setAnio_n(view_rfc.jcb_an1.getSelectedItem().toString());
           
        }
    }
    public void calcular(){
        Datos();
        String apep = model_rfc.getApep().trim().toUpperCase().substring(0,2);
        String apem = model_rfc.getApem().trim().toUpperCase().substring(0,1);
        String nombre = model_rfc.getNombre().trim().toUpperCase().substring(0,1);
        String dia_n = model_rfc.getDia_n();
        String mes_n = model_rfc.getMes_n();
        String anio_n = model_rfc.getAnio_n().trim().substring(2, 4);
        view_rfc.jl_rfc.setText("RFC: "+ apep.concat(apem).concat(nombre).concat(dia_n).concat(mes_n).concat(anio_n));
    }
    public ControllerRFC(ViewRFC viewRfc, ModelRFC modelRfc) {
        this.view_rfc = viewRfc;
        this.model_rfc = modelRfc;
        this.view_rfc.jb_calcular.addMouseListener(ml);
        initComponents();
    }
    
    private void initComponents(){
        view_rfc.setVisible(true);
    }
    
}
