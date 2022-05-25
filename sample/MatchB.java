package sample;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.HashMap;
import java.util.Random;

public class MatchB {
    @FXML
    TextField RandomTeam;

    @FXML
    TextField HnT;

    @FXML
    TextField BnB;

    @FXML
    TextField Firstteam;

    @FXML
    TextField Secondteam;

    @FXML
    Button KU,KUva,KW,UU,UW,UvaW;


    public void randomMatchB() {


        String[][] matches = {{"Kandy tuskers", "Uthura Riders"},
                {"Kandy tuskers", "Uva next"}, {"Kandy tuskers", "Wayamba United"},
                {"Uthura Riders", "Uva next"}, {"Uthura Riders", "Wayamba United"}, {"Uva next", "Wayamba United"}
        };


        Random list = new Random();
        int random_match = list.nextInt(matches.length);
        String[] FT = matches[random_match];
        String[] ST = matches[random_match];

        String First_team = FT[0];
        String Second_team = ST[1];
        Firstteam.setText(First_team);
        Secondteam.setText(Second_team);
        String [] Random_Team={First_team,Second_team};
        int Random_team_for_toss = list.nextInt(Random_Team.length);
        String Result_Team=Random_Team[Random_team_for_toss];
        Firstteam.setText(First_team);
        Secondteam.setText(Second_team);
        String [] Toss={"HEAD","TAILS"};
        int random_toss = list.nextInt(Toss.length);
        String Result_Toss=Toss[random_toss];
        RandomTeam.setText(Result_Team);
        HnT.setText(Result_Toss);

        String [] BAT_Ball={"BAT","BALL"};
        int random_bat_Ball= list.nextInt(BAT_Ball.length);
        String Reslut_Bat_Ball=BAT_Ball[random_bat_Ball];
        BnB.setText(Reslut_Bat_Ball);





    }


    public void gotoKvsU() throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource("K vs U.fxml"));
        Stage window= (Stage) KU .getScene().getWindow();
        window.setScene(new Scene(root, 900, 450));
    }

    public void gotoKvsUva() throws IOException{

        Parent root = FXMLLoader.load(getClass().getResource("K vs Uva.fxml"));
        Stage window= (Stage) KUva.getScene().getWindow();
        window.setScene(new Scene(root, 900, 450));
    }

    public void gotoKvsW() throws IOException{

        Parent root = FXMLLoader.load(getClass().getResource("K vs W.fxml"));
        Stage window= (Stage) KW.getScene().getWindow();
        window.setScene(new Scene(root, 900, 450));
    }
    public void gotoUvsUva() throws IOException{

        Parent root = FXMLLoader.load(getClass().getResource("Uthu vs Uva.fxml"));
        Stage window= (Stage) UU.getScene().getWindow();
        window.setScene(new Scene(root, 900, 450));
    }
    public void gotoUvsW() throws IOException{

        Parent root = FXMLLoader.load(getClass().getResource("U vs W.fxml"));
        Stage window= (Stage) UW.getScene().getWindow();
        window.setScene(new Scene(root, 900, 450));
    }
    public void gotoUvavsW() throws IOException{

        Parent root = FXMLLoader.load(getClass().getResource("Uva vs W.fxml"));
        Stage window= (Stage) UvaW.getScene().getWindow();
        window.setScene(new Scene(root, 900, 450));
    }


}
