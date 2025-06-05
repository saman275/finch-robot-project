package com.example;


import com.birdbrain.Finch;




public class FinchMove {
    public static void main(String[] args) {
        
    Finch myfinch = new Finch();
    //* runs the code one time then stops */

    for(int i = 0; i < 1; i++){
       
        myfinch.setMove("F", 5, 5);
        myfinch.setTurn("R", 90, 1.5);
        myfinch.setMove("F", 5, 5);
        myfinch.setTurn("L", 90, 1.5);
        myfinch.setMove("F", 5, 5);
        myfinch.setTurn("L", 90, 1.5);
        
        myfinch.setMove("F", 5, 5);
        myfinch.setTurn("R", 90, 1.5);
        myfinch.setMove("F", 5, 5);
        myfinch.setTurn("L", 90, 1.5);
        myfinch.setMove("F", 5, 5);

        myfinch.setTurn("L", 95, 1.5);
        myfinch.setMove("F", 5, 5);
        myfinch.setTurn("R", 92, 1.5);
        myfinch.setMove("F", 12, 5);
        myfinch.setTurn("L", 90, 1.5);

        myfinch.setMove("F", 5, 5);
        myfinch.setTurn("L", 90, 1.5);
        myfinch.setMove("F", 12, 5);
        myfinch.setTurn("R", 91, 1.5);
        myfinch.setMove("F", 5, 5);
        myfinch.setTurn("L", 96, 1.5);
        myfinch.setMove("F", 5.25, 5);
        myfinch.setTurn("L", 90, 1.5);

    }

        



        
        
        
        //* stops the whole code */
        myfinch.stopAll();
        myfinch.disconnect();
    }    
}
