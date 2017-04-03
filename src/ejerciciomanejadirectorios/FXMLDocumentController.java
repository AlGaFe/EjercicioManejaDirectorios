package ejerciciomanejadirectorios;

import Modelo.AccionesDirectorio;
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
import javafx.scene.control.ToggleGroup;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;

/* @author Alvaro */
public class FXMLDocumentController implements Initializable {

    ToggleGroup opciones = new ToggleGroup();
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
    private TextField TextFieldNombreArchivo;
    @FXML
    private Button ButtonEjecutarOpcion;
    @FXML
    private TextArea TextAreaDisplay;
    @FXML
    private Button ButtonSalir;
    @FXML
    private RadioButton CrearArchivoNuevo;
    @FXML
    private Pane PaneOpciones;
    private AccionesDirectorio accionesDirectorio = new AccionesDirectorio();

    private void handleButtonAction(ActionEvent event) {

    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        TextFieldCadenaFiltrado.setStyle("-fx-background-color : #D5F7B6;");
        TextFieldNombreArchivo.setStyle("-fx-background-color : #D5F7B6;");
        TextFieldArchivoBytes.setStyle("-fx-background-color : #D5F7B6;");
        TextFieldRuta.setStyle("-fx-background-color :#D5F7B6;");
        PaneOpciones.setStyle("-fx-border-color:#909090; -fx-border-width:1.5px; -fx-border-radius:4px;");
        TextAreaDisplay.setStyle("-fx-control-inner-background:#000000;");

        opciones();


    }

    private void opciones() {
        this.CrearArchivoNuevo.setToggleGroup(opciones);
        this.CrearArchivoNuevo.setUserData("CrearArchivoNuevo");
        this.ListarArchivosSoloLectura.setToggleGroup(opciones);
        this.ListarArchivosSoloLectura.setUserData("ListarArchivosSoloLectura");
        this.ListarContenido.setToggleGroup(opciones);
        this.ListarContenido.setUserData("ListarContenido");
        this.ListarFiltrado.setToggleGroup(opciones);
        this.ListarFiltrado.setUserData("ListarFiltrado");
        this.ListarTamaño.setToggleGroup(opciones);
        this.ListarTamaño.setUserData("ListarTamaño");

    }

    @FXML
    private void ActionTextFieldRuta(ActionEvent event) {
    }

    @FXML
    private void ActionButtonAbrir(ActionEvent event) {
        this.TextFieldRuta.setText(accionesDirectorio.BuscquedaArchivo());
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
        if (this.opciones.getSelectedToggle().getUserData().equals("CrearArchivoNuevo")) {
            this.TextAreaDisplay.appendText(accionesDirectorio.CrearNuevoArchivo(this.TextFieldNombreArchivo.getText()) + "\n");

        }
        if (this.opciones.getSelectedToggle().getUserData().equals("ListarArchivosSoloLectura")) {
            this.TextAreaDisplay.appendText(accionesDirectorio.ListarArchivosLectura() + "\n");

        }
        if (this.opciones.getSelectedToggle().getUserData().equals("ListarContenido")) {
            this.TextAreaDisplay.appendText(accionesDirectorio.ListarContenidoDirectorio() + "\n");

        }
        if (this.opciones.getSelectedToggle().getUserData().equals("ListarFiltrado")) {

            this.TextAreaDisplay.appendText(accionesDirectorio.ListarFiltrado(this.TextFieldCadenaFiltrado.getText()) + "\n");
        }
        if (this.opciones.getSelectedToggle().getUserData().equals("ListarTamaño")) {
            this.TextAreaDisplay.appendText(accionesDirectorio.ListarTamaño(this.TextFieldArchivoBytes.getText()) + "\n");

        }

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
