package com.saman;

import com.birdbrain.Finch;




public class FinchMove {
        
    Finch myfinch = new Finch(); 
    myfinch.setMove("F", 95, 70);
        myfinch.setTurn("L", 90, 80);
        myfinch.setMove("R", 90, 75);

        
        
        
        
        
        myfinch.stopAll();
        myfinch.disconnect();
    }
