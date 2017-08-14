package com.example.android.courtcounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreTeamA = 0;
    int scoreTeamB = 0;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    public void threePointA(View v){
        displayForTeamA(scoreTeamA+=3);
    }

    public void twoPointA(View v){
        displayForTeamA(scoreTeamA+=2);
    }

    public void freePointA(View v){
        displayForTeamA(scoreTeamA+=1);
    }

    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    public void threePointB(View v){
        displayForTeamB(scoreTeamB+=3);
    }

    public void twoPointB(View v){
        displayForTeamB(scoreTeamB+=2);
    }

    public void freePointB(View v){
        displayForTeamB(scoreTeamB+=1);
    }

    public void reset(View v){
        scoreTeamA = 0;
        scoreTeamB = 0;
        displayForTeamA(0);
        displayForTeamB(0);
    }
}
