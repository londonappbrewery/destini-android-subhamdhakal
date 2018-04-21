package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    private TextView mQuestionTextView;
    private Button mFirstButton;
    private Button mSecondButton;
    private int mStoryIndex=1;


    // TODO: Steps 4 & 8 - Declare member variables here:

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:
        mQuestionTextView=findViewById(R.id.storyTextView);
        mFirstButton=findViewById(R.id.buttonTop);
        mSecondButton=findViewById(R.id.buttonBottom);

        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:
        mFirstButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mStoryIndex==1) {
                    mQuestionTextView.setText(R.string.T3_Story);
                    mFirstButton.setText(R.string.T3_Ans1);
                    mSecondButton.setText(R.string.T3_Ans2);
                    mStoryIndex=3;
                }else if(mStoryIndex==3){
                    mQuestionTextView.setText(R.string.T6_End);
                    mFirstButton.setVisibility(View.GONE);
                    mSecondButton.setVisibility(View.GONE);
                }else if(mStoryIndex==2){
                    mQuestionTextView.setText(R.string.T3_Story);
                    mStoryIndex=3;
                }
            }
        });


        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:
        mSecondButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mStoryIndex==1){
                    mQuestionTextView.setText(R.string.T2_Story);
                    mFirstButton.setText(R.string.T2_Ans1);
                    mSecondButton.setText(R.string.T2_Ans2);
                    mStoryIndex=2;
                }else if(mStoryIndex==2){
                    mQuestionTextView.setText(R.string.T4_End);
                    mFirstButton.setVisibility(View.GONE);
                    mSecondButton.setVisibility(View.GONE);

                }else if(mStoryIndex==3){
                    mQuestionTextView.setText(R.string.T5_End);
                    mFirstButton.setVisibility(View.GONE);
                    mSecondButton.setVisibility(View.GONE);


                }
            }
        });
    }
}
