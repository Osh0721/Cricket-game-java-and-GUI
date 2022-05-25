package sample;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;

import javafx.scene.control.TextField;
import javafx.stage.Stage;
import sample.player;

import java.awt.event.ActionEvent;
import java.io.IOException;
import java.util.HashMap;
import java.util.Random;

public class MatchA {
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
    Button CM,CK,CR,MR,MK,RK;


    public void randomMatchA() {


        String[][] matches = {{"Chennai super Kings", "Mumbai indians"}, {"Chennai super Kings", "Rajasthan Royal"},
                {"Chennai super Kings", "Kolkata knight riders"},
                {"Mumbai indians", "Rajasthan Royal"},
                {"Mumbai indians", "Kolkata knight riders"},
                {"Rajasthan Royal", "Kolkata knight riders"}};


        Random list = new Random();
        int random_match = list.nextInt(matches.length);
        String[] FT = matches[random_match];
        String[] ST = matches[random_match];

        String First_team = FT[0];
        String Second_team = ST[1];
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


    public void gotoCvsM() throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource("C vs M.fxml"));
        Stage window= (Stage) CM .getScene().getWindow();
        window.setScene(new Scene(root, 900, 450));
    }

    public void gotoCvsR() throws IOException{

        Parent root = FXMLLoader.load(getClass().getResource("C vs R.fxml"));
        Stage window= (Stage) CR.getScene().getWindow();
        window.setScene(new Scene(root, 900, 450));
    }

    public void gotoCvsK() throws IOException{

        Parent root = FXMLLoader.load(getClass().getResource("C vs K.fxml"));
        Stage window= (Stage) CK.getScene().getWindow();
        window.setScene(new Scene(root, 900, 450));
    }
    public void gotoMvsR() throws IOException{

        Parent root = FXMLLoader.load(getClass().getResource("M vs R.fxml"));
        Stage window= (Stage) MR.getScene().getWindow();
        window.setScene(new Scene(root, 900, 450));
    }
    public void gotoMvsK() throws IOException{

        Parent root = FXMLLoader.load(getClass().getResource("M vs K.fxml"));
        Stage window= (Stage) MK.getScene().getWindow();
        window.setScene(new Scene(root, 900, 450));
    }
    public void gotoRvsK() throws IOException{

        Parent root = FXMLLoader.load(getClass().getResource("R vs K.fxml"));
        Stage window= (Stage) RK.getScene().getWindow();
        window.setScene(new Scene(root, 900, 450));
    }
















}

