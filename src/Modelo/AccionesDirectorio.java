package Modelo;

import java.io.File;
import java.nio.file.Path;
import javafx.stage.DirectoryChooser;
import javafx.stage.Stage;

/* @author Alvaro*/
public class AccionesDirectorio {
    private Path directorio;

    public Path getDirectorios() {
        return directorio;
    }

    public void setDirectorios(Path directorio) {
        this.directorio = directorio;
    }
    public String ListarFiltrado(){
                Stage stage = new Stage();
        DirectoryChooser archivo = new DirectoryChooser();
        archivo.setTitle("Abrir el Archivo Filtrado");
        File archivoSelect = archivo.showDialog(stage);

        return archivoSelect.getAbsolutePath();
    }
    
}
