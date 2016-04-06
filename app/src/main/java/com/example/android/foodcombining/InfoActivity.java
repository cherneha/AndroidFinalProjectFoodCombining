package com.example.android.foodcombining;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import android.view.View;

public class InfoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);
        Intent intent = getIntent();
        int number = intent.getIntExtra("putNumber", 100);
        TextView infoTextView1 = (TextView) findViewById(R.id.info_text);
        TextView detailsTextView = (TextView) findViewById(R.id.detailed_info);
        TextView digestTextView = (TextView) findViewById(R.id.digestion);
        String forLog = "hey hey hey! " + number;
        Log.v("MainActivity",forLog);
        switch (number){
            case 0: {
                infoTextView1.setText(getText(R.string.meatS));
                detailsTextView.setText(getText(R.string.meatText));
                digestTextView.setText(getText(R.string.meatD));
                break;
            }
            case 1:{
                infoTextView1.setText(getText(R.string.beansS));
                detailsTextView.setText(getText(R.string.beansText));
                digestTextView.setText(getText(R.string.beansD));
                break;
            }
            case 2: {
                infoTextView1.setText(getText(R.string.butterS));
                detailsTextView.setText(getText(R.string.butterText));
                digestTextView.setText(getText(R.string.butterD));
                break;
            }
            case 3:{
                infoTextView1.setText(getText(R.string.creamS));
                detailsTextView.setText(getText(R.string.creamText));
                digestTextView.setText(getText(R.string.creanD));
                break;
            }
            case 4:{
                infoTextView1.setText(getText(R.string.oilsS));
                detailsTextView.setText(getText(R.string.oilsText));
                digestTextView.setText(getText(R.string.oilD));
                break;
            }
            case 5:{
                infoTextView1.setText(getText(R.string.sweetsS));
                detailsTextView.setText(getText(R.string.sweetsText));
                digestTextView.setText(getText(R.string.sweetD));
                break;
            }
            case 6:{
                infoTextView1.setText(getText(R.string.breadS));
                detailsTextView.setText(getText(R.string.breadText));
                digestTextView.setText(getText(R.string.breadD));
                break;
            }
            case 7:{
                infoTextView1.setText(getText(R.string.sourfrS));
                detailsTextView.setText(getText(R.string.sourFrText));
                digestTextView.setText(getText(R.string.acidicD));
                break;
            }
            case 8:{
                infoTextView1.setText(getText(R.string.semisourfrS));
                detailsTextView.setText(getText(R.string.halfSourFrText));
                digestTextView.setText(getText(R.string.semisweetD));
                break;
            }
            case 9:{
                infoTextView1.setText(getText(R.string.sweetfrS));
                detailsTextView.setText(getText(R.string.sweetFrText));
                digestTextView.setText(getText(R.string.sweetFrD));
                break;
            }
            case 10:{
                infoTextView1.setText(getText(R.string.greenvegsS));
                detailsTextView.setText(getText(R.string.greenVText));
                digestTextView.setText(getText(R.string.greenD));
                break;
            }
            case 11:{
                infoTextView1.setText(getText(R.string.othervegsS));
                detailsTextView.setText(getText(R.string.otherVText));
                digestTextView.setText(getText(R.string.otherD));
                break;
            }
            case 12:{
                infoTextView1.setText(getText(R.string.fermenS));
                detailsTextView.setText(getText(R.string.fermentedText));
                digestTextView.setText(getText(R.string.fermentD));
                break;
            }
            case 13:{
                infoTextView1.setText(getText(R.string.cheeseS));
                detailsTextView.setText(getText(R.string.cheeseText));
                digestTextView.setText(getText(R.string.cheeseD));
                break;
            }
            case 14:{
                infoTextView1.setText(getText(R.string.eggsS));
                detailsTextView.setText(getText(R.string.eggsText));
                digestTextView.setText(getText(R.string.eggD));
                break;
            }
            case 15:{
                infoTextView1.setText(getText(R.string.nutsS));
                detailsTextView.setText(getText(R.string.nutsText));
                digestTextView.setText(getText(R.string.nutsD));
                break;
            }
        }

    }

}
