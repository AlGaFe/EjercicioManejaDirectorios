/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciomanejadirectorios;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

/**
 *
 * @author Alvaro
 */
public class FXMLDocumentController implements Initializable {
    
    private Label label;
    @FXML
    private TextField TextFieldRuta;
    @FXML
    private Button ButtonAbrir;
    @FXML
    private RadioButton ListarContenido;
    @FXML
    private RadioButton ListarFiltrado;
    @FXML
    private TextField TextFieldCadenaFiltrado;
    @FXML
    private RadioButton ListarArchivosSoloLectura;
    @FXML
    private RadioButton ListarTamaño;
    @FXML
    private TextField TextFieldArchivoBytes;
    @FXML
    private RadioButton ListarTamaño1;
    @FXML
    private TextField TextFieldNombreArchivo;
    @FXML
    private Button ButtonEjecutarOpcion;
    @FXML
    private TextArea TextAreaDisplay;
    @FXML
    private Button ButtonSalir;
    
    private void handleButtonAction(ActionEvent event) {
      
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void ActionTextFieldRuta(ActionEvent event) {
    }

    @FXML
    private void ActionButtonAbrir(ActionEvent event) {
    }

    @FXML
    private void ActionTextFieldCadenaFiltrado(ActionEvent event) {
    }

    @FXML
    private void ActionTextFiledArchivoBytes(ActionEvent event) {
    }

    @FXML
    private void ActionTextFieldNombreArchivo(ActionEvent event) {
    }

    @FXML
    private void ActionButtonEjecutarOpcion(ActionEvent event) {
    }

    @FXML
    private void ACtionTextAreaDisplay(MouseEvent event) {
    }

    @FXML
    private void ActionButtonSalir(ActionEvent event) {
    }

    @FXML
    private void ActionOpciones(ActionEvent event) {
    }
    
}
