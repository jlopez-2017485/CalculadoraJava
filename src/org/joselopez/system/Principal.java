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

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author LENOVO
 */
public class Principal extends Application {
    
    @Override
    public void start(Stage EscenarioPrincipal) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
        
        Scene scene = new Scene(root);
        
        EscenarioPrincipal.setScene(scene);
        EscenarioPrincipal.setTitle("Calculadora Jose López 2017485");
        EscenarioPrincipal.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
