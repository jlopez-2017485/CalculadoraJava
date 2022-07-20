/*
    DOCUMENTACIÓN:
Programador:
    Jose Daniel López Marroquín 2017485
Creación: 
    06/05/2021
Arreglos:
    07/05/2021
    08/05/2021
*/
package org.joselopez.system;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 *
 * @author Jose López
 */
public class FXMLDocumentController implements Initializable {
    double dato1 = 0, dato2 = 0, resultado = 0;
    int op;
    
    @FXML private Button btnUno;
    @FXML private Button btnDos;
    @FXML private Button btnTres;
    @FXML private Button btnCuatro;
    @FXML private Button btnCinco;
    @FXML private Button btnSeis;
    @FXML private Button btnSiete;
    @FXML private Button btnOcho;
    @FXML private Button btnNueve;
    @FXML private Button btnMasMenos;
    @FXML private Button btnCero;
    @FXML private Button btnPunto;
    @FXML private Button btnIgual;
    @FXML private Button btnSum;
    @FXML private Button btnRest;
    @FXML private Button btnMult;
    @FXML private Button btnDiv;
    @FXML private Button btnC;
    @FXML private Button btnCE;
    @FXML private Button btnPorcentaje;
    @FXML private Button btnXY;
    @FXML private Button btnABS;
    @FXML private Button btnRaiz;
    @FXML private TextField txtPantalla;
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
       if (event.getSource()==btnUno)
           txtPantalla.setText(txtPantalla.getText() + "1");
       else if (event.getSource()==btnDos)
           txtPantalla.setText(txtPantalla.getText() + "2");
       else if (event.getSource()==btnTres)
           txtPantalla.setText(txtPantalla.getText() + "3");
       else if (event.getSource()==btnCuatro)
           txtPantalla.setText(txtPantalla.getText() + "4");
       else if (event.getSource()==btnCinco)
           txtPantalla.setText(txtPantalla.getText() + "5");
       else if (event.getSource()==btnSeis)
           txtPantalla.setText(txtPantalla.getText() + "6");
       else if (event.getSource()==btnSiete)
           txtPantalla.setText(txtPantalla.getText() + "7");
       else if (event.getSource()==btnOcho)
           txtPantalla.setText(txtPantalla.getText() + "8");
       else if (event.getSource()==btnNueve)
           txtPantalla.setText(txtPantalla.getText() + "9");
       else if (event.getSource()==btnCero)
           txtPantalla.setText(txtPantalla.getText() + "0");
       
       else if (event.getSource() == btnSum) {
           dato1 = Double.parseDouble(txtPantalla.getText());
           txtPantalla.clear();
           op = 1;
           btnPunto.setDisable(false);
       }
       else if (event.getSource() == btnRest) {
           dato1 = Double.parseDouble(txtPantalla.getText());
           txtPantalla.clear();
           op = 2;
           btnPunto.setDisable(false);
       }
       else if (event.getSource() == btnMult){
           dato1 = Double.parseDouble(txtPantalla.getText());
           txtPantalla.clear();
           op = 3;
           btnPunto.setDisable(false);
       }
       else if (event.getSource() == btnDiv) {
           dato1 = Double.parseDouble(txtPantalla.getText());
           txtPantalla.clear();
           op = 4;
           btnPunto.setDisable(false);
       }
       else if (event.getSource() == btnXY) {
           dato1 = Double.parseDouble(txtPantalla.getText());
           txtPantalla.clear();
           op = 5;
           btnPunto.setDisable(false);
       }
       
       else if (event.getSource() == btnMasMenos) {
           if (Double.parseDouble(txtPantalla.getText())>0) 
               txtPantalla.setText(String.valueOf(Double.parseDouble(txtPantalla.getText())* -1));
           else 
               txtPantalla.setText(String.valueOf(Double.parseDouble(txtPantalla.getText())* -1));
           btnPunto.setDisable(false);
       }       

       else if (event.getSource() == btnC) {
           dato1 = 0;
           dato2 = 0;
           //aquí vi que usted agrego la variable resultado, pero creo que no hace falta
           //ya que en el momento que le demos a "C" lo limpiara si esta en el textField
           txtPantalla.clear();
           btnPunto.setDisable(false);
       }
       
       else if (event.getSource() == btnCE) {
           txtPantalla.clear();
           btnPunto.setDisable(false);
       }

       else if(event.getSource() == btnABS) {
           txtPantalla.setText(String.valueOf(Math.abs(Double.parseDouble(txtPantalla.getText()))));
           btnPunto.setDisable(false);
       }
       
       else if (event.getSource() == btnRaiz) {
           dato1 = Double.parseDouble(txtPantalla.getText());
           txtPantalla.clear();
           resultado = Math.sqrt(dato1);
           txtPantalla.setText(String.valueOf(resultado));
       }    
       
       else if (event.getSource() == btnPorcentaje) {
           dato2 = Double.parseDouble(txtPantalla.getText());
           txtPantalla.clear();
           resultado = (dato1 * dato2)/100;
           txtPantalla.setText(String.valueOf(resultado));
       }
       else if (event.getSource() == btnPunto) {
           txtPantalla.setText(txtPantalla.getText() + ".");
           btnPunto.setDisable(true);
       }
       
       else if(event.getSource() == btnIgual) {
           dato2 = Double.parseDouble(txtPantalla.getText());
           txtPantalla.clear();
           switch(op){
               case 1:
                    resultado = dato1 + dato2;
                    txtPantalla.setText(String.valueOf(resultado));
               break;
               case 2:
                    resultado = dato1 - dato2;
                    txtPantalla.setText(String.valueOf(resultado));
               break;
               case 3:
                   resultado = dato1 * dato2;
                   txtPantalla.setText(String.valueOf(resultado));
               break;
               case 4:
                   resultado = dato1 / dato2;
                   txtPantalla.setText(String.valueOf(resultado));
               break;
               case 5:
                   resultado = Math.pow(dato1, dato2);
                   txtPantalla.setText(String.valueOf(resultado));
               break;
           }

       }
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
