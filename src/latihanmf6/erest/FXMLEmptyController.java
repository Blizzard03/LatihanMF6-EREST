/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package latihanmf6.erest;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

/**
 * FXML Controller class
 *
 * @author Blizzard
 */
public class FXMLEmptyController implements Initializable {

    @FXML
    private Label Nama_Peminjamlbl;
    @FXML
    private Label Jenis_Bukulbl;
    @FXML
    private Label Tanggal_Pinjamlbl;
    @FXML
    private Label tglkembalilbl;
    @FXML
    private Label lamapinjamlbl;
    @FXML
    private Label bataspinjamlbl;
    @FXML
    private Label selisih_lbl;
    @FXML
    private Label hargadendalbl;
    @FXML
    private Label dendalbl;
    @FXML
    private Label bonuslbl;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    public void getErest(Erest est){
        
    }
}
