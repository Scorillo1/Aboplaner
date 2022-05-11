/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aboplaner;

import java.io.FileWriter;
import java.net.URL;
import java.util.ResourceBundle;
import static javafx.application.Platform.exit;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author schei
 */
public class NutzungsbedingungenController implements Initializable {

    @FXML
    private CheckBox cb_zugestimmt;
    @FXML
    private Button btn_abbruch;
    @FXML
    private Button btn_weiter;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    private void checkbox_angeklickt(ActionEvent event) {

        if (cb_zugestimmt.isSelected()) {
            btn_weiter.setDisable(false);
        } else {
            btn_weiter.setDisable(true);
        }
    }

    @FXML
    private void abruchIsClicked(ActionEvent event) {
        exit();
    }

    @FXML
    private void weiterIsClicked(ActionEvent event) {
        try {
            FileWriter fw = new FileWriter("NutzungsbedingungenVorhanden.txt");
            fw.write("true");
            fw.close();
            Stage s = (Stage) btn_weiter.getScene().getWindow();
            s.close();
            Parent root = FXMLLoader.load(getClass().getResource("Auswahl.fxml"));
            Scene scene = new Scene(root);
            s.setScene(scene);
            s.show();
            s.setTitle("Auswahl");
        } catch (Exception e) {
            System.out.println(e.getCause());
        }

    }

}
