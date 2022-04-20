/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aboplaner;

import java.net.URL;
import java.util.ResourceBundle;
import static javafx.application.Platform.exit;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.ListView;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author schei
 */
public class AuswahlController implements Initializable {

    @FXML
    private RadioButton rB_Montag;
    @FXML
    private Button btn_hinzufuegen;
    @FXML
    private Button btn_loeschen;
    @FXML
    private ChoiceBox<String> cb_spielweise;
    @FXML
    private TextField tf_name;
    @FXML
    private ListView<String> list_players;
    @FXML
    private Button btn_hinzufuegen1;
    @FXML
    private Button btn_hinzufuegen_date;
    @FXML
    private Button btn_löschen_date;
    @FXML
    private ListView<?> list_date;
    @FXML
    private TextField tf_date;
    @FXML
    private DatePicker dp_date;
    @FXML
    private Button btn_Spielplan;
    @FXML
    private Button btn_speichern;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void btnHinzufuegen(ActionEvent event) {
    }

    @FXML
    private void btnLoeschen(ActionEvent event) {
    }

    @FXML
    private void btnHinzufuegenDate(ActionEvent event) {
    }

    @FXML
    private void btnloeschenDate(ActionEvent event) {
        
    }

    @FXML
    private void btnEndOfEverything(ActionEvent event) {
        exit();
    }

    @FXML
    private void btnErstellung(ActionEvent event) {
    }

    @FXML
    private void btnSpeichern(ActionEvent event) {
    }
    
}
