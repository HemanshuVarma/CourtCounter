package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreTeamA = 0;
    int scoreTeamB = 0;
    TextView ScoreA;
    TextView ScoreB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ScoreA = findViewById(R.id.team_a_score);
        ScoreB = findViewById(R.id.team_b_score);

    }

    @Override
    protected void onSaveInstanceState(Bundle scoreTextView) {
        super.onSaveInstanceState(scoreTextView);
        scoreTextView.putInt("TeamAScore", scoreTeamA);
        scoreTextView.putInt("TeamBScore", scoreTeamB);
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        scoreTeamA = savedInstanceState.getInt("TeamAScore");
        scoreTeamB = savedInstanceState.getInt("TeamBScore");
        colorText();

    }

    /**
     * Displays the given score for Team A.
     */
    private void displayForTeamA(int score) {
        colorText();
        ScoreA.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Team B.
     */
    private void displayForTeamB(int score) {
        colorText();
        ScoreB.setText(String.valueOf(score));
    }

    /**
     * Adds 3 and Displays the score for Team A.
     */
    public void addThreeForTeamA(View view) {
        scoreTeamA = scoreTeamA + 3;
        displayForTeamA(scoreTeamA);
    }

    /**
     * Adds 2 and Displays the score for Team A.
     */
    public void addTwoForTeamA(View view) {
        scoreTeamA = scoreTeamA + 2;
        displayForTeamA(scoreTeamA);
    }

    /**
     * Adds 1 and Displays the score for Team A.
     */
    public void addOneForTeamA(View view) {
        scoreTeamA = scoreTeamA + 1;
        displayForTeamA(scoreTeamA);
    }

    /**
     * Adds 3 and Displays the score for Team B.
     */
    public void addThreeForTeamB(View view) {
        scoreTeamB = scoreTeamB + 3;
        displayForTeamB(scoreTeamB);
    }

    /**
     * Adds 2 and Displays the score for Team B.
     */
    public void addTwoForTeamB(View view) {
        scoreTeamB = scoreTeamB + 2;
        displayForTeamB(scoreTeamB);
    }

    /**
     * Adds 1 and Displays the score for Team B.
     */
    public void addOneForTeamB(View view) {
        scoreTeamB = scoreTeamB + 1;
        displayForTeamB(scoreTeamB);
    }

    /**
     * Resets the Score of Team A and Team B.
     */
    public void reset(View view) {
        scoreTeamA = scoreTeamB = 0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
    }

    /**
     * Sets the TextColor for Team A and Team B.
     */
    public void colorText() {
        if (scoreTeamA > scoreTeamB) {
            ScoreA.setTextColor(this.getResources().getColor(R.color.green)); //Green
            ScoreB.setTextColor(this.getResources().getColor(R.color.red)); //Red
        } else if (scoreTeamB > scoreTeamA) {
            ScoreA.setTextColor(this.getResources().getColor(R.color.red));//Red
            ScoreB.setTextColor(this.getResources().getColor(R.color.green)); //Green
        } else if (scoreTeamA == 0 && scoreTeamB == 0) {
            ScoreA.setTextColor(this.getResources().getColor(R.color.white));//White
            ScoreB.setTextColor(this.getResources().getColor(R.color.white));//White
        } else {
            ScoreA.setTextColor(this.getResources().getColor(R.color.orange));//Orange
            ScoreB.setTextColor(this.getResources().getColor(R.color.orange)); //Orange
        }
    }
}
