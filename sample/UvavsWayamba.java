package sample;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;

import java.util.HashMap;
import java.util.Random;

public class UvavsWayamba {

    @FXML
    TextArea TEST;
    public void UvavsWayamba(){
        String First_Team = "Uva next";
        String Second_Team = "Wayamba United";

        String[] UvaPlayers = {"Theshan", "Deshapriya", "Thiwanka", "Iresh", "anuka", "buddika", "manuka", "ginuka", "nimal", "kamal", "theminida"};
        String[] WayambaPlayers ={"kumara", "ajith", "lasantha", "ayantha", "nuwan", "asiri", "rahal", "jainth", "chamindu", "janaka", "sathila"};


        String player = UvaPlayers  [0];

        HashMap<String, Double> Wicket_ballers1 = new HashMap<String, Double>();

        int overs = 0;
        int Wicket = 0;
        int Total_FirstTeam_score = 0;
        int Total_player1bat_Score = 0;
        int player_position = 0;



        TEST.appendText("First batman is " + UvaPlayers   [0] + "\n");


        while (overs < 20 && Wicket < 10) {
            for (int i = 0; i < 6; i++) {

                if (Wicket >= 10) {
                    break;
                }

                Double Ball = Math.floor(Math.random() * 7);

                if (Ball == 0) {
                    String[] Outs = {"LBW !", "Catch Out !", "Wicket !", "Run Out !"};
                    Random r = new Random();
                    int random_out_method = r.nextInt(Outs.length);
                    TEST.appendText("Hard Luck " + Outs[random_out_method]+ "\n");

                    TEST.appendText(player + " got " + Total_player1bat_Score + "\n");

                    TEST.appendText(" \n");

                    if (Wicket < 10) {

                        player_position += 1;
                        player = UvaPlayers   [player_position];
                        TEST.appendText("Next bat man is " + player+ "\n" );
                        Total_player1bat_Score = 0;
                        Wicket += 1;

                    }

                } else {

                    Total_player1bat_Score += Ball;
                    Total_FirstTeam_score += Ball;
                }


            }
            overs += 1;

        }
        TEST.appendText("Total score is " + Total_FirstTeam_score+ "\n");
        TEST.appendText("Total over is "+ overs+"\n");
        TEST.appendText("Total wickets is " + Wicket+ "\n");


        int AvaWicket = Wicket;
        for (int b = 0; b <UvaPlayers .length; b++) {
            Double currentWicket = Math.floor(Math.random() * 7);
            if (currentWicket < AvaWicket) {
                Wicket_ballers1.put(UvaPlayers   [b], currentWicket);
                AvaWicket -= currentWicket;
            } else {
                Wicket_ballers1.put(UvaPlayers  [b], (double) AvaWicket);
                AvaWicket = 0;
            }

        }






        TEST.appendText("------------------------------------------------------------------------------------------------------"+ "\n");

        TEST.appendText("");
        TEST.appendText("Lets play the 2nd innings!!!!!!" + "\n");

        player = WayambaPlayers  [0];

        int Total_SecondTeam_score = 0;
        TEST.appendText("\n");

        HashMap<String, Double> Wicket_ballers2 = new HashMap<>();

        overs = 0;
        Wicket = 0;
        Total_FirstTeam_score = 0;
        Total_player1bat_Score = 0;
        player_position = 0;



        TEST.appendText("First batman is " + WayambaPlayers  [0] + "\n");

        while (overs < 20 && Wicket < 10) {
            for (int i = 0; i < 6; i++) {

                if (Wicket >= 10) {
                    break;
                }

                Double Ball = Math.floor(Math.random() * 7);

                if (Ball == 0) {
                    String[] Outs = {"LBW !", "Catch Out !", "Wicket !", "Run Out !"};
                    Random r = new Random();
                    int random_out_method = r.nextInt(Outs.length);
                    TEST.appendText("Hard Luck " + Outs[random_out_method]+ "\n");

                    TEST.appendText(player + " got " + Total_player1bat_Score+ "\n");

                    TEST.appendText("\n");

                    if (Wicket < 10) {

                        player_position += 1;
                        player = WayambaPlayers[player_position];
                        TEST.appendText("Next bat man is " + player + "\n");

                        Total_player1bat_Score = 0;


                        Wicket += 1;

                    }

                } else {
                    Total_player1bat_Score += Ball;
                    Total_FirstTeam_score += Ball;
                }


            }
            overs += 1;

        }
        TEST.appendText("Total score is " + Total_FirstTeam_score+ "\n");
        TEST.appendText("Total over is "+ overs+"\n");
        TEST.appendText("Total wickets is " + Wicket+ "\n");

        TEST.appendText("\n");

        AvaWicket = Wicket;
        for (int b = 0; b < WayambaPlayers  .length; b++) {
            Double currentWicket = Math.floor(Math.random() * 7);
            if (currentWicket < AvaWicket) {
                Wicket_ballers2.put(WayambaPlayers  [b], currentWicket);
                AvaWicket -= currentWicket;
            } else {
                Wicket_ballers2.put(WayambaPlayers  [b], (double) AvaWicket);
                AvaWicket = 0;
            }

        }


        if (Total_FirstTeam_score > Total_SecondTeam_score) {
            TEST.appendText(First_Team + " Won!!!! "+ "\n");
            TEST.appendText("\n");
        } else {
            TEST.appendText(Second_Team + " Won!!!! "+ "\n");
            TEST.appendText("\n");

        }
        TEST.appendText("Best ballers are below "+ "\n");
        TEST.appendText("\n");
        TEST.appendText(String.valueOf(Wicket_ballers1)+ "\n");
        TEST.appendText(String.valueOf(Wicket_ballers2)+ "\n");

    }

}
