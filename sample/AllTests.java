package sample;

import java.util.Random;

public class AllTests {

    String[] toss={"HEAD","TAIL"};
    String[] Outmethods={"LBW !", "Catch Out !", "Wicket !", "Run Out !"};

    public String toss(){
        Random random= new Random();
        int random_toss=random.nextInt(toss.length);
        String toss_reslut=toss[random_toss];
        System.out.println(toss_reslut);


        return toss_reslut;
    };


    public String outmethod(){
        Random random= new Random();
        int random_out=random.nextInt(Outmethods.length);
        String out_result=Outmethods[random_out];
        System.out.println(out_result);
        return out_result;
    };


    public String out() {
        int ball = 0;
        String out = "OUT";
        if (ball == 0) {
            return out;
        }
        else{
            return null;
        }
    }

    public int scoreincrement(){
        int score=2;
        int next_score=1;
        int Tot=score+next_score;
        return Tot ;
    }




}
