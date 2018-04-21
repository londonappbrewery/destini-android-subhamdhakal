package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    TextView mQuestionTextView;
    Button mFirstButton;
    Button mSecondButton;
    int tracker;


    // TODO: Steps 4 & 8 - Declare member variables here:


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mFirstButton=findViewById(R.id.buttonTop);
        mSecondButton=findViewById(R.id.buttonBottom);
        mQuestionTextView=findViewById(R.id.storyTextView);

        mFirstButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mQuestionTextView.setText(R.string.T3_Story);
                mFirstButton.setText(R.string.T3_Ans1);
                mSecondButton.setText(R.string.T3_Ans2);
                mFirstButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        mQuestionTextView.setText(R.string.T6_End);
                        mFirstButton.setVisibility(View.GONE);
                        mSecondButton.setVisibility(View.GONE);
                    }
                });
                mSecondButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        mQuestionTextView.setText(R.string.T5_End);
                        mFirstButton.setVisibility(View.GONE);
                        mSecondButton.setVisibility(View.GONE);
                    }
                });

            }
        });
        mSecondButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mQuestionTextView.setText(R.string.T2_Story);
                mFirstButton.setText(R.string.T2_Ans1);
                mSecondButton.setText(R.string.T2_Ans2);
                mFirstButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        mQuestionTextView.setText(R.string.T3_Story);
                        mFirstButton.setText(R.string.T3_Ans1);
                        mSecondButton.setText(R.string.T3_Ans2);
                        mFirstButton.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                mQuestionTextView.setText(R.string.T6_End);
                                mFirstButton.setVisibility(View.GONE);
                                mSecondButton.setVisibility(View.GONE);
                            }
                        });
                        mSecondButton.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                mQuestionTextView.setText(R.string.T5_End);
                                mFirstButton.setVisibility(View.GONE);
                                mSecondButton.setVisibility(View.GONE);
                            }
                        });

                    }
                });
                mSecondButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        mQuestionTextView.setText(R.string.T4_End);
                        mFirstButton.setVisibility(View.GONE);
                        mSecondButton.setVisibility(View.GONE);
                    }
                });

            }
        });













        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:



        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:




        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:


    }
}
