package com.dsa;

import java.util.Random;

public class farm{
    
    private climate [][] greenhouseClimate=new climate[2][5];

    public farm(){
        for(int i=0;i<greenhouseClimate.length;i++){
            for(int j=0;j<greenhouseClimate[i].length;j++){
              
                greenhouseClimate[i][j]=new climate();
            }
        }
    }

     public void CaptureCurrentClimate() {
        Random rand = new Random();
        for (int i = 0; i <  greenhouseClimate.length; i++) {
            for (int j = 0; j <greenhouseClimate[i].length; j++) {

                float temperature = 15 + rand.nextFloat() * 30;      // 15–35 °C
                float humidity = 30 + rand.nextFloat() * 50;         // 30–80 %
                float lightIntensity = 200 + rand.nextFloat() * 700; // 200–1000 lux
                float co2 = 300 + rand.nextFloat() * 500;            // 300–700 ppm
                float soilMoisture = 20 + rand.nextFloat() * 70;     // 20–80 %

                greenhouseClimate[i][j].setClimate(
                    temperature, humidity, lightIntensity, co2, soilMoisture
                );
            }
        }
    }
         public void displayClimate() {
        for (int i = 0; i < greenhouseClimate.length; i++) {
            for (int j = 0; j < greenhouseClimate[i].length; j++) {
                System.out.println("Greenhouse [" + i + "][" + j + "] ");
                greenhouseClimate[i][j].printdata();

            }
        }
    }

}

 