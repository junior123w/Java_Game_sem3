package wk2;

import java.util.Scanner;

public class NormalPlayer extends Player{
    private boolean hasUsedSuperPower;
   private Scanner input=new Scanner(System.in);

    public NormalPlayer(String name, double attack, double health) {
        super(name, attack, health);
    }

    public void useSuperPower(){
        //either increase attack by 1 or increase health by 3
        if(!hasUsedSuperPower){
            hasUsedSuperPower=true;
            System.out.println("Which super power do you want press 'a' for attack+1 and press h for health+3 : ");
            String result=input.nextLine();
            if(result.toLowerCase().charAt(0)=='h'){
               decreaseHealth(-3);
                // setHealth(getHealth()+3);
            }
            else if(result.toLowerCase().charAt(0)=='a'){
                increaseAttack(+1);
                //setAttack(getAttack()+1);
            }
        }
    }
}
