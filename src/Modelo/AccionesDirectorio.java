package Modelo;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Iterator;
import java.util.stream.Stream;
import javafx.stage.DirectoryChooser;
import javafx.stage.Stage;

/* @author Alvaro*/
public class AccionesDirectorio {
    private Path directorios;

    public Path getDirectorios() {
        return directorios;
    }

    public void setDirectorios(Path directorio) {
        this.directorios = directorio;
    }
        public String BuscquedaArchivo() {
        Stage stage = new Stage();
        DirectoryChooser archivo = new DirectoryChooser();
        archivo.setTitle("Seleciona el archivo");
        File archivoSelect = archivo.showDialog(stage);
        this.setDirectorios(archivoSelect.toPath());
        return archivoSelect.getAbsolutePath();
    }

    public String ListarContenidoDirectorio(){
        String texto;
        String archivoDirectorio;
        texto = "1. LISTADO DEL CONTENIDO DE LA CARPETA: " + this.directorios.getFileName() + "\n";
       try (Stream<Path> ficheros = Files.list(directorios)){
           Iterator<Path> iterator = ficheros.iterator();
            while (iterator.hasNext()) {
                Path path=iterator.next();
                File file= path.toFile();
                
                if(file.isDirectory()){
                    archivoDirectorio="Directorio";
                    texto=TextoDevuelto(archivoDirectorio,file);
                }else{
                    archivoDirectorio="Archivo";
                    texto=TextoDevuelto(archivoDirectorio,file);
                }
            }
       }catch (IOException ex) {
            texto="Error";
    }
       return texto;
    }    
    
    public String ListarFiltrado(String cadenaCaracteres){
        String texto;
        String archivoDirectorio;
        texto="2. LISTAR CONTENIDO FILTRADO POR "+cadenaCaracteres + " EN LA CARPETA: "+this.directorios.getFileName()+"\n";
        try(Stream<Path> ficheros = Files.list(directorios)){
            Iterator<Path>iterator=ficheros.iterator();
            while(iterator.hasNext()){
                Path path=iterator.next();
                File file=path.toFile();
                if (file.getName().equalsIgnoreCase(cadenaCaracteres)) {
                    if(file.isDirectory()){
                    archivoDirectorio="Directorio";
                    texto=TextoDevuelto(archivoDirectorio,file);
                    }else{
                    archivoDirectorio="Archivo";
                    texto=TextoDevuelto(archivoDirectorio,file);
                } 
                }
            }
            
        }catch (IOException ex) {
            texto="Error";
 }
        return texto;
    }
    public String ListarArchivosLectura(){
        String texto;
        String archivoDirectorio;
        texto="3. LISTAR ARCHIVOS DE SOLO LECTURA EN: "+this.directorios.getFileName()+"\n";
        try(Stream<Path> ficheros = Files.list(directorios)){
            Iterator<Path>iterator=ficheros.iterator();
            while(iterator.hasNext()){
                Path path=iterator.next();
                File file=path.toFile();
                if (Files.isReadable(file.toPath())) {
                    if(file.isDirectory()){
                    archivoDirectorio="Directorio";
                    texto=TextoDevuelto(archivoDirectorio,file);
                    }else{
                    archivoDirectorio="Archivo";
                    texto=TextoDevuelto(archivoDirectorio,file);
                } 
                }
            }
            
        }catch (IOException ex) {
            texto="Error";
 }
        return texto;
    }
    public String ListarTamaño(String tamanoComparar){
                String texto;
                Long tamano;
        String archivoDirectorio;
        texto="4. LISTAR ARCHIVOS FILTRADO POR EL TAMAÑO"+tamanoComparar+" EN: "+this.directorios.getFileName()+"\n";
        try(Stream<Path> ficheros = Files.list(directorios)){
            Iterator<Path>iterator=ficheros.iterator();
            while(iterator.hasNext()){
                Path path=iterator.next();
                File file=path.toFile();
                tamano=file.length();
                if (tamano.toString().equals(tamanoComparar)) {
                    if(file.isDirectory()){
                    archivoDirectorio="Directorio";
                    texto=TextoDevuelto(archivoDirectorio,file);
                    }else{
                    archivoDirectorio="Archivo";
                    texto=TextoDevuelto(archivoDirectorio,file);
                } 
                }
            }
            
        }catch (IOException ex) {
            texto="Error";
 }
        return texto;
    }
    
    public String FormatearFecha(Long fechaHora){
        String fecha;
        SimpleDateFormat format= new SimpleDateFormat ("dd-MM-yyyy; HH:mm:ss");
        fecha=format.format(fechaHora);
        return fecha;
    }
    public String TextoDevuelto(String archivoDirectorio,File file){
        String texto;
        Long tamanoL;
        tamanoL=file.length()/1000;
        Long fechaHora;
        fechaHora=file.lastModified();
        texto=archivoDirectorio+" "+"'"+file.getName()+"'"+" --> Tamaño: "+tamanoL.toString()+"kB --> Modificado: "+FormatearFecha(fechaHora);
        return texto;
    }
    public void CrearNuevoArchivo(){
        try{
            File directorio=new File("directorio");
            directorio.mkdir();
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }
}
