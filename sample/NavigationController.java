package sample;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.stage.Stage;

import java.io.IOException;

public class NavigationController {


    @FXML
    CheckBox EditDelete;

    @FXML
    CheckBox Qucikplaye;

    @FXML
    CheckBox Chennai;
    @FXML
    CheckBox Mumbai;

    @FXML
    CheckBox Rajasthan;

    @FXML
    CheckBox Kolkata;

    @FXML
    CheckBox Kandy;

    @FXML
    CheckBox Uthura;

    @FXML
    CheckBox Uva;

    @FXML
    CheckBox Wayamba;

    @FXML
    CheckBox GA;

    @FXML
    CheckBox GB;








    public void gotoeditDeletepage() throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource("TeamSelection.fxml"));
        Stage window= (Stage) EditDelete.getScene().getWindow();
        window.setScene(new Scene(root, 700, 460));
    }

    public void gotoQuickplaypage() throws IOException{

        Parent root = FXMLLoader.load(getClass().getResource("Quickmatch.fxml"));
        Stage window= (Stage) Qucikplaye.getScene().getWindow();
        window.setScene(new Scene(root, 680, 460));
    }

    public void Displaychennai() throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource("EnDChennai.fxml"));
        Stage window= (Stage) Chennai.getScene().getWindow();
        window.setScene(new Scene(root, 700, 450));

    }
    public void DisplayMumbai() throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource("EnDMumbai.fxml"));
        Stage window= (Stage) Mumbai.getScene().getWindow();
        window.setScene(new Scene(root, 700, 450));

    }
    public void DisplayRajasthan() throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource("EnDRajasthan.fxml"));
        Stage window= (Stage) Rajasthan.getScene().getWindow();
        window.setScene(new Scene(root,700 , 450));

    }
    public void Displaykolkata() throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource("EnDKolkata.fxml"));
        Stage window= (Stage) Kolkata.getScene().getWindow();
        window.setScene(new Scene(root, 700, 450));

    }

    public void Displaykandy() throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource("EnDKandy.fxml"));
        Stage window= (Stage) Kandy.getScene().getWindow();
        window.setScene(new Scene(root, 700, 450));

    }
    public void Displayuthura() throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource("EnDUthura.fxml"));
        Stage window= (Stage) Uthura.getScene().getWindow();
        window.setScene(new Scene(root, 700, 450));

    }
    public void DisplayUva() throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource("EnDUva.fxml"));
        Stage window= (Stage) Uva.getScene().getWindow();
        window.setScene(new Scene(root, 700, 450));

    }
    public void DisplayWayamba() throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource("EnDWayamba.fxml"));
        Stage window= (Stage) Wayamba.getScene().getWindow();
        window.setScene(new Scene(root, 700, 450));

    }
    public void GotoGroupAmatches() throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource("RandommatchA.fxml"));
        Stage window= (Stage) GA.getScene().getWindow();
        window.setScene(new Scene(root, 760, 630));

    }
    public void GotoGroupBmatches() throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource("RandommatchB.fxml"));
        Stage window= (Stage) GB.getScene().getWindow();
        window.setScene(new Scene(root, 760, 630));

    }





}
