/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;
import views.ViewRFC;
import models.ModelRFC;
import controllers.ControllerRFC;
/**
 *
 * @author galacxter infnity
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ModelRFC modelRfc = new ModelRFC();
        ViewRFC viewRfc =  new ViewRFC();
        ControllerRFC controllerRfc = new ControllerRFC(viewRfc,modelRfc);
    }
    
}
