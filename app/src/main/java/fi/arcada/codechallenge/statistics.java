package fi.arcada.codechallenge;

import android.util.Log;

import java.util.ArrayList;

public class statistics {

    public static double calcMean(ArrayList<Double> values){
        double sum = 0;
        for(double num : values){
            sum += num;

        }
        return sum/ values.size();

    }

    public static void movingAvg(double [] values, int window){
        ArrayList<Double> sma = new ArrayList<>();
        double sum = 0;
        double avg = 0;
        int j = window -1;
        int length = values.length-j;
        for(int i=0; i<length; i++){

            int g = j;
            for(int f=0; f<window;f++){
                sum += values[g];
                g = g-1;
            }
            avg = sum/window;
            sma.add(avg);
            sum = 0;
            j = j+1;
        }
        String result = sma.toString();
        Log.i("Avg: ",  result);
    }





}


