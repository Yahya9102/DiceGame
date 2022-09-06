package com.Yahya.Dicegame;

import java.util.Random;

public class Dice {



        int sides;


        public int throwDice(){
            int rolledSide;

            Random random = new Random();                             //instansierar
            rolledSide = random.nextInt(1,sides +1);     // between range of x and y


            return rolledSide;
        }


        public Dice(int sides) {
            this.sides = sides;


        }
    }

