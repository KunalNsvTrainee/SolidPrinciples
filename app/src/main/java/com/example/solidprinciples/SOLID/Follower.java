package com.example.solidprinciples.SOLID;
//Liskov Substituttion Principle
public class Follower {
    public void onButtonClickListner(ClickListner clickListner){
        clickListner.onClick();
    }

}

interface ClickListner{
    public void onClick();
}

class Follow implements  ClickListner{

    @Override
    public void onClick() {
        incrementFollower();
    }

    private void incrementFollower() {
        System.out.println("follower increased");
    }
}
class Unfollow implements  ClickListner{

    @Override
    public void onClick() {
        decrementFollower();
    }

    private void decrementFollower() {
        System.out.println("follower decreased");
    }
}