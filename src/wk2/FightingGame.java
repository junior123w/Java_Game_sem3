package wk2;

import java.util.ArrayList;
import java.util.Scanner;

public class FightingGame implements Game{
    Scanner input=new Scanner(System.in);
    ArrayList<Player> players;
    public FightingGame(){

    }

    @Override
    public void start() {
        System.out.println("Welcome to the game");

    }

    @Override
    public void stop() {
        System.out.println("type 's' to pause the fight");
        String result =input.nextLine();
        if(result.toLowerCase().charAt(0)=='s'){
            pause();
        }
    }

    @Override
    public void pause() {
        System.out.println("Fight has been paused");
        System.out.println("Type 'r' to resume the fight");
        String result =input.nextLine();
        if(result.toLowerCase().charAt(0)=='r'){
            resume();
        }

    }

    @Override
    public void resume() {
        System.out.println("Resume! fight");
    }

    @Override
    public void end() {
        System.out.println("thanks for playing the game");
    }
    public void turn(wk2.Player attacking, wk2.Player gettingAttacked){

        //one player attacks another player
        System.out.printf("%s is attacking %s.%n",
                attacking.getName(), gettingAttacked.getName());


        //do the attack
        gettingAttacked.setHealth( gettingAttacked.getHealth() - attacking.getAttack()   );
        System.out.printf("%s health is %.1f%n",
                gettingAttacked.getName(),
                gettingAttacked.getHealth());

        System.out.println("*".repeat(20));

    }
    @Override
    public String rules() {
        return null;
    }

    @Override
    public boolean save(String filename) {
        return false;
    }

    @Override
    public boolean load(String filename) {
        return false;
    }
}
