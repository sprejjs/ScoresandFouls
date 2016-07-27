package com.spreys.scoresandfouls;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    private int teamA_Score = 0;
    private int teamA_Fauls = 0;

    private int teamB_Score = 0;
    private int teamB_Fauls = 0;

    @BindView(R.id.txt_faults_team_a)
    TextView txt_teamA_fauls;

    @BindView(R.id.txt_faults_team_b)
    TextView txt_teamB_fauls;

    @BindView(R.id.txt_scores_team_a)
    TextView txt_teamA_scores;

    @BindView(R.id.txt_scores_team_b)
    TextView txt_teamB_scores;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);

        updatesScores();
    }

    @OnClick(R.id.btn_count_scores_team_a)
    public void addScoreTeamA() {
        teamA_Score++;
        updatesScores();
    }

    @OnClick(R.id.btn_count_fault_team_a)
    public void addFaulTeamA() {
        teamA_Fauls++;
        updatesScores();
    }

    @OnClick(R.id.btn_count_scores_team_b)
    public void addScoreTeamB() {
        teamB_Score++;
        updatesScores();
    }

    @OnClick(R.id.btn_count_fault_team_b)
    public void addFaulTeamB() {
        teamB_Fauls++;
        updatesScores();
    }

    @OnClick(R.id.btn_restart)
    public void onRestart() {
        teamA_Fauls = 0;
        teamB_Fauls = 0;
        teamA_Score = 0;
        teamB_Score = 0;

        updatesScores();
    }

    private void updatesScores() {
        txt_teamA_fauls.setText(String.valueOf(teamA_Fauls));
        txt_teamB_fauls.setText(String.valueOf(teamB_Fauls));
        txt_teamA_scores.setText(String.valueOf(teamA_Score));
        txt_teamB_scores.setText(String.valueOf(teamB_Score));
    }
}
