package com.example;


import com.birdbrain.Finch;



public class FinchTurn {
    private Finch myFinch;

    public FinchBot() {
        MyFinch = new Finch();
    
    }
    
    public void setWheelVelocities(int leftSpeed, int rightSpeed) {
        myFinch.setWheelVelocities(leftSpeed,rightSpeed);
    }

    public static void main(String [] args) {
        FinchBot bot = new FinchBot();
        bot.setWheelVelocities(200,200)
    }
}
