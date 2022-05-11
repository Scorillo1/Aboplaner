package aboplaner;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

// @author Valentin, Julian, Sebastian

public class Main extends Application
{
    @Override
    public void start(Stage stage) throws Exception
    {
//     
        InputStream p = new FileInputStream("NutzungsbedingungenVorhanden.txt");
        BufferedReader br = new BufferedReader( new InputStreamReader(p));
        String d = br.readLine();
       if(d!=null){
            if(d.equals("true")){
            Parent root = FXMLLoader.load(getClass().getResource("Auswahl.fxml"));
             stage.setTitle("Auswahl");
            
             stage.setHeight(1000);
             
        
                Scene scene = new Scene(root);
        
            stage.setScene(scene);
            stage.show();
        }
            else
        {
            Parent root = FXMLLoader.load(getClass().getResource("Nutzungsbedingungen.fxml"));
            stage.setTitle("Nutzungsbedingungen");
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        }
       }
        
        
    }
    
    public static void main(String[] args)
    {
        launch(args);
        Spielplan s = new Spielplan();
        s.algorithmus();
    }
}