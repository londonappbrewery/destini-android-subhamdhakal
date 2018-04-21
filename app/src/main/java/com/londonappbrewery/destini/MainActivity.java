package com.londonappbrewery.destini;

import android.os.NetworkOnMainThreadException;
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
    private int mIndex=1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mQuestionTextView=findViewById(R.id.storyTextView);
        mFirstButton=findViewById(R.id.buttonTop);
        mSecondButton=findViewById(R.id.buttonBottom);

        mFirstButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mIndex==1 || mIndex==2) {
                    mQuestionTextView.setText(R.string.T3_Story);
                    mFirstButton.setText(R.string.T3_Ans1);
                    mSecondButton.setText(R.string.T3_Ans2);
                    mIndex=3;
                }else{
                    mQuestionTextView.setText(R.string.T6_End);
                    mFirstButton.setVisibility(View.GONE);
                    mSecondButton.setVisibility(View.GONE);

                }
//

            }
        });

        mSecondButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (mIndex==1){
                    mQuestionTextView.setText(R.string.T2_Story);
                    mFirstButton.setText(R.string.T2_Ans1);
                    mSecondButton.setText(R.string.T2_Ans2);
                    mIndex=2;
                }else if(mIndex==2){
                    mQuestionTextView.setText(R.string.T4_End);
                    mFirstButton.setVisibility(View.GONE);
                    mSecondButton.setVisibility(View.GONE);
                }else{
                    mQuestionTextView.setText(R.string.T5_End);
                    mFirstButton.setVisibility(View.GONE);
                    mSecondButton.setVisibility(View.GONE);
                }


            }
        });
    }
}
