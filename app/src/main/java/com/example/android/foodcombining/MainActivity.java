package com.example.android.foodcombining;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    int[] meat = {2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0};
    int[] beans = {0, 2, 1, 1, 1, 0, 1, 0, 0, 0, 1, 0, 1, 0, 0, 1};
    int[] butter = {0, 1, 2, 1, 0, 0, 1, 1, 1, 0, 1, 1, 0, 1, 0, 0};
    int[] sourCream = {0, 1, 1, 2, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0};
    int[] oils = {0, 1, 0, 0, 2, 0, 1, 1, 1, 1, 1, 1, 0, 0, 0, 1};
    int[] sweets = {0, 0, 0, 0, 0, 2, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0};
    int[] bread = {0, 1, 1, 1, 1, 0, 2, 0, 0, 0, 1, 1, 0, 1, 0, 1};
    int[] sourFruits = {0, 0, 1, 1, 1, 0, 0, 2, 1, 1, 1, 1, 1, 1, 0, 1};
    int[] semiSourFruits = {0, 0, 1, 1, 1, 0, 0, 0, 2, 1, 1, 1, 1, 1, 0, 1};
    int[] sweetFruits = {0, 0, 0, 1, 1, 0, 0, 1, 1, 2, 1, 1, 1, 0, 0, 1,};
    int[] greenVegs = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 1, 1, 1, 1, 1};
    int[] otherVegs = {1, 1, 1, 1, 1, 0, 1, 1, 1, 1, 1, 2, 1, 1, 1, 1};
    int[] fermented =  {0, 0, 0, 1, 0, 0, 0, 1, 1, 1, 1, 1, 2, 1, 0, 1};
    int[] cheese = {0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 1, 2, 0, 16};
    int[] eggs = {0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 2, 0};
    int[] nuts = {0, 1, 0, 0, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0};




    boolean chosen[] = {false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false};

    int [][] table = {meat, beans, butter, sourCream, oils, sweets, bread, sourFruits, semiSourFruits, sweetFruits, greenVegs, otherVegs, fermented, cheese, eggs, nuts};

    public void meat(View view){
        for(int i = 0; i < 16; i++){
            chosen[i] = false;
        }
        chosen[0] = true;

        lookAtTable(0);
        Button meatButton = (Button) findViewById(R.id.meat);
        meatButton.setTextColor(Color.parseColor("#000000"));

    }
    public void beans(View view){
        for(int i = 0; i < 16; i++){
            chosen[i] = false;
        }
        chosen[1] = true;
        lookAtTable(1);
        Button beanButton = (Button) findViewById(R.id.beans);
        beanButton.setTextColor(Color.parseColor("#000000"));

    }
    public void butter(View view){
        for(int i = 0; i < 16; i++){
            chosen[i] = false;
        }
        chosen[2] = true;
        lookAtTable(2);
        Button butterButton = (Button) findViewById(R.id.butter);
        butterButton.setTextColor(Color.parseColor("#000000"));

    }
    public void sourCream(View view){
        for(int i = 0; i < 16; i++){
            chosen[i] = false;
        }
        chosen[3] = true;
        lookAtTable(3);
        Button creamButton = (Button) findViewById(R.id.sour_cream);
        creamButton.setTextColor(Color.parseColor("#000000"));

    }
    public void oils(View view){
        for(int i = 0; i < 16; i++){
            chosen[i] = false;
        }
        chosen[4] = true;
        lookAtTable(4);
        Button oilButton = (Button) findViewById(R.id.oils);
        oilButton.setTextColor(Color.parseColor("#000000"));

    }
    public void sweets(View view){
        for(int i = 0; i < 16; i++){
            chosen[i] = false;
        }
        chosen[5] = true;
        lookAtTable(5);
        Button sweetsButton = (Button) findViewById(R.id.sweets);
        sweetsButton.setTextColor(Color.parseColor("#000000"));

    }
    public void bread(View view){
        for(int i = 0; i < 16; i++){
            chosen[i] = false;
        }
        chosen[6] = true;
        lookAtTable(6);
        Button breadButton = (Button) findViewById(R.id.bread);
        breadButton.setTextColor(Color.parseColor("#000000"));

    }
    public void sourFruits(View view){
        for(int i = 0; i < 16; i++){
            chosen[i] = false;
        }
        chosen[7] = true;
        lookAtTable(7);
        Button sourFrButton = (Button) findViewById(R.id.sour_fruits);
        sourFrButton.setTextColor(Color.parseColor("#000000"));

    }
    public void semiSweetFruits(View view){
        for(int i = 0; i < 16; i++){
            chosen[i] = false;
        }
        chosen[8] = true;
        lookAtTable(8);
        Button semiSweetFrButton = (Button) findViewById(R.id.semi_sour_ruits);
        semiSweetFrButton.setTextColor(Color.parseColor("#000000"));

    }
    public void sweetFruits(View view){
        for(int i = 0; i < 16; i++){
            chosen[i] = false;
        }
        chosen[9] = true;
        lookAtTable(9);
        Button sweetFrButton = (Button) findViewById(R.id.sweet_fruits);
        sweetFrButton.setTextColor(Color.parseColor("#000000"));

    }
    public void greenVegs(View view){
        for(int i = 0; i < 16; i++){
            chosen[i] = false;
        }
        chosen[10] = true;
        lookAtTable(10);
        Button greenVegButton = (Button) findViewById(R.id.greenvegs);
        greenVegButton.setTextColor(Color.parseColor("#000000"));

    }
    public void otherVegs(View view){
        for(int i = 0; i < 16; i++){
            chosen[i] = false;
        }
        chosen[11] = true;
        lookAtTable(11);
        Button otherVegButton = (Button) findViewById(R.id.othervegs);
        otherVegButton.setTextColor(Color.parseColor("#000000"));

    }
    public void fermented(View view){
        for(int i = 0; i < 16; i++){
            chosen[i] = false;
        }
        chosen[12] = true;
        lookAtTable(12);
        Button fermentedButton = (Button) findViewById(R.id.fermented);
        fermentedButton.setTextColor(Color.parseColor("#000000"));

    }
    public void cheese(View view){
        for(int i = 0; i < 16; i++){
            chosen[i] = false;
        }
        chosen[13] = true;
        lookAtTable(13);
        Button cheeseButton = (Button) findViewById(R.id.cheese);
        cheeseButton.setTextColor(Color.parseColor("#000000"));
    }
    public void eggs(View view){
        for(int i = 0; i < 16; i++){
            chosen[i] = false;
        }
        chosen[14] = true;
        lookAtTable(14);
        Button eggsButton = (Button) findViewById(R.id.eggs);
        eggsButton.setTextColor(Color.parseColor("#000000"));
    }
    public void nuts(View view){
        for(int i = 0; i < 16; i++){
            chosen[i] = false;
        }
        chosen[15] = true;
        lookAtTable(15);
        Button nutsButton = (Button) findViewById(R.id.nuts);
        nutsButton.setTextColor(Color.parseColor("#000000"));
    }
    public void about(View view){
        Intent aboutIntent = new Intent(this, AboutActivity.class);
        startActivity(aboutIntent);
    }
    public void info(View view) {
        int numForInfo = 0;
        Intent infoIntent = new Intent(this, InfoActivity.class);
        for (int i = 0; i < 16; i++) {
            if (chosen[i]) {
                numForInfo = i;
                Log.v("MainActivity", "The chosen true is number " + i);
                break;
            }
        }
        infoIntent.putExtra("putNumber", numForInfo);
        startActivity(infoIntent);
    }
    public void lookAtTable (int category){
        Log.v("MainActivity", "We are in lookAtTable");
        for(int i = 0; i < 16; i++){
            if(table[category][i] == 0){
                red(i);
                Log.v("MainActivity", "We go to red");
            }
            if (table[category][i] == 1) {
                green(i);
                Log.v("MainActivity", "We go to green");
            }
        }
    }

    public void green(int chosenNumber) {
        switch (chosenNumber) {
            case 0: {
                Button meatButton = (Button) findViewById(R.id.meat);
                meatButton.setTextColor(Color.parseColor("#4CAF50"));
                break;
            }
            case 1: {
                Button beanButton = (Button) findViewById(R.id.beans);
                beanButton.setTextColor(Color.parseColor("#4CAF50"));
            }
            case 2: {
                Button butterButton = (Button) findViewById(R.id.butter);
                butterButton.setTextColor(Color.parseColor("#4CAF50"));
                break;
            }
            case 3: {
                Button creamButton = (Button) findViewById(R.id.sour_cream);
                creamButton.setTextColor(Color.parseColor("#4CAF50"));
                ;
                break;
            }
            case 4: {
                Button oilButton = (Button) findViewById(R.id.oils);
                oilButton.setTextColor(Color.parseColor("#4CAF50"));
                break;
            }
            case 5: {
                Button sweetsButton = (Button) findViewById(R.id.sweets);
                sweetsButton.setTextColor(Color.parseColor("#4CAF50"));
                ;
                break;
            }
            case 6: {
                Button breadButton = (Button) findViewById(R.id.bread);
                breadButton.setTextColor(Color.parseColor("#4CAF50"));
                break;
            }
            case 7: {
                Button sourFrButton = (Button) findViewById(R.id.sour_fruits);
                sourFrButton.setTextColor(Color.parseColor("#4CAF50"));
                break;
            }
            case 8: {
                Button semiSweetFrButton = (Button) findViewById(R.id.semi_sour_ruits);
                semiSweetFrButton.setTextColor(Color.parseColor("#4CAF50"));
                break;
            }
            case 9: {
                Button sweetFrButton = (Button) findViewById(R.id.sweet_fruits);
                sweetFrButton.setTextColor(Color.parseColor("#4CAF50"));
                break;
            }
            case 10: {
                Button greenVegButton = (Button) findViewById(R.id.greenvegs);
                greenVegButton.setTextColor(Color.parseColor("#4CAF50"));
                break;
            }
            case 11: {
                Button otherVegButton = (Button) findViewById(R.id.othervegs);
                otherVegButton.setTextColor(Color.parseColor("#4CAF50"));
                break;
            }
            case 12: {
                Button fermentedButton = (Button) findViewById(R.id.fermented);
                fermentedButton.setTextColor(Color.parseColor("#4CAF50"));
                break;
            }
            case 13: {
                Button cheeseButton = (Button) findViewById(R.id.cheese);
                cheeseButton.setTextColor(Color.parseColor("#4CAF50"));
                break;
            }
            case 14: {
                Button eggsButton = (Button) findViewById(R.id.eggs);
                eggsButton.setTextColor(Color.parseColor("#4CAF50"));
                break;
            }
            case 15: {
                Button nutsButton = (Button) findViewById(R.id.nuts);
                nutsButton.setTextColor(Color.parseColor("#4CAF50"));
                break;
            }
        }
    }
    public void red (int chosenNumber){
        switch (chosenNumber){
            case 0: {
                Button meatButton = (Button) findViewById(R.id.meat);
                meatButton.setTextColor(Color.parseColor("#D50000"));
                break;
            }
            case 1:{
                Button beanButton = (Button) findViewById(R.id.beans);
                beanButton.setTextColor(Color.parseColor("#D50000"));
            }
            case 2: {
                Button butterButton = (Button) findViewById(R.id.butter);
                butterButton.setTextColor(Color.parseColor("#D50000"));
                break;
            }
            case 3:{
                Button creamButton = (Button) findViewById(R.id.sour_cream);
                creamButton.setTextColor(Color.parseColor("#D50000"));
                ;
                break;
            }
            case 4:{
                Button oilButton = (Button) findViewById(R.id.oils);
                oilButton.setTextColor(Color.parseColor("#D50000"));
                break;
            }
            case 5:{
                Button sweetsButton = (Button) findViewById(R.id.sweets);
                sweetsButton.setTextColor(Color.parseColor("#D50000"));
                ;
                break;
            }
            case 6:{
                Button breadButton = (Button) findViewById(R.id.bread);
                breadButton.setTextColor(Color.parseColor("#D50000"));
                break;
            }
            case 7:{
                Button sourFrButton = (Button) findViewById(R.id.sour_fruits);
                sourFrButton.setTextColor(Color.parseColor("#D50000"));
                break;
            }
            case 8:{
                Button semiSweetFrButton = (Button) findViewById(R.id.semi_sour_ruits);
                semiSweetFrButton.setTextColor(Color.parseColor("#D50000"));
                break;
            }
            case 9:{
                Button sweetFrButton = (Button) findViewById(R.id.sweet_fruits);
                sweetFrButton.setTextColor(Color.parseColor("#D50000"));
                break;
            }
            case 10:{
                Button greenVegButton = (Button) findViewById(R.id.greenvegs);
                greenVegButton.setTextColor(Color.parseColor("#D50000"));
                break;
            }
            case 11:{
                Button otherVegButton = (Button) findViewById(R.id.othervegs);
                otherVegButton.setTextColor(Color.parseColor("#D50000"));
                break;
            }
            case 12:{
                Button fermentedButton = (Button) findViewById(R.id.fermented);
                fermentedButton.setTextColor(Color.parseColor("#D50000"));
                break;
            }
            case 13:{
                Button cheeseButton = (Button) findViewById(R.id.cheese);
                cheeseButton.setTextColor(Color.parseColor("#D50000"));
                break;
            }
            case 14:{
                Button eggsButton = (Button) findViewById(R.id.eggs);
                eggsButton.setTextColor(Color.parseColor("#D50000"));
                break;
            }
            case 15:{
                Button nutsButton = (Button) findViewById(R.id.nuts);
                nutsButton.setTextColor(Color.parseColor("#D50000"));
                break;
            }
        }
    }

}
