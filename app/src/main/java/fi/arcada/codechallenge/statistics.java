package fi.arcada.codechallenge;

import java.util.ArrayList;

public class statistics {

    public static double calcMean(ArrayList<Double> values){
        double sum = 0;
        for(double num : values){
            sum += num;

        }
        return sum/ values.size();

    }





}


