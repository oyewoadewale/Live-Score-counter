package com.example.adewale.russialivescores;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreTeamNigeria = 0;
    int scoreTeamArgentina = 0;

    int freekickTeamNigeria = 0;
    int freekickTeamArgentina = 0;

    int cornerkickTeamNigeria = 0;
    int cornerkickTeamArgentina = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
// This metod adds up one goals to team Nigeria score

    public void addOneForTeamNigeria(View view) {
        scoreTeamNigeria = scoreTeamNigeria + 1;
        displayForTeamNigeria(scoreTeamNigeria);
    }

    // This metod adds up one goals to team Argentina score
    public void addOneForTeamArgentina(View view) {
        scoreTeamArgentina = scoreTeamArgentina + 1;
        displayForTeamArgentina(scoreTeamArgentina);
    }

    // This metod adds up one free kick for team Nigeria

    public void addFreekickForTeamNigeria(View view) {
        freekickTeamNigeria = freekickTeamNigeria + 1;
        displayFreekickTeamNigeria(freekickTeamNigeria);
    }

    // This metod adds up one free kick for team Argentina
    public void addFreekickForTeamArgentina(View view) {
        freekickTeamArgentina = freekickTeamArgentina + 1;
        displayFreekickTeamArgentina(freekickTeamArgentina);
    }

    // This metod adds up one Corner kick for team Nigeria

    public void addcornerkickForTeamNigeria(View view) {
        cornerkickTeamNigeria = cornerkickTeamNigeria + 1;
        displayCornerkickNigeria(cornerkickTeamNigeria);
    }

    // This metod adds up one corner kick for team Argentina
    public void addcornerkickForTeamArgentina(View view) {
        cornerkickTeamArgentina = cornerkickTeamArgentina + 1;
        displayCornerkickTeamArgentina(cornerkickTeamArgentina);
    }


    /**
     * This method resets the scores for both team
     **/
    public void resetAll(View v) {

        freekickTeamNigeria = 0;
        freekickTeamArgentina = 0;

        cornerkickTeamNigeria = 0;
        cornerkickTeamArgentina = 0;

        scoreTeamNigeria = 0;
        scoreTeamArgentina = 0;

        displayForTeamArgentina(scoreTeamArgentina);
        displayForTeamNigeria(scoreTeamNigeria);

        displayFreekickTeamNigeria(freekickTeamNigeria);
        displayFreekickTeamArgentina(freekickTeamArgentina);


        displayCornerkickTeamArgentina(cornerkickTeamArgentina);
        displayCornerkickNigeria(cornerkickTeamNigeria);


    }

    /**
     * Displays the given score for Team Nigeria.
     */
    public void displayForTeamNigeria(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Team Argentina
     */
    public void displayForTeamArgentina(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));

    }

    /**
     * Displays the given freekick for Team Nigeria.
     */
    public void displayFreekickTeamNigeria(int freekickTeamNigeria) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_freekick);
        scoreView.setText(String.valueOf(freekickTeamNigeria));
    }

    /**
     * Displays the given freekick for Team Argentina.
     */
    public void displayFreekickTeamArgentina(int freekickTeamArgentina) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_freekick);
        scoreView.setText(String.valueOf(freekickTeamArgentina));

    }

    /**
     * Displays the given Cornerkick for Team Nigeria.
     */
    public void displayCornerkickNigeria(int cornerkickTeamNigeria) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_cornerkick);
        scoreView.setText(String.valueOf(cornerkickTeamNigeria));
    }

    /**
     * Displays the given score for Team Argentina.
     */
    public void displayCornerkickTeamArgentina(int cornerkickTeamArgentina) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_cornerkick);
        scoreView.setText(String.valueOf(cornerkickTeamArgentina));

    }

}