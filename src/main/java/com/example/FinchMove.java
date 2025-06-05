package com.example;


import com.birdbrain.Finch;




public class FinchMove {
    public static void main(String[] args) {
        
    Finch myfinch = new Finch();

    for(int i = 0; i < 2; i++){
    
        myfinch.setMove("F", 5, 9);
        myfinch.setTurn("R", 90, 1.5);
        myfinch.setMove("F", 5, 1.5);
        myfinch.setTurn("L", 90, 1.5);
        myfinch.setMove("F", 5, 1.5);
        myfinch.setTurn("L", 90, 1.5);
        
        myfinch.setMove("F", 5, 1.5);
        myfinch.setTurn("R", 90, 1.5);
        myfinch.setMove("F", 5, 9);
        myfinch.setTurn("L", 90, 1.5);
        myfinch.setMove("F", 5, 1.5);

        myfinch.setTurn("L", 90, 1.5);
        myfinch.setMove("F", 5, 9);
        myfinch.setTurn("R", 90, 1.5);
        myfinch.setMove("F", 12, 10);
        myfinch.setTurn("L", 90, 1.5);

        myfinch.setMove("F", 5, 1.5);
        myfinch.setTurn("L", 90, 1.5);
        myfinch.setMove("F", 12, 10);
        myfinch.setTurn("R", 90, 1.5);
        myfinch.setMove("F", 5, 1.5);
        myfinch.setTurn("L", 90, 1.5);
        myfinch.setMove("F", 5, 1.5);

    }

        



        
        
        
        
        myfinch.stopAll();
        myfinch.disconnect();
    }    
}
