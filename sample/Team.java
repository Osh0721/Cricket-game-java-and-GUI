
package sample;
import java.io.*;
import java.util.Scanner;

public class Team {


    public static void main(String[] arg) throws IOException {

        String[] A = {"Chennai super Kings", "Mumbai indians", "Rajasthan Royal", "Kolkata knight riders"};
        BufferedWriter writerA = new BufferedWriter(new FileWriter("Group A.txt", false));
        for (int i = 0; i < A.length; i++) {

            writerA.write(A[i].toString());
            writerA.newLine();
        }
        writerA.flush();




            String[] B = {"Kandy Tuskers", "Uthura riders", "Uva Next", "Wayamba United"};
            BufferedWriter writerB = new BufferedWriter(new FileWriter("Group B.txt", false));
            for (int i = 0; i < B.length; i++) {

                writerB.write(B[i].toString());
                writerB.newLine();
            }
            writerB.flush();

            }
        }






