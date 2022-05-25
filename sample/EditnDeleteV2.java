package sample;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class EditnDeleteV2{


        @FXML
        TextArea Display;

        @FXML
        Button DP;

        @FXML
        TextField RP;

        @FXML
        TextField AP;

        @FXML
        Button Gotonext;

    public void Gotomatchselectionpage() throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource("Quickmatch.fxml"));
        Stage window= (Stage) Gotonext.getScene().getWindow();
        window.setScene(new Scene(root, 600, 375));

    }

        public void DisplayChennai() {

            ArrayList<String> arr1 = new ArrayList<String>();

            arr1.add("Dhonni");
            arr1.add("Raina");
            arr1.add("bravo");
            arr1.add("ambani");
            arr1.add("ali");
            arr1.add("robin");
            arr1.add("deepak");
            arr1.add("asif");
            arr1.add("Lungi");
            arr1.add("karn");
            arr1.add("Dominic");

            for (int i = 0; i < arr1.size(); i++) {
                String current = arr1.get(i);

                Display.appendText(current + "\n");
            }
        }

        public void AddChennai()  {
            ArrayList<String> arr1 = new ArrayList<String>();


            player P1= new player(AP.getText());
            P1.setName(AP.getText());
            arr1.add(P1.getName());


            for (int i = 0; i < arr1.size(); i++) {
                String current = arr1.get(i);


                Display.appendText( current + "\n");
            }

        }
        public void removeChennai()  {

            ArrayList<String> arr1 = new ArrayList<String>();
            arr1.add("Dhonni");
            arr1.add("Raina");
            arr1.add("bravo");
            arr1.add("ambani");
            arr1.add("ali");
            arr1.add("robin");
            arr1.add("deepak");
            arr1.add("asif");
            arr1.add("Lungi");
            arr1.add("karn");
            arr1.add("Dominic");




            arr1.remove(RP.getText());

            Display.clear();

            for (int i = 0; i < arr1.size(); i++) {
                String current = arr1.get(i);


                Display.appendText( current + "\n");
            }

        }


    public void DisplayMumbai()  {

        ArrayList<String> arr1 = new ArrayList<String>();


        arr1.add("rohit");
        arr1.add("yadav");
        arr1.add("pandya");
        arr1.add("pollard");
        arr1.add("krunal ");
        arr1.add("brumra");
        arr1.add("tren");
        arr1.add("adam");
        arr1.add("chris");
        arr1.add("chwla");
        arr1.add("gayat");

        for (int i = 0; i < arr1.size(); i++) {
            String current = arr1.get(i);

            Display.appendText(current + "\n");
        }
    }

    public void AddMumbai() {
        ArrayList<String> arr1 = new ArrayList<String>();

        player P1= new player(AP.getText());
        P1.setName(AP.getText());
        arr1.add(P1.getName());


        for (int i = 0; i < arr1.size(); i++) {
            String current = arr1.get(i);


            Display.appendText( current + "\n");
        }

    }
    public void removeMumbai() {

        ArrayList<String> arr1 = new ArrayList<String>();

        arr1.add("rohit");
        arr1.add("yadav");
        arr1.add("pandya");
        arr1.add("pollard");
        arr1.add("krunal ");
        arr1.add("brumra");
        arr1.add("tren");
        arr1.add("adam");
        arr1.add("chris");
        arr1.add("chwla");
        arr1.add("gayat");


        arr1.remove(RP.getText());

        Display.clear();

        for (int i = 0; i < arr1.size(); i++) {
            String current = arr1.get(i);
            //System.out.println(current);

            Display.appendText( current + "\n");
        }

    }



    public void DisplayRajasthan()  {

        ArrayList<String> arr1 = new ArrayList<String>();


        arr1.add("Liam");
        arr1.add("manan");
        arr1.add("gopal");
        arr1.add("morris");
        arr1.add("Mahipal");
        arr1.add("Andrew");
        arr1.add("oshen");
        arr1.add("jaydev");
        arr1.add("Chetan");
        arr1.add("Rahman");
        arr1.add("archer");

        for (int i = 0; i < arr1.size(); i++) {
            String current = arr1.get(i);

            Display.appendText(current + "\n");
        }
    }

    public void AddRajasthan()  {
        ArrayList<String> arr1 = new ArrayList<String>();

        player P1= new player(AP.getText());
        P1.setName(AP.getText());
        arr1.add(P1.getName());


        for (int i = 0; i < arr1.size(); i++) {
            String current = arr1.get(i);


            Display.appendText( current + "\n");
        }

    }
    public void removeRajasthan()  {

        ArrayList<String> arr1 = new ArrayList<String>();

        arr1.add("Liam");
        arr1.add("manan");
        arr1.add("gopal");
        arr1.add("morris");
        arr1.add("Mahipal");
        arr1.add("Andrew");
        arr1.add("oshen");
        arr1.add("jaydev");
        arr1.add("Chetan");
        arr1.add("Rahman");
        arr1.add("archer");



        arr1.remove(RP.getText());

        Display.clear();

        for (int i = 0; i < arr1.size(); i++) {
            String current = arr1.get(i);


            Display.appendText( current + "\n");
        }

    }




    public void DisplayKolkata()  {

        ArrayList<String> arr1 = new ArrayList<String>();



        arr1.add("Morgan");
        arr1.add( "Russell");
        arr1.add(" Shakib");
        arr1.add("Sunil");
        arr1.add("Shubman");
        arr1.add("venkatesh");
        arr1.add("Varun");
        arr1.add("Lockie");
        arr1.add("Tim");
        arr1.add("Harbhajan");
        arr1.add("krishna");

        for (int i = 0; i < arr1.size(); i++) {
            String current = arr1.get(i);

            Display.appendText(current + "\n");
        }
    }

    public void AddKolkata()  {
        ArrayList<String> arr1 = new ArrayList<String>();

        player P1= new player(AP.getText());
        P1.setName(AP.getText());
        arr1.add(P1.getName());


        for (int i = 0; i < arr1.size(); i++) {
            String current = arr1.get(i);


            Display.appendText( current + "\n");
        }

    }
    public void removeKolkata() {

        ArrayList<String> arr1 = new ArrayList<String>();

        arr1.add("Morgan");
        arr1.add( "Russell");
        arr1.add(" Shakib");
        arr1.add("Sunil");
        arr1.add("Shubman");
        arr1.add("venkatesh");
        arr1.add("Varun");
        arr1.add("Lockie");
        arr1.add("Tim");
        arr1.add("Harbhajan");
        arr1.add("krishna");


        arr1.remove(RP.getText());

        Display.clear();

        for (int i = 0; i < arr1.size(); i++) {
            String current = arr1.get(i);


            Display.appendText( current + "\n");
        }

    }

    public void DisplayKandy() {

        ArrayList<String> arr1 = new ArrayList<String>();

        arr1.add("Oshan");
        arr1.add("Bhathiya");
        arr1.add("Pandula");
        arr1.add("Isitha");
        arr1.add("Aluwa");
        arr1.add("lahiru");
        arr1.add("Uditha");
        arr1.add("hasindu");
        arr1.add("Wishawa");
        arr1.add("Janitha");
        arr1.add("Charitha");

        for (int i = 0; i < arr1.size(); i++) {
            String current = arr1.get(i);

            Display.appendText(current + "\n");
        }
    }

    public void AddKandy()  {
        ArrayList<String> arr1 = new ArrayList<String>();

        player P1= new player(AP.getText());
        P1.setName(AP.getText());
        arr1.add(P1.getName());


        for (int i = 0; i < arr1.size(); i++) {
            String current = arr1.get(i);


            Display.appendText( current + "\n");
        }

    }
    public void removeKandy()  {

        ArrayList<String> arr1 = new ArrayList<String>();

        arr1.add("Oshan");
        arr1.add("Bhathiya");
        arr1.add("Pandula");
        arr1.add("Isitha");
        arr1.add("Aluwa");
        arr1.add("lahiru");
        arr1.add("Uditha");
        arr1.add("hasindu");
        arr1.add("Wishawa");
        arr1.add("Janitha");
        arr1.add("Charitha");



        arr1.remove(RP.getText());

        Display.clear();

        for (int i = 0; i < arr1.size(); i++) {
            String current = arr1.get(i);

            Display.appendText( current + "\n");
        }

    }
    public void DisplayUthura() {

        ArrayList<String> arr1 = new ArrayList<String>();


        arr1.add("pasindu");
        arr1.add("denidu");
        arr1.add("Thisanka");
        arr1.add("sanga");
        arr1.add("mahela");
        arr1.add("sanath");
        arr1.add("chamika");
        arr1.add("malinga");
        arr1.add("hasaranga");
        arr1.add("abekoon");
        arr1.add("Sanath");

        for (int i = 0; i < arr1.size(); i++) {
            String current = arr1.get(i);

            Display.appendText(current + "\n");
        }
    }

    public void AddUthura() throws IOException {
        ArrayList<String> arr1 = new ArrayList<String>();

        player P1= new player(AP.getText());
        P1.setName(AP.getText());
        arr1.add(P1.getName());


        for (int i = 0; i < arr1.size(); i++) {
            String current = arr1.get(i);


            Display.appendText( current + "\n");
        }

    }
    public void removeUthura()  {

        ArrayList<String> arr1 = new ArrayList<String>();

        arr1.add("pasindu");
        arr1.add("denidu");
        arr1.add("Thisanka");
        arr1.add("sanga");
        arr1.add("mahela");
        arr1.add("sanath");
        arr1.add("chamika");
        arr1.add("malinga");
        arr1.add("hasaranga");
        arr1.add("abekoon");
        arr1.add("Sanath");



        arr1.remove(RP.getText());

        Display.clear();

        for (int i = 0; i < arr1.size(); i++) {
            String current = arr1.get(i);


            Display.appendText( current + "\n");
        }

    }
    public void DisplayUva()  {

        ArrayList<String> arr1 = new ArrayList<String>();


        arr1.add("Theshan");
        arr1.add("Deshapriya");
        arr1.add("Thiwanka");
        arr1.add("Iresh");
        arr1.add("anuka");
        arr1.add("buddika");
        arr1.add("manuka");
        arr1.add("ginuka");
        arr1.add("nimal");
        arr1.add("kamal");
        arr1.add("theminida");
        for (int i = 0; i < arr1.size(); i++) {
            String current = arr1.get(i);
            Display.appendText(current + "\n");
        }
    }

    public void AddUva()  {
        ArrayList<String> arr1 = new ArrayList<String>();

        player P1= new player(AP.getText());
        P1.setName(AP.getText());
        arr1.add(P1.getName());


        for (int i = 0; i < arr1.size(); i++) {
            String current = arr1.get(i);
            Display.appendText( current + "\n");
        }

    }
    public void removeUva() throws IOException {

        ArrayList<String> arr1 = new ArrayList<String>();

        arr1.add("Theshan");
        arr1.add("Deshapriya");
        arr1.add("Thiwanka");
        arr1.add("Iresh");
        arr1.add("anuka");
        arr1.add("buddika");
        arr1.add("manuka");
        arr1.add("ginuka");
        arr1.add("nimal");
        arr1.add("kamal");
        arr1.add("theminida");


        arr1.remove(RP.getText());

        Display.clear();

        for (int i = 0; i < arr1.size(); i++) {
            String current = arr1.get(i);

            Display.appendText( current + "\n");
        }

    }
    public void DisplayWayamba()  {

        ArrayList<String> arr1 = new ArrayList<String>();

        arr1.add("kumara");
        arr1.add("ajith");
        arr1.add("ajith");
        arr1.add("ayantha");
        arr1.add("nuwan");
        arr1.add("asiri");
        arr1.add("rahal");
        arr1.add("jainth");
        arr1.add("chamindu");
        arr1.add("janaka");
        arr1.add("sathila");
        for (int i = 0; i < arr1.size(); i++) {
            String current = arr1.get(i);

            Display.appendText(current + "\n");
        }
    }

    public void AddWayamba()  {
        ArrayList<String> arr1 = new ArrayList<String>();

        player P1= new player(AP.getText());
        P1.setName(AP.getText());
        arr1.add(P1.getName());

        for (int i = 0; i < arr1.size(); i++) {
            String current = arr1.get(i);

            Display.appendText( current + "\n");
        }

    }
    public void removeWayamba()  {

        ArrayList<String> arr1 = new ArrayList<String>();

        arr1.add("kumara");
        arr1.add("ajith");
        arr1.add("ajith");
        arr1.add("ayantha");
        arr1.add("nuwan");
        arr1.add("asiri");
        arr1.add("rahal");
        arr1.add("jainth");
        arr1.add("chamindu");
        arr1.add("janaka");
        arr1.add("sathila");



        arr1.remove(RP.getText());

        Display.clear();

        for (int i = 0; i < arr1.size(); i++) {
            String current = arr1.get(i);
            Display.appendText( current + "\n");
        }

    }



























































}
