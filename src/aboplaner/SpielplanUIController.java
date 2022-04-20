/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aboplaner;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

/**
 * FXML Controller class
 *
 * @author schei
 */
public class SpielplanUIController implements Initializable {

    @FXML
    private TableView<?> tv_statistik;
    @FXML
    private TableColumn<?, ?> tcName_statistik;
    @FXML
    private TableColumn<?, ?> tcFt_statistik;
    @FXML
    private TableColumn<?, ?> tcAE_Statistik;
    @FXML
    private TableColumn<?, ?> tcSv_statistik;
    @FXML
    private TableColumn<?, ?> tcLP_statistik;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
