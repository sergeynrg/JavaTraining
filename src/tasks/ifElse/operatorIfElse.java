package tasks.ifElse;

import java.util.Random;

public class operatorIfElse {
    public static void main(String[] args) {
        int randomNumber = new Random().nextInt(100);
        System.out.println(randomNumber);

        if(randomNumber < 36)
            System.out.println("Your temperature should be 36.6");
        else if(randomNumber >38)
            System.out.println("You have health problems");
        else if (randomNumber ==36)
            System.out.println("You are totally stronger!");
        }
    }