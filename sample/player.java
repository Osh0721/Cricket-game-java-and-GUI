
package sample;
import java.io.BufferedWriter;
import java.io.FileWriter;

import java.io.IOException;


public class player {
    private String name;

    public player(String name) {

        this.name = name;
    }


    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public static void main(String[] arg) throws IOException {


        String[] Chennai = {"Dhonni", "Raina", "bravo", "ambani", "ali", "robin", "deepak", "asif", "Lungi", "karn", "dominic"};
        BufferedWriter writerC = new BufferedWriter(new FileWriter("Chennai super kings.txt", false));
        for (int i = 0; i < Chennai.length; i++) {

            writerC.write(Chennai[i].toString());
            writerC.newLine();
        }
        writerC.flush();

        String[] Mumbai = {"rohit", "yadav", "pandya", "pollard", "krunal ", "brumra", "tren", "adam", "chris", "chwla", "gayat"};
        BufferedWriter writerMumbai = new BufferedWriter(new FileWriter("Mumbai indians.txt", false));
        for (int i = 0; i < Mumbai.length; i++) {

            writerMumbai.write(Mumbai[i].toString());
            writerMumbai.newLine();
        }
        writerMumbai.flush();

        String[] Rajasthan = {"Liam", "manan", "gopal", "morris", "Mahipal", "Andrew", "oshen", "jaydev", "Chetan", "Rahman", "archer"};
        BufferedWriter writerrajasthan = new BufferedWriter(new FileWriter("Rajasthan Royal.txt", false));
        for (int i = 0; i < Rajasthan.length; i++) {

            writerrajasthan.write(Rajasthan[i].toString());
            writerrajasthan.newLine();
        }
        writerrajasthan.flush();

        String[] Kolkata = {"Morgan", "Russell", " Shakib", "Sunil", "Shubman", "venkatesh", "Varun", "Lockie", "Tim", "Harbhajan", "krishna"};
        BufferedWriter writerkolkata = new BufferedWriter(new FileWriter("Kolkata knight riders.txt", false));
        for (int i = 0; i < Kolkata.length; i++) {

            writerkolkata.write(Kolkata[i].toString());
            writerkolkata.newLine();
        }
        writerkolkata.flush();

        String[] Kandy = {"Oshan", "Bhathiya", "Pandula", "Isitha", "Aluwa", "lahiru", "Uditha", "hasindu", "Wishawa", "Janitha", "Charitha"};
        BufferedWriter writerkandy = new BufferedWriter(new FileWriter("Kandy Tuskers.txt", false));
        for (int i = 0; i < Kandy.length; i++) {

            writerkandy.write(Kandy[i].toString());
            writerkandy.newLine();
        }
        writerkandy.flush();

        String[] Uthura = {"pasindu", "denidu", "Thisanka", "sanga", "mahela", "sanath", "chamika", "malinga", "hasaranga", "abekoon"};
        BufferedWriter writeruthura = new BufferedWriter(new FileWriter("Uthura riders.txt", false));
        for (int i = 0; i < Uthura.length; i++) {

            writeruthura.write(Uthura[i].toString());
            writeruthura.newLine();
        }
        writeruthura.flush();

        String[] Uva = {"Theshan", "Deshapriya", "Thiwanka", "Iresh", "anuka", "buddika", "manuka", "ginuka", "nimal", "kamal", "theminida"};
        BufferedWriter writeruva = new BufferedWriter(new FileWriter("Uva Next.txt", false));
        for (int i = 0; i < Uva.length; i++) {

            writeruva.write(Uva[i].toString());
            writeruva.newLine();
        }
        writeruva.flush();

        String[] Wayamba = {"kumara", "ajith", "ajith", "ayantha", "nuwan", "asiri", "rahal", "jainth", "chamindu", "janaka", "sathila"};
        BufferedWriter writerwayamba = new BufferedWriter(new FileWriter("Wayamba United.txt", false));
        for (int i = 0; i < Wayamba.length; i++) {

            writerwayamba.write(Wayamba[i].toString());
            writerwayamba.newLine();
        }
        writerwayamba.flush();

    }
}


