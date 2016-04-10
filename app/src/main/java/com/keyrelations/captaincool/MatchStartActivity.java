package com.keyrelations.captaincool;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.facebook.AccessToken;

import org.w3c.dom.Text;

public class MatchStartActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_match_start);
        TextView tv = (TextView) findViewById(R.id.tossStatus);
        String toss = "";

        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            if (extras.getString("matchToss") != null) {
                toss = extras.getString("matchToss");
            }
        }

        if (toss != null) {
            if (toss.equals("1")) {
                if(tv!=null){
                    tv.setText("You are Batting first!");
                }

            }
            else{
                if(tv!=null){
                    tv.setText("You are Bowling first!");
                }
            }

        }
    }
}